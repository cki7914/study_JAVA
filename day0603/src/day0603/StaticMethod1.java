package day0603;

interface MyInter {
	static void print() {
		System.out.println("static method");
	}
}

public class StaticMethod1 {
	public static void main(String[] args) {
		MyInter.print();
	}
}
