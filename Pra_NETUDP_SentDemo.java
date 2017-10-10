package J2SE;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Pra_NETUDP_SentDemo {
	public static void main(String[] args) throws Exception {
		String str = "我是哆啦A梦来自2112年请多多指教";
		// 创建发送端对象
		DatagramSocket sent = new DatagramSocket(10010);
		DatagramPacket dp =new DatagramPacket(str.getBytes(),
				str.getBytes().length,
				InetAddress.getLocalHost(), 
				10086);
		sent.send(dp);
		sent.close();
	}
}
