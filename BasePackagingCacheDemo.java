package J2SE;

public class BasePackagingCacheDemo {
public static void main(String[] args) {
	Integer i1 = new Integer(123);
	Integer i2 = new Integer(123);
	System.out.println(i1 == i2);//false
	Integer i3 =  Integer.valueOf(123);
	Integer i4 =  Integer.valueOf(123);
	System.out.println(i4 == i3);//true
	Integer i5 = 123;//ʹ��valueOf����
	Integer i6 = 123;//ʹ��valueOf����
	System.out.println(i5 == i6);//true �Զ�װ��ײ�ʹ�õ���valueOf����
	System.out.println("--------------------------------------");
	Integer i11 = new Integer(200);
	Integer i22 = new Integer(200);
	System.out.println(i11 == i22);//false
	Integer i33 =  Integer.valueOf(200);
	Integer i44 =  Integer.valueOf(200);
	System.out.println(i44 == i33);//false,200����[-128,127]֮��."=="�Ƚϵ����ڴ�ռ�
	Integer i55 = 200;//ʹ��valueOf����
	Integer i66 = 200;//ʹ��valueOf����
	System.out.println(i55 == i66);//false,200����[-128,127]֮��.
	System.out.println("--------------------------------------");
	Integer i333 =  Integer.valueOf(200);
	Integer i444 =  Integer.valueOf(200);
	System.out.println(i44.equals(i33));//true,ʹ��equals�����Ƚϵ��ַ����Ƿ����
	
	
}
}
