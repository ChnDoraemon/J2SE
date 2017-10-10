package J2SE;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Pra_CollectionMapDemo {
	 public static void main(String[] args) {
		//��ȡmap�е�key
		 Map<String,Integer> h = new HashMap();
		 h.put("С��", 15);
		 h.put("С��", 20);
		 h.put("����", 88);
		 h.put("����", 50);
		 Set<String> keySet = h.keySet();
		 for (String key : keySet) {
			System.out.println(key);
		}
		 System.out.println("--------------------------------------");
		 //��ȡmap�е�value
		 //����1:ʹ��map�е�values����
		 //ʹ��foreach
		 Collection<Integer> values = h.values();
		 for (Integer integer : values) {
			System.out.println(integer);
		}
		 //ʹ�õ�����iterator
		 Iterator<Integer> it = values.iterator();
		 while(it.hasNext()){
			 System.out.println(it.next());
		 }
		 System.out.println("--------------------------------------");
		 //����2:ʹ��get����
		 for (String key : keySet) {
			 System.out.println(h.get(key));
		 }
		 System.out.println("--------------------------------------");
		 //��ȡmap��entry
		 Set<Entry<String, Integer>> entrySet = h.entrySet();
		 for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
