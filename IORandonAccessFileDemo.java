package J2SE;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class IORandonAccessFileDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("file/raf.txt");
//		write(f);
		read(f);
	}

	private static void read(File f) throws Exception {
		RandomAccessFile raf = new RandomAccessFile(f, "r");
		raf.readByte();
		System.out.println(raf.getFilePointer());
		raf.readChar();
		System.out.println(raf.getFilePointer());
		raf.readUTF();
		System.out.println(raf.getFilePointer());
		raf.readInt();
		System.out.println(raf.getFilePointer());
		raf.seek(0);
		System.out.println(raf.getFilePointer());
		raf.readInt();
		System.out.println(raf.getFilePointer());
		raf.skipBytes(12);
		System.out.println(raf.getFilePointer());
	}

	private static void write(File f) throws Exception {
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		raf.writeByte(15);
		raf.writeChar('d');
		raf.writeUTF("我是哆啦A梦来自2112年请多多指教");
		raf.writeInt(11);
		raf.close();
	}
}
