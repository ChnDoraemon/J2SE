package J2SE;

abstract class AbstractTimeCountDemo {
	public long countTime() {
		long begin = System.currentTimeMillis();
		this.count();
		long end = System.currentTimeMillis();
		long time = end - begin;
		return time;
	}

	abstract void count();
}

class StringOperateDemo extends AbstractTimeCountDemo {
	@Override
	void count() {
		String str = "";
		for (int i = 0; i < 10000;i++) {
			str += i;
		}
	}
	public long totalTime(){
		return super.countTime();
	}
}

public class Pra_BaseTemplateDesignDemo {
	public static void main(String[] args) {
		long time = new StringOperateDemo().totalTime();
		System.out.println(time);
	}
	

}
