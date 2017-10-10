package J2SE;

import java.util.Calendar;

public class Pra_DateCalendarDemo {
	public static String getThisMonth() {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		String endTime = c.getTime().toLocaleString();
		c.add(Calendar.DAY_OF_MONTH, -7);
		String beginTime = c.getTime().toLocaleString();
		System.out.println("开始时间:" + beginTime + " " + "结束时间" + endTime);
		return "开始时间:" + beginTime + " " + "结束时间" + endTime;
	}
	// 测试
	public static void main(String[] args) {
		String time = Pra_DateCalendarDemo.getThisMonth();
		System.out.println(time);
	}
}
