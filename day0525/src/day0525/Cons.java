package day0525;

public class Cons {
	
	int x;
	
	Cons() {
		this(1000);
		
		x = 10;
		System.out.println("매개변수가 없는 생성자");
		System.out.println("Cons가 가지고 있는 x : " + this.x);
	}
	
	Cons(int x) {
		this.x = x;
		System.out.println("매개변수가 하나인 생성자");
		System.out.println("Cons가 가지고 있는 x : " + this.x);
	}
	
	public static void main(String[] args) {
		
		Cons c = new Cons();
		
	}
	
}

// 매개변수가 하나인 생성자
// Cons가 가지고 있는 x : 1000
// 매개변수가 없는 생성자
// Cons가 가지고 있는 x : 10