package J2SE;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Producer2Demo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			if (i % 2 == 0) {
				Share2Demo.getIns().addNUM("���", "Ů");
			} else {
				Share2Demo.getIns().addNUM("����", "��");
			}
		}
	}
}

class Consumer2Demo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			Share2Demo.getIns().reduceNUM();
		}
	}
}

// ʹ��synchronized������ͨ��
class Share2Demo {
	private String name;
	private String sex;
	private static Share2Demo instance = new Share2Demo();
	private boolean isEmpty = true;
	private ReentrantLock lock = new ReentrantLock();
	private Condition c = lock.newCondition();
	private Share2Demo() {}
	public static Share2Demo getIns() {
		return instance;
	}
	public boolean isEmpty() {
		return isEmpty;
	}
	 public void reduceNUM() {
		 lock.lock();
		try {
			while (isEmpty) {// isEmpy == true û�в�Ʒ��
				c.await();// ֹͣ������,����������
			}
			// ���ѿ�ʼ,�������߻�������
			System.out.println("������" + this.name + this.sex);
			isEmpty = true;
			// ���ѽ���,����������
			c.signal();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		lock.unlock();
	}
	/*
	 * �����в�Ʒ��ʱ����������˯�߲��һ���������
	 */
	 public void addNUM(String name, String sex) {
		 lock.lock();
		try {
			while (!isEmpty) {// isEmpty == false �в�Ʒ
				// �ж��Ƿ��в�Ʒ,������������߽���˯��,��������������
				c.await();
			}
			// ������ʼ,�������߻��Ѽ�������
			this.name = name;
			Thread.sleep(10);
			this.sex = sex;
			System.out.println("������" + name + sex);
			// ��������,���������߽�������
			this.isEmpty = false;
			c.signal();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		lock.unlock();
	}
}

public class Pra_ThreadLockProducerConsumerDemo {
	
	public static void main(String[] args) {
		new Producer2Demo().start();
		new Consumer2Demo().start();
	}

}
