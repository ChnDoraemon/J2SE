package J2SE;

class ProducerDemo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			if (i % 2 == 0) {
				ShareDemo.getIns().addNUM("���", "Ů");
			} else {
				ShareDemo.getIns().addNUM("����", "��");
			}
		}
	}
}

class ConsumerDemo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			ShareDemo.getIns().reduceNUM();
		}
	}
}

// ʹ��synchronized������ͨ��
class ShareDemo {
	private String name;
	private String sex;
	private static ShareDemo instance = new ShareDemo();
	private boolean isEmpty = true;
	private ShareDemo() {}
	public static ShareDemo getIns() {
		return instance;
	}
	public boolean isEmpty() {
		return isEmpty;
	}
	synchronized public void reduceNUM() {
		try {
			while (isEmpty) {// isEmpy == true û�в�Ʒ��
				this.wait();// ֹͣ������,����������
			}
			// ���ѿ�ʼ,�������߻�������
			System.out.println("������" + this.name + this.sex);
			isEmpty = true;
			// ���ѽ���,����������
			this.notify();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/*
	 * �����в�Ʒ��ʱ����������˯�߲��һ���������
	 */
	synchronized public void addNUM(String name, String sex) {
		try {
			while (!isEmpty) {// isEmpty == false �в�Ʒ
				// �ж��Ƿ��в�Ʒ,������������߽���˯��,��������������
				this.wait();
			}
			// ������ʼ,�������߻��Ѽ�������
			this.name = name;
			Thread.sleep(10);
			this.sex = sex;
			System.out.println("������" + name + sex);
			// ��������,���������߽�������
			this.isEmpty = false;
			this.notify();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Pra_ThreadSynchronizedProducerConsumerDemo {
	public static void main(String[] args) {
		new ProducerDemo().start();
		new ConsumerDemo().start();
	}
}
