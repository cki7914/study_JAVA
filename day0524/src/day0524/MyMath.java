package day0524;

public class MyMath {
	
	long a , b;
	static int c = 20;
	
	long add() {
		return a + b;
	}
	
	static long add(long a , long b) {
		return a + b;
	}
	
	static void test() {
		System.out.println("c : " + c);
		MyMath m = new MyMath();
		System.out.println("a : " + m.a);
	}
	
}
