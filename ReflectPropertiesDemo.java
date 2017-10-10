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
		// ʹ�����·��������properties�ļ�
		// ʹ�õ�ǰ��Դ�ļ�(�ֽ���)��·��������,Ҳ����resources
		// ����һ��properties�Ķ���
		Properties p = new Properties();
		// ��ȡ��ǰ�ֽ������·������Դ��������
		InputStream in = ReflectPropertiesDemo.class
				.getResourceAsStream("db.properties");
		p.load(in);
		System.out.println(p);
		//���ֽ���Ŀ¼��Ҫ������Դ�ļ�
	}
	private static void test2() throws Exception {
		// ʹ�����·��������properties�ļ�
		// ʹ��classloader������,��ʱ�������classpath·��������
		// ����һ��properties�Ķ���
		Properties p = new Properties();
		// ��ȡ��ǰ�̵߳�classloader
		// ���ַ�ʽ����
		// ClassLoader cl = ReflectPropertiesDemo.class.getClassLoader();
		ClassLoader cl = Thread.currentThread().getContextClassLoader();
		InputStream in = cl.getResourceAsStream("db.properties");
		p.load(in);
		System.out.println(p);
	}
	private static void test1() throws Exception {
		// ����һ��properties�Ķ���
		Properties p = new Properties();
		// �����ļ���������
		InputStream in = new FileInputStream(
				"D:/workspace/review/res/db.properties");
		// ����properties�ļ�
		p.load(in);
		System.out.println(p);
	}
}
