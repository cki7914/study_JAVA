package day0524;

public class MyMath1 {
	
	int add(int a , int b) {
		return a + b;
	}
	
	float add(float a , float b) {
		return a + b;
	}
	
	int add(int[] a) {
		int result = 0;
		
		for(int i = 0 ; i < a.length ; i++) {
			result += a[i];
		}
		
		return result;
	}
	
}
