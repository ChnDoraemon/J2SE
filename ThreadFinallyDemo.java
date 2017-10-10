package J2SE;

public class ThreadFinallyDemo {
	public static void main(String[] args) {
		System.out.println(method());
		System.out.println(method2());
		method3();
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		/*
		 * 2:测试finally语句在结束JVM之后还能不能正确关闭资源
		 */
		System.out.println("begin....");
		try {
			int a = 10 / 0;
		}
		catch (ArithmeticException e) {
			System.out.println("除数不能为零");
		}
		// finally正常运行
		finally {
			System.out.println("finally语句");
		}
		System.out.println("end....");
		System.out.println("--------------------------------------");
		System.out.println("begin....");
		try {
			int a = 10 / 0;
		}
		catch (ArithmeticException e) {
			System.out.println("除数不能为零");
			System.exit(10);
		}
		// finally并没有正常运行
		finally {
			System.out.println("finally语句");
		}
		System.out.println("end....");
	}
	/*
	 * 1:测试finally语句和return语句的执行先后
	 */
	// 返回输出的是finally中的内容,try中的return并没有作用
	private static String method() {
		try {
			return "tryBlock";
		}
		finally {
			return "finallyBlock";
		}
	}
	/*
	 * 2:测试finally语句中给变量做自增是否有用
	 */
	// 返回输出的是1,finally中的自增并没有用
	private static int method2() {
		int a = 1;
		try {
			return a;
		}
		finally {
			++a;
		}
	}
	/*
	 * 3:测试抛出异常之后finally语句是否会执行
	 */
	// 返回输出是true,就算是抛出了异常还是会执行finally中的返回
	private static void method3() {
		int a = 1;
		try {
			if (a == 1) {
				throw new RuntimeException();
			}
		}
		finally {
			System.out.println("finallyBlock");
		}
	}
	private static int method4() {
		return 12;
	}
}
