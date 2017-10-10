package J2SE;

interface USBDemo {
	void doWork();
}

class IUSBDemo {}

class MouseDemo implements USBDemo {
	@Override
	public void doWork() {
		System.out.println("鼠标正在工作");
	}
}

class KeyBoardDemo implements USBDemo {
	@Override
	public void doWork() {
		System.out.println("键盘正在工作");
	}
}

class SoundDemo implements USBDemo {
	@Override
	public void doWork() {
		System.out.println("音响正在工作");
	}
}

class MouthBoardDemo {
	private int usbNum = 6;
	void PlugIn(USBDemo usb) {
		usb.doWork();
		usbNum--;
	}
	public int getUsbNum() {
		return usbNum;
	}
}

public class Pra_MulitisimMotherBoardDemo {
	public static void main(String[] args) {
		USBDemo usb1 = new KeyBoardDemo();
		USBDemo usb2 = new KeyBoardDemo();
		USBDemo usb3 = new MouseDemo();
		USBDemo usb4 = new MouseDemo();
		USBDemo usb5 = new SoundDemo();
		MouthBoardDemo mb = new MouthBoardDemo();
		mb.PlugIn(usb1);
		mb.PlugIn(usb2);
		mb.PlugIn(usb3);
		mb.PlugIn(usb4);
		mb.PlugIn(usb5);
		mb.PlugIn(new USBDemo() { // 匿名内部类
			@Override
			public void doWork() {
				System.out.println("音响音响");
			}
		});
		System.out.println(mb.getUsbNum());
	}
}
