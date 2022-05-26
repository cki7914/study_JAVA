package day0526;

class A{
	void hello() {
		System.out.println("A를 출력합니다.");
	}
}

class B extends A{
	void hello() {
		System.out.println("B를 출력합니다.");
	}
}

public class OverMain {
	public static void main(String[] args) {
		A aa = new A();
		aa.hello();
		
		B bb = new B();
		bb.hello();
	}
}
