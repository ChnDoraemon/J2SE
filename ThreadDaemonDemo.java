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
				d.setDaemon(true); // ��Ҫ������Ϊ�ػ��߳� �����׳�java.lang.IllegalThreadStateException,���߳���������
				d.start();
			}
		}
	}
}
