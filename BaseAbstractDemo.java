package J2SE;

import java.util.List;


abstract class BaseAbstractClassDemo {
	abstract void method();
	public void method(String name) {}
	// �������п��Դ��ڳ��󷽷��ͷǳ��󷽷�
	// private AbstractClass() {} ���౨����Ϊ���๹����˽�л�
	static void method2() {
		System.out.println("abstract static method");
	}// ����������о�̬����
}

class ABClass extends BaseAbstractClassDemo {// ��Ϊ������Ͳ��ø��ǳ������еķ���
	@Override
	void method() {}
}

public class BaseAbstractDemo {
	public static void main(String[] args) {
		// new AbstractClass.method(); �����������ʵ������,��Ϊ�����಻�ܴ���ʵ��
		BaseAbstractClassDemo.method2();// ���Ե��ó������г��󷽷�
	}
	public  <T> List<T> method3(T a) {
		return null;
		
	}
}