package J2SE;

public class BaseAutoBoxingDemo {
	public static void main(String[] args) {
		// �ֶ� װ��
		Integer integer = new Integer(18);// ͨ��������װ��
		Integer integer2 = Integer.valueOf(18);// ͨ������valueOfװ��(�Ƚ��Ƽ�,���л���)
		// �ֶ�����
		int age = integer.intValue();
		// �Զ�װ��
		Integer integer3 = 18;
		/*
		 * �ײ������ֶ�װ�� Integer integer3 = Integer.valueOf(18);
		 */
		// �Զ�����
		int age2 = integer;
		/*
		 * �ײ������ֶ����� int age2 = intager.valueOf();
		 */
		System.out.println("======================");
		// �Ѱ�װ�����ת��ΪString
		String str = integer.toString();
		// �ѻ�������ת��ΪString
		String str2 = 19 + "";
		// ��String����ת��Ϊ��װ����
			// ��ʽ1:ʹ�ð�װ���͵Ĺ�����
			Integer integer4 = new Integer(str);// Character�಻����,û�����������
			// ��ʽ2:ʹ�ð�װ���͵�valueOf����
			Integer integer5 = Integer.valueOf(str);
		// ��Stringת��Ϊ������������
		int age3 = Integer.parseInt(str);
		System.out.println("======================");
		Boolean b = new Boolean("xiaoqiang");//false Booleanֻ��true
		Boolean b2 = new Boolean(true);//true
		Boolean b3 = new Boolean("true");//true �ַ������͵�trueҲ����
		System.out.println(b+","+b2+","+b3);
		System.out.println("======================");
		

	}
}
