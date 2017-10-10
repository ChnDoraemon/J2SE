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
		 * �ֽڻ�����
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
		 * �ַ�������
		 */
		BufferedWriter bw = new BufferedWriter(new FileWriter("file/writer.txt"));
		BufferedReader br = new BufferedReader(new FileReader("file/writer.txt"));
		bw.write("��������������Ʋ�");
		bw.write("\n");
		bw.write("���Ƕ���A������2112��,����ָ��");
		bw.close();
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}
}
