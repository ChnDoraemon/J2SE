package J2SE;

import java.util.NoSuchElementException;

public class Pra_ColletionArrayListDemo {
	private static Object[] elements = null;
	private static int size = 0;
	// ��һ��ָ�����ȵ�����
	private static void init(Integer initialCapacity) {
		elements = new Object[initialCapacity];
	}
	// �����������Ԫ��
	private static void add(Object ele) {
		elements[size] = ele;
		size++;
	}
	// ����Ԫ����ȷ��������������
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
	// ������������ȡ����
	private static Object getEle(Integer index) {
		return elements[index];
	}
	// �滻ָ������λ�õ�����
	private static void setEle(int index, Object ele) {
		elements[index] = ele;
	}
	// �滻ָ�����ݵ�Ԫ��
	private static void update(String ele, String NewEle) {
		if (StringMyStringUtil.isBlank(ele) || StringMyStringUtil.isBlank(NewEle)) {
			throw new NullPointerException();
		}
		int index = Pra_ColletionArrayListDemo.getIndexByEle(ele);
		elements[index] = NewEle;
	}
	// ɾ��ָ������λ�õ�����
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
	// ��ӡ����
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
