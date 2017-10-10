package J2SE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class CollectionArrayIteratorDemo {
	public static void Iterator() {
		ArrayList al = new ArrayList();
		al.add("我是龙");
		al.add("我十七");
		// 循环数组中数据
		// 方法1:使用for循环
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
			System.out.println(i);
		}
		System.out.println("--------------------------------------");
		// 方法2:使用fore循环
		for (Object iterable_element : al) {
			System.out.println(iterable_element);
		}
		System.out.println("--------------------------------------");
		// 方法3.1:使用while循环的iterator
		java.util.Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--------------------------------------");
		// 方法3.2:使用for循环的iterator
		for (java.util.Iterator it2 = al.iterator(); it2.hasNext();) {
			System.out.println(it2.next());
		}
		System.out.println("--------------------------------------");
		// 古老的enumeration
		Vector v = new Vector();
		v.add("我是龙");
		v.add("我十七");
		Enumeration ele = v.elements();
		while (ele.hasMoreElements()) {
			System.out.println(ele.nextElement());
		}
	}
	public static void main(String[] args) {
		CollectionArrayIteratorDemo.Iterator();
	}
}
