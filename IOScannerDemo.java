package J2SE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOScannerDemo {
	public static void main(String[] args) throws Exception {
//		Scanner sc = new Scanner(new File("file/writer.txt"));
//		Scanner sc = new Scanner("我是我是这样的一朵花 \n 这朵花好呀么好呀么艳丽");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String line = sc.next();
			System.out.println(line);
		}
		sc.close();
	}
}
