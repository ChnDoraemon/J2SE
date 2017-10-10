package J2SE;

public class BaseAutoBoxingDemo {
	public static void main(String[] args) {
		// 手动 装箱
		Integer integer = new Integer(18);// 通过构造器装箱
		Integer integer2 = Integer.valueOf(18);// 通过方法valueOf装箱(比较推荐,带有缓存)
		// 手动拆箱
		int age = integer.intValue();
		// 自动装箱
		Integer integer3 = 18;
		/*
		 * 底层是用手动装箱 Integer integer3 = Integer.valueOf(18);
		 */
		// 自动拆箱
		int age2 = integer;
		/*
		 * 底层是用手动拆箱 int age2 = intager.valueOf();
		 */
		System.out.println("======================");
		// 把包装类对象转换为String
		String str = integer.toString();
		// 把基本类型转换为String
		String str2 = 19 + "";
		// 把String类型转换为包装类型
			// 方式1:使用包装类型的构造器
			Integer integer4 = new Integer(str);// Character类不能用,没有这个构造器
			// 方式2:使用包装类型的valueOf方法
			Integer integer5 = Integer.valueOf(str);
		// 把String转换为基本数据类型
		int age3 = Integer.parseInt(str);
		System.out.println("======================");
		Boolean b = new Boolean("xiaoqiang");//false Boolean只认true
		Boolean b2 = new Boolean(true);//true
		Boolean b3 = new Boolean("true");//true 字符串类型的true也可以
		System.out.println(b+","+b2+","+b3);
		System.out.println("======================");
		

	}
}
