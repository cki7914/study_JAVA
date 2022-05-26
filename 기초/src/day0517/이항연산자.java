package day0517;

public class 이항연산자 {

	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 30;
		
		byte c = (byte)(a * b);
		System.out.println(c);
		
		System.out.println("--------------------------------------------------");
		
//		int num1 = 1000000;
//		int num2 = 2000000;
		
		long total = 2000000000000L;
		
		System.out.println(total);
		
		System.out.println("--------------------------------------------------");
		
		int d = 1000000 * 1000000 / 1000000;
		int e = 1000000 / 1000000 * 1000000;
		
		System.out.println(d);
		System.out.println(e);
		
		System.out.println("--------------------------------------------------");
		
		char c1 = 'A';
		char c2 = 'A' + 1;
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		
		char c3 = ++c2;
		System.out.println("c3 : " + c3);
		
		char c4 = (char)(c2 + 1);
		System.out.println("c4 : " + c4);
		
		System.out.println("--------------------------------------------------");
		
		int in1 = 'B' - 'A';
		System.out.println("in1 : " + in1);
		
		int in2 = '2' - '0';
		System.out.println("in2 : " + in2);

	}

}
