package J2SE;

import java.util.NoSuchElementException;

public class Pra_ColletionArrayListDemo {
	private static Object[] elements = null;
	private static int size = 0;
	// 出一个指定长度的数组
	private static void init(Integer initialCapacity) {
		elements = new Object[initialCapacity];
	}
	// 往数组中添加元素
	private static void add(Object ele) {
		elements[size] = ele;
		size++;
	}
	// 根据元素来确定在数组中序列
	private static int getIndexByEle(String ele) {
		if (StringMyStringUtil.isBlank(ele)) {
			throw new NullPointerException();
		}
		for (int i = 0; i < elements.length; i++) {
			if (ele.equals(elements[i])) {
				return i;
			}
			if (i == elements.length) {
				throw new NoSuchElementException();
			}
		}
		return -1;
	}
	// 根据索引来获取数据
	private static Object getEle(Integer index) {
		return elements[index];
	}
	// 替换指定索引位置的数据
	private static void setEle(int index, Object ele) {
		elements[index] = ele;
	}
	// 替换指定数据的元素
	private static void update(String ele, String NewEle) {
		if (StringMyStringUtil.isBlank(ele) || StringMyStringUtil.isBlank(NewEle)) {
			throw new NullPointerException();
		}
		int index = Pra_ColletionArrayListDemo.getIndexByEle(ele);
		elements[index] = NewEle;
	}
	// 删除指定索引位置的数据
	private static void delete(Integer index) {
		if (index == size - 1) {
			elements[index] = null;
		} else {
			for (int i = index; i < elements.length - 1; i++) {
				Pra_ColletionArrayListDemo.setEle(i, Pra_ColletionArrayListDemo.getEle(i + 1));
				elements[elements.length] = null;
			}
		}
		size--;
	}
	// 打印数组
	private static void print() {
		if (size == 0) {
			System.out.println("[]");
			return;
		}
		if (elements == null) {
			System.out.println("null");
			return;
		}
		StringBuilder sb = new StringBuilder(size * 2 + 1);
		sb.append("[");
		for (int i = 0; i < elements.length; i++) {
			sb.append(Pra_ColletionArrayListDemo.getEle(i));
			if (i != elements.length) {
				sb.append(",");
			}
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
}
