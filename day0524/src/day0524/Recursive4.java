package day0524;

public class Recursive4 {
	
	public static void main(String[] args) {
		
		// 피보나치 수열
		// 1 1 2 3 5 8 13 21 ...
		
		System.out.println("n번째 fibonacci의 숫자는 " + fibonacci(5));
		
	} // main
	
	public static int fibonacci(int n) {
		
		if(n == 1) return 1;
		if(n == 2) return 1;
		
		return fibonacci(n - 1) + fibonacci(n - 2);
		
		
		
//		int f = 1;
//		int s = 1;
//		int t = f + s;
//		int result = 0;
//		
//		int i = 2;
//		
//		System.out.println(f);
//		System.out.println(s);
//		
//		while(i < n) {
//			if(n == 1 || n == 2) {
//				result = 1;
//			}
//			
//			System.out.println(t);
//			result = t;
//			
//			f = s;
//			s = t;
//			t = f + s;
//			i++;
//		}
//		
//		return result;
	}
	
}
