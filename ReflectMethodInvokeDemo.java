package J2SE;

import java.lang.reflect.Method;

public class ReflectMethodInvokeDemo {
	public static void main(String[] args) throws Exception {
		methodInvoke();
	}
	private static void methodInvoke() throws Exception {
		Class clz = ReflectMethod2Demo.class;
		Method m = clz.getMethod("method", String.class);
		Object ret = m.invoke(clz.newInstance(), "lucy");
		System.out.println(ret);// output:lucy null/-1-->方法的返回值
		System.out.println("--------------------------------------");
		m = clz.getDeclaredMethod("method", int.class);
		// ret = m.invoke(clz.newInstance(),14);
		/*
		 * 错误:java.lang.IllegalAccessException: Class J2SE.ReflectInvokeDemo can not access a member of class J2SE.ReflectMethod2Demo with modifiers "private"
		 */
		m.setAccessible(true);
		ret = m.invoke(clz.newInstance(), 15);// -2
		System.out.println(ret);
		System.out.println("--------------------------------------");
		m = clz.getMethod("method", boolean.class);
		ret =m.invoke(null, true);
		System.out.println(ret);
	}
}

class ReflectMethod2Demo {
	public void method() {}
	public int method(String name) {
		System.out.println("output:" + name);
		return -1;
	}
	public static int method(boolean b) {
		return -3;
	}
	public void method(String name, int age) {}
	private int method(int age) {
		return -2;
	}
}