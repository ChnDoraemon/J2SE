package J2SE;

import java.util.Calendar;

public class DateCalendarDemo {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(Calendar.YEAR);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
	}
}
