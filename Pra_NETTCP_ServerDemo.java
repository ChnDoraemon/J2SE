package J2SE;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Pra_NETTCP_ServerDemo {
	public static void main(String[] args) throws Exception {
		String str = "���Ƕ���A������2112������ָ��";
		ServerSocket server = new ServerSocket(8888);
		Socket client = server.accept();
		boolean is = true;
		OutputStream out = client.getOutputStream();
		PrintStream ps = new PrintStream(out);
		while (is) {
			System.out.println("���ӹ����Ŀͻ��˵�ַ" + client.getLocalAddress());
			ps.println(str);
		}
		ps.close();
		server.close();
	}
}
