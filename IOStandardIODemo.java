package J2SE;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class IOStandardIODemo {
	public static void main(String[] args) throws Exception {
		InputStream in = System.in;
		PrintStream out = System.out;
		int data = in.read();
		out.write(data);
		in.close();
		out.close();
		
	}
}
