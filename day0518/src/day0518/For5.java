package day0518;

public class For5 {

	public static void main(String[] args) {
		
		// 1 + (1 + 2) + (1 + 2 + 3)...(1 + 2 + 3...+ 10)의 결과 출력
		int num = 0;
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				num += j;
			}
		}

		System.out.println(num);
		
		// ---------------------------------------------------------
		
		int num2 = 0;
		int num3 = 0;
		
		for(int i = 1; i <= 10; i++) {
			num2 += i;
			num3 += num2;
		}
		
		System.out.println(num3);
		
	}

}
