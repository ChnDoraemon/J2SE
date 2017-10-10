package J2SE;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pra_DateDemo {
	private final static String DEFULT_DATE_PATTERN = "yyyy.MM.dd HH:mm:ss";
	// 格式化操作 Date -->String
	public static String date2String(Date date, String pattern) {
		if (StringMyStringUtil.isBlank(pattern)) {
			pattern = DEFULT_DATE_PATTERN;
		}
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern(pattern);
		return sdf.format(date);
	}
	public static String date2String(Date date) {
		return date2String(date, null);
	}
	// 解析操作(从用户方填写的String类型数据获取Date类型数据) String-->Date
	public static Date String2Date(String str, String pattern)
			throws ParseException {
		if (StringMyStringUtil.isBlank(pattern)) {
			pattern = DEFULT_DATE_PATTERN;
		}
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern(pattern);
		return sdf.parse(str);
	}
	public static Date String2Date(String str) throws ParseException {
		return String2Date(str, null);
	}
	// 测试
	public static void main(String[] args) throws ParseException {
		System.out.println(Pra_DateDemo.date2String(new java.util.Date(), ""));
		System.out.println(Pra_DateDemo.String2Date(Pra_DateDemo.date2String(
				new java.util.Date(), "")));
	}
}
