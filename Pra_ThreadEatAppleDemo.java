package J2SE;

class AppleDemo extends Thread {
	private int Applenum = 50;

	public AppleDemo(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < Applenum; i++) {
			System.out.println(Thread.currentThread().getName() + "had eated"
					+ Applenum-- + "apple");

		}
	}
}

class Apple2Demo implements Runnable {
	private int Applenum = 50;

	@Override
	public void run() {
		for (int i = 0; i < Applenum; i++) {
			if (Applenum > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()
						+ "had eated" + Applenum-- + "apple");
			}
		}
	}
}

class Apple3Demo {
	private int AppleNum = 50;

	public void method() {
		for (int i = 0; i < AppleNum; i++) {
			System.out.println(Thread.currentThread().getName() + "had eated"
					+ AppleNum-- + "apple");

		}
	}
}

public class Pra_ThreadEatAppleDemo extends Thread {
	Apple3Demo a = new Apple3Demo();

	public static void main(String[] args) {
		/*
		 * 1:ʹ�ü̳з�ʽ�����߳�,�������������������������߳�,Ҳ���޷�����ͬһ������
		 */
		// new Apple("a1").start();
		// new Apple("a2").start();
		// new Apple("a3").start();
		// System.out.println("--------------------------------------");
		/*
		 * 2:ʹ��ʵ�ַ�ʽ�����߳�,ֻ������һ����������һ�����������������߳�,�����߳̿��Է���ͬһ������
		 */
		// Apple2 a = new Apple2();
		// new Thread(a, "a").start();
		// new Thread(a, "b").start();
		// new Thread(a, "c").start();
		/*
		 * 3:����̳��߳����ٴ����߳�ȥ�����������еķ���,���ַ�������new�������߳�ʵ�������Ի��Ƿ��ʵ��ǲ�ͬ�Ķ���
		 * (��չ)
		 */
//		Pra_ThreadEatAppleDemo p1 = new Pra_ThreadEatAppleDemo();
//		Pra_ThreadEatAppleDemo p2 = new Pra_ThreadEatAppleDemo();
//		p1.start();
//		p2.start();
		/*
		 * 4:ʹ���̹߳������е�[public Thread(Runnable target)]�������߳̿��Է���ͬһ����,���ַ�ʽ��ʵ��runnable�ӿ���ͬ
		 * (��չ)
		 */
		Pra_ThreadEatAppleDemo p1 = new Pra_ThreadEatAppleDemo();
		Thread t1 = new Thread(p1,"a");
		Thread t2 = new Thread(p1,"b");
		t1.start();
		t2.start();
		
	}

	@Override
	public void run() {
		a.method();
	}

}
