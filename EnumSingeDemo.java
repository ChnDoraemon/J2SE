package J2SE;

//标准单例模式
class ArrayUtilDemo {
	private ArrayUtilDemo() {};// 先私有化构造器
	private final static ArrayUtilDemo instance = new ArrayUtilDemo();// 创建出本类的实例对象并私有化
	// 向外暴露公共静态方法来获取自身实例
	public static ArrayUtilDemo getInstance() {
		return instance;
	}
	public void method() {
		System.out.println("single_method");
	}
}

// 使用enum创建单例模式
enum ArrayUtil2 {
	INSTANCE, For;
	public void method() {
		System.out.println("enum_method");
	}
}

public class EnumSingeDemo {
	public static void main(String[] args) {
		ArrayUtilDemo.getInstance().method();
		ArrayUtil2.INSTANCE.method();
	}
}
