package J2SE;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Producer2Demo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			if (i % 2 == 0) {
				Share2Demo.getIns().addNUM("凤姐", "女");
			} else {
				Share2Demo.getIns().addNUM("春哥", "男");
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

// 使用synchronized方法来通信
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
			while (isEmpty) {// isEmpy == true 没有产品了
				c.await();// 停止消费者,唤醒生产者
			}
			// 消费开始,被生产者唤醒消费
			System.out.println("消费了" + this.name + this.sex);
			isEmpty = true;
			// 消费结束,唤醒生产者
			c.signal();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		lock.unlock();
	}
	/*
	 * 当还有产品的时候让生产者睡眠并且唤醒消费者
	 */
	 public void addNUM(String name, String sex) {
		 lock.lock();
		try {
			while (!isEmpty) {// isEmpty == false 有产品
				// 判断是否还有产品,如果有让生产者进入睡眠,唤醒消费者消费
				c.await();
			}
			// 生产开始,被消费者唤醒继续生产
			this.name = name;
			Thread.sleep(10);
			this.sex = sex;
			System.out.println("生产了" + name + sex);
			// 生产结束,唤醒消费者进行消费
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
