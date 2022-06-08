package day0608;

class A {
	A() {
		System.out.println("A 클래스 객체 생성");
	}
}

class B {
	B() {
		System.out.println("B 클래스 객체 생성");
	}
}

public class GetClass {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		System.out.println(a.getClass());
		System.out.println(b.getClass());
	}
}
