package J2SE;

import java.util.TreeMap;

public class Pra_CollectionCharTimesDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "sdadsadagajfkjdhgskldjfgsdkjgscxkvxcmnsdh";
		//先把String转换为char数组
		char[] charArray = str.toCharArray();
		TreeMap<Character,Integer> treeMap = new TreeMap<>();
		//迭代每个char元素并记录
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
