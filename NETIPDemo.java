package J2SE;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NETIPDemo {
	public static void main(String[] args) throws Exception {
		InetAddress ip = InetAddress.getByName("DESKTOP-V0GFC6V");// ������������ȡ����ip��ַ
		System.out.println(ip.toString());// DESKTOP-V0GFC6V/100.130.99.90
		System.out.println(ip.getHostAddress());// ��ȡ������ַ 100.130.99.90
		System.out.println(ip.getHostName());// ��ȡ������ DESKTOP-V0GFC6V
		System.out.println(InetAddress.getLocalHost());// ���ر���ip
														// DESKTOP-V0GFC6V/100.130.99.90
		System.out.println(InetAddress.getLocalHost().isReachable(1000));// �Ƿ���Ե����
																			// false
	}
}
