package J2SE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReflectPropertiesDemo {
	public static void main(String[] args) throws Exception {
		// test1();
		// test2();
		test3();
	}
	private static void test3() throws Exception {
		// 使用相对路径来加载properties文件
		// 使用当前资源文件(字节码)的路径来加载,也就是resources
		// 创建一个properties的对象
		Properties p = new Properties();
		// 获取当前字节码相对路径的资源的输入流
		InputStream in = ReflectPropertiesDemo.class
				.getResourceAsStream("db.properties");
		p.load(in);
		System.out.println(p);
		//在字节码目录下要存在资源文件
	}
	private static void test2() throws Exception {
		// 使用相对路径来加载properties文件
		// 使用classloader来加载,此时是相对于classpath路径来加载
		// 创建一个properties的对象
		Properties p = new Properties();
		// 获取当前线程的classloader
		// 两种方式都行
		// ClassLoader cl = ReflectPropertiesDemo.class.getClassLoader();
		ClassLoader cl = Thread.currentThread().getContextClassLoader();
		InputStream in = cl.getResourceAsStream("db.properties");
		p.load(in);
		System.out.println(p);
	}
	private static void test1() throws Exception {
		// 创建一个properties的对象
		Properties p = new Properties();
		// 创建文件的输入流
		InputStream in = new FileInputStream(
				"D:/workspace/review/res/db.properties");
		// 加载properties文件
		p.load(in);
		System.out.println(p);
	}
}
