package J2SE;

import java.lang.reflect.Constructor;

public class ReflectNewInstanceDemo {
	public static void main(String[] args) throws Exception {
		Class<?> clz = ReflectPersonDemo.class;
		Constructor<?> con = clz.getConstructor(String.class, int.class);
		con.newInstance("ss", 24);
		clz.newInstance();
		Constructor<?> dcon = clz.getDeclaredConstructor(String.class);
		// dcon.newInstance("11");
		/*
		 * 报错:java.lang.IllegalAccessException: ClassJ2SE.ReflectNewInstanceDemo can not access a member of class J2SE.ReflectPersonDemo with modifiers "private"
		 */
		dcon.setAccessible(true);
		dcon.newInstance("11");
		
	}
}

class ReflectPersonDemo {
	private ReflectPersonDemo(String name) {
		System.out.println("私有构造器");
	}
	public ReflectPersonDemo() {
		System.out.println("公共无参数构造器");
	}
	public ReflectPersonDemo(String name, int age) {
		System.out.println("公共有参数构造器");
	}
}