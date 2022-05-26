package day0517;

public class 반올림 {

	public static void main(String[] args) {
		
		float pi = 3.141592f;
		float shortPi = ((int)(pi * 1000)) / 1000f;
		
		System.out.println(shortPi); // 3.141
		
		System.out.println("------------------------------------------");
		
		double d1 = 0.1f;
		double d2 = (float)0.1d;
		System.out.println(d1 == d2);

		System.out.println("------------------------------------------");
		
		char x = 'A';
		System.out.println((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z'));
	}

}
