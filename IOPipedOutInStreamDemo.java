package J2SE;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class IOPipedOutInStreamDemo {
	public static void main(String[] args) {
		AThread a = new AThread();
		BThread b = new BThread(a);
		a.start();
		b.start();
	}
}

class BThread extends Thread {
	PipedInputStream in = new PipedInputStream();
	public BThread(AThread a) {
		try {
			in.connect(AThread.getPiped());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		int len = -1;
		try {
			while ((len = in.read()) != -1) {
				System.out.println((char) len);
			}
			in.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class AThread extends Thread {
	static PipedOutputStream out = new PipedOutputStream();
	public static PipedOutputStream getPiped() {
		return out;
	}
	@Override
	public void run() {
		try {
			for (int i = 65; i < 65 + 26; i++) {
				out.write(i);
			}
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}