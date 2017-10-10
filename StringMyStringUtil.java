package J2SE;

/*
 *	String�������ݾ���ʹ�õķ��� 
 */
public class StringMyStringUtil {
	private StringMyStringUtil() {}

	/*
	 *�ж��ַ����Ƿ�Ϊ�����û��߿��ַ���
	 */
	public static boolean isBlank(String str) {
		return str == null || "".equals(str);
	}

	public static boolean hasLength(String str) {
		return !isBlank(str);
	}

	// ���Է���
	public static void main(String[] args) {
		System.out.println(StringMyStringUtil.hasLength(new String()));
	}
}
