package J2SE;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class PersonDemo2 implements Comparable<PersonDemo2> {
	String name;
	int age;
	public PersonDemo2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return this.name + this.age;
	}
	@Override
	public int compareTo(PersonDemo2 other) {
		if (this.age > other.age) {
			return 1;
		} else if (this.age < other.age) {
			return -1;
		}
		return 0;
	}
}

class PersonDemo3 {
	String name;
	int age;
	public PersonDemo3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return this.name + this.age;
	}
}

class NameCompareDemo implements Comparator<PersonDemo3> {
	@Override
	public int compare(PersonDemo3 o1, PersonDemo3 o2) {
		if (o1.name.length() < o2.name.length()) {
			return -1;
		} else if (o1.name.length() > o2.name.length()) {
			return 1;
		}
		return 0;
	}
}

public class CollectionTreeSetDemo {
	public static void main(String[] args) {
		PersonDemo2 p1 = new PersonDemo2("小名", 18);
		PersonDemo2 p2 = new PersonDemo2("小花", 22);
		PersonDemo2 p3 = new PersonDemo2("小白", 30);
		Set<PersonDemo2> t = new TreeSet<PersonDemo2>();
		t.add(p1);
		t.add(p2);
		t.add(p3);
		System.out.println(t);
		System.out.println("--------------------------------------");
		Set<PersonDemo3> t2 = new TreeSet<>(new NameCompareDemo());
		t2.add(new PersonDemo3("西门吹雪",15));
		t2.add(new PersonDemo3("南宫豆腐脑",11));
		t2.add(new PersonDemo3("小白",88));
		t2.add(new PersonDemo3("刘灵清",20));
		System.out.println(t2);
	}
}
