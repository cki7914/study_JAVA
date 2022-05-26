package day0518;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		
		// 숫자를 입력받아 숫자의 각 자리수의 합계를 계산
		Scanner scan = new Scanner(System.in);
		
		System.out.println("input a number");
		int num = scan.nextInt();
		int sum = 0;
		
		scan.close();
		
//		while(num != 0) {
//			sum += num % 10;
//			num /= 10;
//		}
		
		for( ; num != 0 ; num /= 10) {
			sum += num % 10;
		}
		
		System.out.println(sum);
		
	}

}
