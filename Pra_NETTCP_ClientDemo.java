package J2SE;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Pra_NETTCP_ClientDemo {
	public static void main(String[] args) throws Exception {
//		�����ͻ��˶��������ӷ�����
		Socket client = new Socket("localhost", 8888);
		//��ȡ�ͻ��˵�����������
		InputStream in = client.getInputStream();
		Scanner sc = new Scanner(in);
		while(sc.hasNext()){
			System.out.println(sc.next());
		}
		sc.close();
		client.close();
	}
}
