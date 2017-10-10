package J2SE;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
//字符输出流
public class FileFileOutputStreamDemo {
	public static void main(String[] args) throws Exception {
		//创建文件对象
		File target = new File("file/stream.txt");
		//创建流对象
		OutputStream out = new FileOutputStream(target,true);
		//写出操作
		out.write(65);
		out.write(66);
		out.write(67);
		out.write(68);
		out.write(69);
		out.write(70);
		out.write(71);
		out.write(72);
		out.write(73);
		out.write(74);
		
		//关闭流
		out.close();
	}
}
