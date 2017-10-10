package J2SE;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateDateDemo {
	public static void main(String[] args) throws ParseException {
		/*
		 * Date类
		 */
		Date date = new Date();
		System.out.println(date);
		// 将long类型转化为Date类型
		long time = System.currentTimeMillis();
		Date date2 = new Date(time);
		System.out.println(date2);
		// 将date类型转化为long类型
		long time2 = date.getTime();
		System.out.println(time2);
		System.out.println("--------------------------------------");
		System.out.println(date.toLocaleString());
		System.out.println("--------------------------------------");
		/*
		 * DateFormat类
		 */
		Date d = new Date();
		System.out.println(d);
		// 格式化操作 将Date-->String
		String f = DateFormat.getInstance().format(d);
		System.out.println(f);
		// 解析操作 将String-->Date
		Date d2 = DateFormat.getInstance().parse(f);
		System.out.println(d2);
	}
}
