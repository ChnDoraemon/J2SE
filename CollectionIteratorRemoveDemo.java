package J2SE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionIteratorRemoveDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("11");
		list.add("22");
		list.add("33");
		Iterator it = list.iterator();
		/*
		    for (Object object : list) {
			if (object == (Object)11){
				//list.remove();//java.util.ConcurrentModificationException ����:�����޸��쳣
				}
			}
		 */
		while(it.hasNext()){
			if(it.next().equals("22")){
				it.remove();
			}
		}
		System.out.println(list);
		System.out.println(Arrays.toString(list.toArray()));
		/*
		 * ���Ͷ���Ⱦ�ͷ��͵Ĳ���
		 */
		List<Integer> list2 = new ArrayList<Integer>();
		List<String> list3 = new ArrayList<String>();
		List list4 = new ArrayList();
		list2.add(11);
		list4 = list2;
		list4.add("abc");
		list3 = list4;
		//String name = list3.get(0);//java.lang.ClassCastException  ����:��Ϊȡ������Integer���͵�����
		String name2 = list3.get(1);
	}
}
