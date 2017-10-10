package J2SE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;

public class Pra_IOGetProcessDemo {
	public static void main(String[] args) throws Exception {
		String str = "System.out.println(\"你是天边最美的云彩\")";
		eval(str);
	}
	private static void eval(String str) throws Exception {
		StringBuilder sb = new StringBuilder(1024);
		sb.append("public class Hello {");
		sb.append("public static void main(String[] args){");
		sb.append(str);
		sb.append(";");
		sb.append("}}");
		FileOutputStream out = new FileOutputStream("Hello.java");
		out.write(sb.toString().getBytes());
		out.close();
		// 调用javac来编译hello.java
		Process javacProcess = Runtime.getRuntime().exec(
				"javac Hello.java");
		// 获取错误信息
		InputStream errorStream = javacProcess.getErrorStream();
		// 读取错误信息]
		byte[] buffer = new byte[1024];
		int len = -1;
		while ((len = errorStream.read(buffer)) != -1) {
			System.out.println(new String(buffer, 0, len));
		}
		errorStream.close();
		// 调用java来运行Hello.class
		Process javaProcess = Runtime.getRuntime().exec("java Hello");
		InputStream info = javaProcess.getInputStream();
		while ((len = info.read(buffer)) != -1) {
			System.out.println(new String(buffer, 0, len));
		}
		info.close();
		// 删除java和class文件
		new File("Hello.java").delete();
		new File("Hello.class").delete();
	}
}
