package day0526;

class Parent1 {
	void print() { System.out.println("부모객체"); }
}

class Child1 extends Parent1 {
	void print() { System.out.println("자식객체"); }
	void print(String str) { System.out.println(str); }
}

public class OverOver {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.print();
		c1.print("acb");
	}
}
