package J2SE;


public class StringDemo {
	private static String temp  = "ab";
	private static String method(){
		return "ab";
	}
	public static void main(String[] args) {
		String str = "abc";
		String str5 = "a"+"bc";
		String str6 = method()+"bc";
		String str7 = temp+"bc";
		String str4 = new String("abc");
		String str2 = "abc";
		String str3 = "bcd";
		System.out.println(str == str7);//false �������ӵ��ַ���Ҫ����ʱ����ȷ��
		System.out.println(str == str6);//false �������ص��ַ���Ҫ������ʱ����ȷ��
		System.out.println(str == str5);//true ƴ�ӵ��ַ����ڱ���ʱ��ת��Ϊ�����ַ���
		System.out.println(str == str4);//false ��ͬ�ַ������Ǵ�����ʽ��ͬ
		System.out.println(str == str2);//true ��ͬ�ַ����ڴ��ַ��ͬ
		System.out.println(str == str3);
		System.out.println(str.equals(str2));
	}
}
