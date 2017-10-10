package J2SE;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NETIPDemo {
	public static void main(String[] args) throws Exception {
		InetAddress ip = InetAddress.getByName("DESKTOP-V0GFC6V");// 根据主机名获取主机ip地址
		System.out.println(ip.toString());// DESKTOP-V0GFC6V/100.130.99.90
		System.out.println(ip.getHostAddress());// 获取主机地址 100.130.99.90
		System.out.println(ip.getHostName());// 获取主机名 DESKTOP-V0GFC6V
		System.out.println(InetAddress.getLocalHost());// 返回本机ip
														// DESKTOP-V0GFC6V/100.130.99.90
		System.out.println(InetAddress.getLocalHost().isReachable(1000));// 是否可以到达的
																			// false
	}
}
