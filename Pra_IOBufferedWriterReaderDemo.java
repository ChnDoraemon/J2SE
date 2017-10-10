package J2SE;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Pra_IOBufferedWriterReaderDemo {
	public static void main(String[] args) throws Exception {
		/*
		 * 字节缓冲流
		 */
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				"file/stream.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("file/stream.txt"));
		bos.write('s');
		bos.write('s');
		bos.write('s');
		bos.write('s');
		bos.close();
		byte[] buffer = new byte[10];
		int len = -1;
		while ((len = bis.read(buffer)) != -1) {
			System.out.println(new String(buffer, 0, len));
		}
		bis.close();
		System.out.println("--------------------------------------");
		/*
		 * 字符缓冲流
		 */
		BufferedWriter bw = new BufferedWriter(new FileWriter("file/writer.txt"));
		BufferedReader br = new BufferedReader(new FileReader("file/writer.txt"));
		bw.write("我是天边最美的云彩");
		bw.write("\n");
		bw.write("我是哆啦A梦来自2112年,请多多指教");
		bw.close();
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}
}
