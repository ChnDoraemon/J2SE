package J2SE;

import java.awt.List;
import java.io.File;
import java.io.FilenameFilter;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Pra_IOilenameFilterDemo {
	static File f = new File("F:/BaiduYunDownload/µÁ”∞");
	static LinkedList list = new LinkedList();
	public static void listAllFilesDemo(FilenameFilter filter, LinkedList list,
			File file) {
		File[] fs = file.listFiles(filter);
		for (File file1 : fs) {
				list.add(file1);
			if (file1.isDirectory()) {
				listAllFilesDemo(filter, list, file1);
			}
		}
	}
	public static void main(String[] args) {
		listAllFilesDemo(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if (dir.isFile() && name.endsWith(".avi")) {
					return true;
				}
				return false;
			}
		}, list, f);
		while (list.size() != 0) {
			System.out.println(list.pollFirst());
		}
	}
}
