package J2SE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;

public class Pra_IOCopyTypeFileDemo {
	public static void main(String[] args) {
		File srcdir = new File("D:/workspace/review/src/J2SE");
		File destdir = new File("D:/destdir");
		File[] files = srcdir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});
		for (File f : files) {
			try (InputStream in = new FileInputStream(f);
					OutputStream out = new FileOutputStream(new File(destdir,
							f.getName()));) {
				byte[] buffer = new byte[10];
				int len = -1;
				while ((len != in.read(buffer))) {
					out.write(buffer);
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
