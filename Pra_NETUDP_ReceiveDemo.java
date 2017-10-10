package J2SE;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Pra_NETUDP_ReceiveDemo {
	public static void main(String[] args) throws Exception {
		DatagramSocket receive = new DatagramSocket(10086);
		byte[] buffer = new byte[1024];
		//接受数据
		DatagramPacket db = new DatagramPacket(buffer, 1024);
		receive.receive(db);
		//打印接受的数据
		String msg = new String(db.getData(),0,db.getLength());
		System.out.println(msg);
	}
}
