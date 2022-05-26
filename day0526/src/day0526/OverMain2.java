package day0526;

class A1 {
	int num1;
	int num2;
	
	A1(int num1 , int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public String toString() {
		return "num1 : " + num1 + " , num2 : " + num2;
	}
}

//class B1 extends A1 {
//	int num3;
//	
//	String print() {
//		return "num1 : " + num1 + " , num2 : " + num2 + " , num3 : " + num3;
//	}
//}

public class OverMain2 {
	public static void main(String[] args) {
		A1 a1 = new A1(10 , 20);
		
		System.out.println(a1.toString());
	}
}
