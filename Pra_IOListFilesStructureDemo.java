package J2SE;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Pra_IOListFilesStructureDemo {
	public static void getAllParentName(List<String> list, File f) {
		list.add(f.getName());
		System.out.println(list);
		if (f.getParentFile().getParentFile() != null) {
			getAllParentName(list, f.getParentFile());
		}
	}
	public static void main(String[] args) throws Exception {
		// �г��ļ��Ľṹ
		// �ڴ�Ч��" 'BaiduYunDownload>J2WEB>02_MySQL>��Ƶ>01.MySQL����_recv.avi'
		File f = new File(
				"F:/BaiduYunDownload/J2WEB/02_MySQL/��Ƶ/01.MySQL����_recv.avi");
		StringBuilder sb = new StringBuilder();
		LinkedList<String> list = new LinkedList<>();
		sb.append("[");
		getAllParentName(list, f);
		while(0 != list.size()){
			sb.append(list.pollLast());
			if(list.size() != 0){
				sb.append(">");
			}
		}
		sb.append("]");
		System.out.println(sb);
	}
}
