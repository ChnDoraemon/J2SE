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
		 * 2:����finally����ڽ���JVM֮���ܲ�����ȷ�ر���Դ
		 */
		System.out.println("begin....");
		try {
			int a = 10 / 0;
		}
		catch (ArithmeticException e) {
			System.out.println("��������Ϊ��");
		}
		// finally��������
		finally {
			System.out.println("finally���");
		}
		System.out.println("end....");
		System.out.println("--------------------------------------");
		System.out.println("begin....");
		try {
			int a = 10 / 0;
		}
		catch (ArithmeticException e) {
			System.out.println("��������Ϊ��");
			System.exit(10);
		}
		// finally��û����������
		finally {
			System.out.println("finally���");
		}
		System.out.println("end....");
	}
	/*
	 * 1:����finally����return����ִ���Ⱥ�
	 */
	// �����������finally�е�����,try�е�return��û������
	private static String method() {
		try {
			return "tryBlock";
		}
		finally {
			return "finallyBlock";
		}
	}
	/*
	 * 2:����finally����и������������Ƿ�����
	 */
	// �����������1,finally�е�������û����
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
	 * 3:�����׳��쳣֮��finally����Ƿ��ִ��
	 */
	// ���������true,�������׳����쳣���ǻ�ִ��finally�еķ���
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
