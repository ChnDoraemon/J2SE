package J2SE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class CollectionArrayIteratorDemo {
	public static void Iterator() {
		ArrayList al = new ArrayList();
		al.add("������");
		al.add("��ʮ��");
		// ѭ������������
		// ����1:ʹ��forѭ��
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
			System.out.println(i);
		}
		System.out.println("--------------------------------------");
		// ����2:ʹ��foreѭ��
		for (Object iterable_element : al) {
			System.out.println(iterable_element);
		}
		System.out.println("--------------------------------------");
		// ����3.1:ʹ��whileѭ����iterator
		java.util.Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--------------------------------------");
		// ����3.2:ʹ��forѭ����iterator
		for (java.util.Iterator it2 = al.iterator(); it2.hasNext();) {
			System.out.println(it2.next());
		}
		System.out.println("--------------------------------------");
		// ���ϵ�enumeration
		Vector v = new Vector();
		v.add("������");
		v.add("��ʮ��");
		Enumeration ele = v.elements();
		while (ele.hasMoreElements()) {
			System.out.println(ele.nextElement());
		}
	}
	public static void main(String[] args) {
		CollectionArrayIteratorDemo.Iterator();
	}
}
