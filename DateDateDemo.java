package J2SE;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateDateDemo {
	public static void main(String[] args) throws ParseException {
		/*
		 * Date��
		 */
		Date date = new Date();
		System.out.println(date);
		// ��long����ת��ΪDate����
		long time = System.currentTimeMillis();
		Date date2 = new Date(time);
		System.out.println(date2);
		// ��date����ת��Ϊlong����
		long time2 = date.getTime();
		System.out.println(time2);
		System.out.println("--------------------------------------");
		System.out.println(date.toLocaleString());
		System.out.println("--------------------------------------");
		/*
		 * DateFormat��
		 */
		Date d = new Date();
		System.out.println(d);
		// ��ʽ������ ��Date-->String
		String f = DateFormat.getInstance().format(d);
		System.out.println(f);
		// �������� ��String-->Date
		Date d2 = DateFormat.getInstance().parse(f);
		System.out.println(d2);
	}
}
