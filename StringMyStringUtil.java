package J2SE;

/*
 *	String类型数据经常使用的方法 
 */
public class StringMyStringUtil {
	private StringMyStringUtil() {}

	/*
	 *判断字符串是否为空引用或者空字符串
	 */
	public static boolean isBlank(String str) {
		return str == null || "".equals(str);
	}

	public static boolean hasLength(String str) {
		return !isBlank(str);
	}

	// 测试方法
	public static void main(String[] args) {
		System.out.println(StringMyStringUtil.hasLength(new String()));
	}
}
