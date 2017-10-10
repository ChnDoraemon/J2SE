package J2SE;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Pra_CollectionMapDemo {
	 public static void main(String[] args) {
		//获取map中的key
		 Map<String,Integer> h = new HashMap();
		 h.put("小名", 15);
		 h.put("小长", 20);
		 h.put("革命", 88);
		 h.put("长江", 50);
		 Set<String> keySet = h.keySet();
		 for (String key : keySet) {
			System.out.println(key);
		}
		 System.out.println("--------------------------------------");
		 //获取map中的value
		 //方法1:使用map中的values方法
		 //使用foreach
		 Collection<Integer> values = h.values();
		 for (Integer integer : values) {
			System.out.println(integer);
		}
		 //使用迭代器iterator
		 Iterator<Integer> it = values.iterator();
		 while(it.hasNext()){
			 System.out.println(it.next());
		 }
		 System.out.println("--------------------------------------");
		 //方法2:使用get方法
		 for (String key : keySet) {
			 System.out.println(h.get(key));
		 }
		 System.out.println("--------------------------------------");
		 //获取map中entry
		 Set<Entry<String, Integer>> entrySet = h.entrySet();
		 for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
