package J2SE;

public class ClassLocalInnerClassDemo {
	static String name = "outter";
	int age;
	public static void main(String[] args) {
		final String work = "inner";
		class Inner {
			// static String name;����: ����ӵ�о�̬��Ա
			String name2 = ClassLocalInnerClassDemo.name;// ���Է����ⲿ��ľ�̬��Ա
			int age2 = new ClassLocalInnerClassDemo().age;// ���Է����ⲿ���ʵ����Ա
			void method() {
				System.out.println(name);
				// System.out.println(age); ����:ֻ�ܷ����ⲿ���еľ�̬��Ա����
				System.out.println(work);// ���ʷ����еľֲ�����ʱ��Ҫ����Ϊfinal
			}
		}
		new Inner().method();
	}
}
