package J2SE;

//��׼����ģʽ
class ArrayUtilDemo {
	private ArrayUtilDemo() {};// ��˽�л�������
	private final static ArrayUtilDemo instance = new ArrayUtilDemo();// �����������ʵ������˽�л�
	// ���Ⱪ¶������̬��������ȡ����ʵ��
	public static ArrayUtilDemo getInstance() {
		return instance;
	}
	public void method() {
		System.out.println("single_method");
	}
}

// ʹ��enum��������ģʽ
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
