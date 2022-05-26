package day0524;

public class Recuresive1 {
	
	public static void main(String[] args) {
		
		long result = factorial(4);
		System.out.println("4! = " + result);
		
	}
	
	static long factorial(int n) {
		long result = 0;
		
		if(n == 1) {
			return 1;
		} else {
			result = n * factorial(n-1);
		}
		
		return result;
	}
		
}
	

