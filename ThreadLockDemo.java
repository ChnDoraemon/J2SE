package J2SE;

import java.util.concurrent.locks.ReentrantLock;

class Apple5Demo extends Thread {
	private int Applenum = 50;
	ReentrantLock lock = new ReentrantLock();
	public Apple5Demo(String name) {
		super(name);
	}
	@Override
	public void run() {
		// ���뷽���������
		lock.lock();
		try {
			for (int i = 0; i < Applenum; i++) {
				System.out.println(Thread.currentThread().getName()
						+ "had eated" + Applenum + "apple");
				Applenum--;
			}
		}
		finally {
			lock.unlock();
			// ���������⿪��
		}
	}
}

public class ThreadLockDemo {}
