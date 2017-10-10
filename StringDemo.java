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
		System.out.println(str == str7);//false 变量连接的字符串要运行时才能确定
		System.out.println(str == str6);//false 方法返回的字符串要在运行时才能确定
		System.out.println(str == str5);//true 拼接的字符串在编译时就转化为完整字符串
		System.out.println(str == str4);//false 相同字符串但是创建方式不同
		System.out.println(str == str2);//true 相同字符串内存地址相同
		System.out.println(str == str3);
		System.out.println(str.equals(str2));
	}
}
