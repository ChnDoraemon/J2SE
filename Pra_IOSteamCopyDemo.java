package J2SE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Pra_IOSteamCopyDemo {
	public static void main(String[] args) {
		/*
		 * ��ʽ1:��ͳ�ر���Դ��ʽ
		 */
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			// ������������������
			in = new FileInputStream(new File("file/stream.txt"));
			out = new FileOutputStream(new File("file/stream_copy"));
			// ��������ȡ
			byte[] buffer = new byte[10];
			int len;// ��һ�����ر���
			while ((len = in.read(buffer)) != -1) {
				// �����д��
				System.out.println(buffer.length);// ÿ�ζ�ȡһ�����ȵ��ֽ�
				out.write(buffer, 0, len);// д����ȡ���ȵ��ַ�
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (in != null) {
					in.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (out != null) {
					out.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void method() {
		/*
		 * ��ʽ2:�Զ��ر���Դ	
		 */
		try (
		// ������������������
		InputStream in1 = new FileInputStream(new File("file/stream.txt"));
				OutputStream out1 = new FileOutputStream(new File(
						"file/stream_copy"));) {
			// ��������ȡ
			byte[] buffer = new byte[10];
			int len;// ��һ�����ر���
			while ((len = in1.read(buffer)) != -1) {
				// �����д��
				System.out.println(buffer.length);// ÿ�ζ�ȡһ�����ȵ��ֽ�
				out1.write(buffer, 0, len);// д����ȡ���ȵ��ַ�
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
