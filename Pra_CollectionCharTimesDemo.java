package J2SE;

import java.util.TreeMap;

public class Pra_CollectionCharTimesDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "sdadsadagajfkjdhgskldjfgsdkjgscxkvxcmnsdh";
		//�Ȱ�Stringת��Ϊchar����
		char[] charArray = str.toCharArray();
		TreeMap<Character,Integer> treeMap = new TreeMap<>();
		//����ÿ��charԪ�ز���¼
		for (char c : charArray) {
			if (!treeMap.containsKey(c)){
				treeMap.put(c, 1);
			}else{
				int oldValue = treeMap.get(c);
				treeMap.put(c, ++oldValue);
			}
		}
		System.out.println(treeMap);
	}
}
