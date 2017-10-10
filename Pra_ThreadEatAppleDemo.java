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
		 * 1:使用继承方式创建线程,创建了三个对象启动了三个线程,也就无法访问同一个对象
		 */
		// new Apple("a1").start();
		// new Apple("a2").start();
		// new Apple("a3").start();
		// System.out.println("--------------------------------------");
		/*
		 * 2:使用实现方式创建线程,只创建了一个对象并用这一个对象启动了三个线程,三个线程可以访问同一个对象
		 */
		// Apple2 a = new Apple2();
		// new Thread(a, "a").start();
		// new Thread(a, "b").start();
		// new Thread(a, "c").start();
		/*
		 * 3:自身继承线程类再创建线程去访问其他类中的方法,这种方法还是new了两个线程实现类所以还是访问的是不同的对象
		 * (拓展)
		 */
//		Pra_ThreadEatAppleDemo p1 = new Pra_ThreadEatAppleDemo();
//		Pra_ThreadEatAppleDemo p2 = new Pra_ThreadEatAppleDemo();
//		p1.start();
//		p2.start();
		/*
		 * 4:使用线程构造器中的[public Thread(Runnable target)]来创建线程可以访问同一个类,这种方式和实现runnable接口相同
		 * (拓展)
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
