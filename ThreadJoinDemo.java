package J2SE;

class JoinDemo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("Thread_Join" + i);
		}
	}
}

public class ThreadJoinDemo {
	public static void main(String[] args) throws Exception  {
		JoinDemo join = new JoinDemo();
		for (int i = 0; i < 50; i++) {
			System.out.println("main" + i);
			if (i == 20) {
				join.start();
				join.join();
			}
		}
	}
}
