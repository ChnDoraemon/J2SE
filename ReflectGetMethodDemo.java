package J2SE;

import java.lang.reflect.Method;

public class ReflectGetMethodDemo {
	public static void main(String[] args) throws Exception {
		// getOneMethod();
		getAllMethod();
	}
	private static void getAllMethod() {
		Class clz = ReflectMethodDemo.class;
		// 获取所有的方法包括继承的父类方法,但是不包括自身的私有方法
		Method[] ms = clz.getMethods();
		for (Method m : ms) {
			System.out.println(m);
		}
		System.out.println("--------------------------------------");
		// 获取自身的所有的方法,包括自身的私有方法
		Method[] dms = clz.getDeclaredMethods();
		for (Method dm : dms) {
			System.out.println(dm);
		}
	}
	private static void getOneMethod() throws Exception {
		Class clz = ReflectMethodDemo.class;
		Method m = clz.getMethod("method", String.class);
		System.out.println(m);
		Method m2 = clz.getMethod("method");
		System.out.println(m2);
		Method dm = clz.getDeclaredMethod("method", int.class);
		System.out.println(dm);
	}
}

class ReflectMethodDemo {
	public void method() {}
	public void method(String name) {}
	public void method(String name, int age) {}
	private void method(int age) {}
}