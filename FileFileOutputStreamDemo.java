package J2SE;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
//�ַ������
public class FileFileOutputStreamDemo {
	public static void main(String[] args) throws Exception {
		//�����ļ�����
		File target = new File("file/stream.txt");
		//����������
		OutputStream out = new FileOutputStream(target,true);
		//д������
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
		
		//�ر���
		out.close();
	}
}
