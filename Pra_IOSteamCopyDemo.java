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
		 * 方式1:传统关闭资源方式
		 */
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			// 创建输入和输出流对象
			in = new FileInputStream(new File("file/stream.txt"));
			out = new FileOutputStream(new File("file/stream_copy"));
			// 输入流读取
			byte[] buffer = new byte[10];
			int len;// 顶一个返回变量
			while ((len = in.read(buffer)) != -1) {
				// 输出流写出
				System.out.println(buffer.length);// 每次读取一定长度的字节
				out.write(buffer, 0, len);// 写出读取长度的字符
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
		 * 方式2:自动关闭资源	
		 */
		try (
		// 创建输入和输出流对象
		InputStream in1 = new FileInputStream(new File("file/stream.txt"));
				OutputStream out1 = new FileOutputStream(new File(
						"file/stream_copy"));) {
			// 输入流读取
			byte[] buffer = new byte[10];
			int len;// 顶一个返回变量
			while ((len = in1.read(buffer)) != -1) {
				// 输出流写出
				System.out.println(buffer.length);// 每次读取一定长度的字节
				out1.write(buffer, 0, len);// 写出读取长度的字符
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
