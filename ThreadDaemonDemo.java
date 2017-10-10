package J2SE;
class DaemonThreadDemo extends Thread{
	public void run(){
		for (int i = 0; i < 100; i++) {
			System.out.println("this is the Daemon Thread"+i);
		}
	}
}
public class ThreadDaemonDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println("mian Thread"+i);
			if (i == 10){
				DaemonThreadDemo d = new DaemonThreadDemo();
				d.setDaemon(true); // 需要先设置为守护线程 否则抛出java.lang.IllegalThreadStateException,该线程正在运行
				d.start();
			}
		}
	}
}
