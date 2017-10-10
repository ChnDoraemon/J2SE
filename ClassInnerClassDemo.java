package J2SE;

class OutterDemo {
	static String name = "Outter";
	int age;
	/*
	  void method(){ 
	  		String name2 = Inner.name;
	   	} 
	   	
	      不能直接访问实例内部类中的成员,需要通过内部类的成员
	 */
	class Inner {
		// static String name ; 实例内部类不能拥有静态成员
		String name = "Inner";
		void method() {
			String name2 = OutterDemo.name;// Outter
			String name3 = OutterDemo.name;// Outter
			String name4 = this.name;// Inner
			System.out.println(name2);
			System.out.println(name3);
			System.out.println(name4);
		}
	}
	static class StaticInner {
		static String name = "StaticInner_name"; // 静态内部类可以拥有静态成员
		int age;// 静态内部类可以拥有实例成员
		String name2 = OutterDemo.name;// 静态内部类可以访问外部类中的静态成员
		// int age2 = Outter.age; 报错:静态内部类不能访问外部类中的实例成员
		static void method() {
			System.out.println(OutterDemo.name);// Outter 外部类的静态成员可以直接用类名调用
			new OutterDemo();
			System.out.println(OutterDemo.name);// Outter
			// 外部类的静态成员也可以创建对象来调用,不过底层还是用类名来调用
			System.out.println(OutterDemo.StaticInner.name);// Inner
			// 静态内部类的静态成员可以直接使用完整类名来访问
			new OutterDemo.StaticInner();
			System.out.println(StaticInner.name);// Inner 也可以创建静态内部类的对象来访问
		}
	}
}

public class ClassInnerClassDemo {
	public static void main(String[] args) {
		// new Inner(); 报错找不到这个类
		OutterDemo.Inner in = new OutterDemo().new Inner();// 创建内部类对象时类型要用外部类.内部类来表示,否则需要导入
		new OutterDemo().new Inner().method();
		OutterDemo.StaticInner In = new OutterDemo.StaticInner();// 创建静态内部类不需要创建外部类对象
		System.out.println("--------------------------------------");
		OutterDemo.StaticInner.method();
		// new Outter().new StaticInner(); 报错:Illegal enclosing instance
		// specification for type Outter.StaticInner 创建外部类对象之后就不能调用静态内部类
	}
}
