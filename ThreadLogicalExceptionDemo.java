package J2SE;

//车子抛锚异常
class CarWrongExceptiongDemo extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public CarWrongExceptiongDemo(String message, Throwable cause) {
		super(message, cause);
	}
	public CarWrongExceptiongDemo(String message) {
		super(message);
	}
}

// 上班迟到异常
class LateExceptiongDemo extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public LateExceptiongDemo(String message, Throwable cause) {
		super(message, cause);
	}
	public LateExceptiongDemo(String message) {
		super(message);
	}
}

class WorkerDemo {
	public void go2Work(boolean b) {
		try {
			if (b) {
				System.out.println("boss I'm here");
			} else {
				throw new CarWrongExceptiongDemo("哎呀车子抛锚了");
			}
		}
		catch (CarWrongExceptiongDemo e) {
			throw new LateExceptiongDemo("哎呀老板我迟到了");
		}
	}
}

public class ThreadLogicalExceptionDemo {
	public static void main(String[] args) {
		WorkerDemo llq = new WorkerDemo();
		WorkerDemo zkg = new WorkerDemo();
		try {
			llq.go2Work(true);
			System.out.println("很好给llq发奖金");
			zkg.go2Work(false);
			System.out.println("很好给zkg发奖金");
		}
		catch (LateExceptiongDemo e) {
			e.printStackTrace();
			System.out.println("好了你们俩奖金都没了");
		}
	}
}
