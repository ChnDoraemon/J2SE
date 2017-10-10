package J2SE;

import java.lang.reflect.Constructor;

public class ReflectGetConstructorDemo {
	public static void main(String[] args) throws Exception {
		// getOneConstructor();
		getAllConstructorS();
	}
	private static void getAllConstructorS() {
		Class clz = ReflectUserDemo.class;
		Constructor[] cons = clz.getConstructors();
		for (Constructor c : cons) {
			System.out.println(c);
		}
		Constructor[] dcons = clz.getDeclaredConstructors();
		for (Constructor c : dcons) {
			System.out.println(c);
		}
	}
	private static void getOneConstructor() throws Exception {
		Class clz = ReflectUserDemo.class;
		// 获取一个指定的公共构造器
		Constructor con = clz.getConstructor(String.class, int.class);
		Object ins = con.newInstance("碎花", 18);
		// 获取一个指定的私有构造器
		Constructor con2 = clz.getDeclaredConstructor(int.class, boolean.class);
		Object ins2 = con2.newInstance(14, false);
	}
}

class ReflectUserDemo {
	String name;
	int age;
	boolean married;
	public ReflectUserDemo(String name, int age, boolean married) {
		super();
		this.name = name;
		this.age = age;
		this.married = married;
	}
	public ReflectUserDemo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public ReflectUserDemo(int age) {
		super();
		this.age = age;
	}
	private ReflectUserDemo(int age, boolean married) {
		super();
		this.age = age;
		this.married = married;
	}
}
