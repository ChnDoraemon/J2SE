package J2SE;

class OutterDemo {
	static String name = "Outter";
	int age;
	/*
	  void method(){ 
	  		String name2 = Inner.name;
	   	} 
	   	
	      ����ֱ�ӷ���ʵ���ڲ����еĳ�Ա,��Ҫͨ���ڲ���ĳ�Ա
	 */
	class Inner {
		// static String name ; ʵ���ڲ��಻��ӵ�о�̬��Ա
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
		static String name = "StaticInner_name"; // ��̬�ڲ������ӵ�о�̬��Ա
		int age;// ��̬�ڲ������ӵ��ʵ����Ա
		String name2 = OutterDemo.name;// ��̬�ڲ�����Է����ⲿ���еľ�̬��Ա
		// int age2 = Outter.age; ����:��̬�ڲ��಻�ܷ����ⲿ���е�ʵ����Ա
		static void method() {
			System.out.println(OutterDemo.name);// Outter �ⲿ��ľ�̬��Ա����ֱ������������
			new OutterDemo();
			System.out.println(OutterDemo.name);// Outter
			// �ⲿ��ľ�̬��ԱҲ���Դ�������������,�����ײ㻹��������������
			System.out.println(OutterDemo.StaticInner.name);// Inner
			// ��̬�ڲ���ľ�̬��Ա����ֱ��ʹ����������������
			new OutterDemo.StaticInner();
			System.out.println(StaticInner.name);// Inner Ҳ���Դ�����̬�ڲ���Ķ���������
		}
	}
}

public class ClassInnerClassDemo {
	public static void main(String[] args) {
		// new Inner(); �����Ҳ��������
		OutterDemo.Inner in = new OutterDemo().new Inner();// �����ڲ������ʱ����Ҫ���ⲿ��.�ڲ�������ʾ,������Ҫ����
		new OutterDemo().new Inner().method();
		OutterDemo.StaticInner In = new OutterDemo.StaticInner();// ������̬�ڲ��಻��Ҫ�����ⲿ�����
		System.out.println("--------------------------------------");
		OutterDemo.StaticInner.method();
		// new Outter().new StaticInner(); ����:Illegal enclosing instance
		// specification for type Outter.StaticInner �����ⲿ�����֮��Ͳ��ܵ��þ�̬�ڲ���
	}
}
