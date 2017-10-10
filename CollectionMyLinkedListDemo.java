package J2SE;

public class CollectionMyLinkedListDemo {
	class Node {
		private Node prev;
		private Node next;
		Object ele;
	}
	private Node first;
	private Node last;
	int size;
	// 删除指定的节点
	public void remove(Object ele) {
		if (this.first.ele.equals(ele)) {
			this.first.next.prev = null;
			this.first = this.first.next;
		} else if (this.last.ele.equals(ele)) {
			this.last.prev.next = null;
			this.last = this.last.prev;
		} else {
			Node current = this.first.next;
			while (current.next != null) {
				if (current.ele.equals(ele)) {
					current.prev.next = current.next;
					current.next.prev = current.prev;
					current = current.next;
				}
			}
		}
		this.size--;
	}
}
