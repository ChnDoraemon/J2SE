package J2SE;

import java.util.List;


abstract class BaseAbstractClassDemo {
	abstract void method();
	public void method(String name) {}
	// 抽象类中可以存在抽象方法和非抽象方法
	// private AbstractClass() {} 子类报错因为父类构造器私有化
	static void method2() {
		System.out.println("abstract static method");
	}// 抽象类可以有静态方法
}

class ABClass extends BaseAbstractClassDemo {// 作为抽象类就不用覆盖抽象父类中的方法
	@Override
	void method() {}
}

public class BaseAbstractDemo {
	public static void main(String[] args) {
		// new AbstractClass.method(); 创建抽象类的实例报错,因为抽象类不能创造实例
		BaseAbstractClassDemo.method2();// 可以调用抽象类中抽象方法
	}
	public  <T> List<T> method3(T a) {
		return null;
		
	}
}