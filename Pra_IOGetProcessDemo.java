package J2SE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;

public class Pra_IOGetProcessDemo {
	public static void main(String[] args) throws Exception {
		String str = "System.out.println(\"��������������Ʋ�\")";
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
		// ����javac������hello.java
		Process javacProcess = Runtime.getRuntime().exec(
				"javac Hello.java");
		// ��ȡ������Ϣ
		InputStream errorStream = javacProcess.getErrorStream();
		// ��ȡ������Ϣ]
		byte[] buffer = new byte[1024];
		int len = -1;
		while ((len = errorStream.read(buffer)) != -1) {
			System.out.println(new String(buffer, 0, len));
		}
		errorStream.close();
		// ����java������Hello.class
		Process javaProcess = Runtime.getRuntime().exec("java Hello");
		InputStream info = javaProcess.getInputStream();
		while ((len = info.read(buffer)) != -1) {
			System.out.println(new String(buffer, 0, len));
		}
		info.close();
		// ɾ��java��class�ļ�
		new File("Hello.java").delete();
		new File("Hello.class").delete();
	}
}
