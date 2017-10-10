package J2SE;

public class BasePackagingCacheDemo {
public static void main(String[] args) {
	Integer i1 = new Integer(123);
	Integer i2 = new Integer(123);
	System.out.println(i1 == i2);//false
	Integer i3 =  Integer.valueOf(123);
	Integer i4 =  Integer.valueOf(123);
	System.out.println(i4 == i3);//true
	Integer i5 = 123;//使用valueOf方法
	Integer i6 = 123;//使用valueOf方法
	System.out.println(i5 == i6);//true 自动装箱底层使用的是valueOf方法
	System.out.println("--------------------------------------");
	Integer i11 = new Integer(200);
	Integer i22 = new Integer(200);
	System.out.println(i11 == i22);//false
	Integer i33 =  Integer.valueOf(200);
	Integer i44 =  Integer.valueOf(200);
	System.out.println(i44 == i33);//false,200不在[-128,127]之间."=="比较的是内存空间
	Integer i55 = 200;//使用valueOf方法
	Integer i66 = 200;//使用valueOf方法
	System.out.println(i55 == i66);//false,200不在[-128,127]之间.
	System.out.println("--------------------------------------");
	Integer i333 =  Integer.valueOf(200);
	Integer i444 =  Integer.valueOf(200);
	System.out.println(i44.equals(i33));//true,使用equals方法比较的字符串是否相等
	
	
}
}
