package J2SE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOScannerDemo {
	public static void main(String[] args) throws Exception {
//		Scanner sc = new Scanner(new File("file/writer.txt"));
//		Scanner sc = new Scanner("��������������һ�仨 \n ��仨��ѽô��ѽô����");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String line = sc.next();
			System.out.println(line);
		}
		sc.close();
	}
}
