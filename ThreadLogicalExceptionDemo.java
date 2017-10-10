package J2SE;

//������ê�쳣
class CarWrongExceptiongDemo extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public CarWrongExceptiongDemo(String message, Throwable cause) {
		super(message, cause);
	}
	public CarWrongExceptiongDemo(String message) {
		super(message);
	}
}

// �ϰ�ٵ��쳣
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
				throw new CarWrongExceptiongDemo("��ѽ������ê��");
			}
		}
		catch (CarWrongExceptiongDemo e) {
			throw new LateExceptiongDemo("��ѽ�ϰ��ҳٵ���");
		}
	}
}

public class ThreadLogicalExceptionDemo {
	public static void main(String[] args) {
		WorkerDemo llq = new WorkerDemo();
		WorkerDemo zkg = new WorkerDemo();
		try {
			llq.go2Work(true);
			System.out.println("�ܺø�llq������");
			zkg.go2Work(false);
			System.out.println("�ܺø�zkg������");
		}
		catch (LateExceptiongDemo e) {
			e.printStackTrace();
			System.out.println("��������������û��");
		}
	}
}
