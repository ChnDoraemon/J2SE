package J2SE;

import java.io.File;
class DemoFileListAllFiles{
	public static void ListFiles(File f){
		if(f.isFile()){
			File[] files = f.listFiles();
			for (File file : files) {
				System.out.println(file.getName());
				if(file.isDirectory()){
					ListFiles(file);
				}
			}
		}
		else {
			throw new NullPointerException();
		}
	}
	
}
public class Pra_IOListAllFilesDemo {
	public static void main(String[] args) {
		File f = new File("F:/Ñ¸À×ÏÂÔØ");
		DemoFileListAllFiles.ListFiles(f);
	}
}
