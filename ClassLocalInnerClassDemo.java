package J2SE;

public class ClassLocalInnerClassDemo {
	static String name = "outter";
	int age;
	public static void main(String[] args) {
		final String work = "inner";
		class Inner {
			// static String name;报错: 不能拥有静态成员
			String name2 = ClassLocalInnerClassDemo.name;// 可以访问外部类的静态成员
			int age2 = new ClassLocalInnerClassDemo().age;// 可以访问外部类的实例成员
			void method() {
				System.out.println(name);
				// System.out.println(age); 报错:只能访问外部类中的静态成员变量
				System.out.println(work);// 访问方法中的局部变量时需要设置为final
			}
		}
		new Inner().method();
	}
}
