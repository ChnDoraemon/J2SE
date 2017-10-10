package J2SE;

class ProducerDemo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			if (i % 2 == 0) {
				ShareDemo.getIns().addNUM("凤姐", "女");
			} else {
				ShareDemo.getIns().addNUM("春哥", "男");
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

// 使用synchronized方法来通信
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
			while (isEmpty) {// isEmpy == true 没有产品了
				this.wait();// 停止消费者,唤醒生产者
			}
			// 消费开始,被生产者唤醒消费
			System.out.println("消费了" + this.name + this.sex);
			isEmpty = true;
			// 消费结束,唤醒生产者
			this.notify();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/*
	 * 当还有产品的时候让生产者睡眠并且唤醒消费者
	 */
	synchronized public void addNUM(String name, String sex) {
		try {
			while (!isEmpty) {// isEmpty == false 有产品
				// 判断是否还有产品,如果有让生产者进入睡眠,唤醒消费者消费
				this.wait();
			}
			// 生产开始,被消费者唤醒继续生产
			this.name = name;
			Thread.sleep(10);
			this.sex = sex;
			System.out.println("生产了" + name + sex);
			// 生产结束,唤醒消费者进行消费
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
