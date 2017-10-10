package J2SE;

class PlayMusicDemo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Music...");
		}
	}
}

class PlayGamesDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Game...");
		}
	}

}
class ThreadTestDemo2  extends Thread{
	MusicDemo m = new MusicDemo();
	public static void main(String[] args) {
		ThreadTestDemo2 t1 = new ThreadTestDemo2();
		ThreadTestDemo2 t2 = new ThreadTestDemo2();
		t1.start();
		t2.start();
		
	}
	public void run() {
		m.method();
	}
}
class MusicDemo {
	int num = 50;
	public void method()  {
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(--num);
		}
	}
		
	
}

/*
 * 创建线程的两种方式
 */
 public class ThreadTestDemo {
	public static void main(String[] args) {
//		PlayMusic m = new PlayMusic();
//		m.start();
//		PlayGames g = new PlayGames();
//		new Thread(g).start();
//		/*
//		 * 使用匿名内部类创建线程
//		 */
//		new Thread() {
//			@Override
//			public void run() {
//				System.out.println("AnonymousInnerClass_Thread");
//			}
//		}.start();
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("AnonymousInnerClass_Runnable");
//			}
//		}).start();

	}

}
