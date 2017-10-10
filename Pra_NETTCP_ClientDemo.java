package J2SE;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Pra_NETTCP_ClientDemo {
	public static void main(String[] args) throws Exception {
//		创建客户端对象并且连接服务器
		Socket client = new Socket("localhost", 8888);
		//获取客户端的输入流对象
		InputStream in = client.getInputStream();
		Scanner sc = new Scanner(in);
		while(sc.hasNext()){
			System.out.println(sc.next());
		}
		sc.close();
		client.close();
	}
}
