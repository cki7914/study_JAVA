package day0518;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		
		// 숫자를 입력받아 1부터 해당 숫자까지의
		// 짝수합 : ###
		// 홀수합 : ###
		// 총합계 : ###
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("input a number");
		int num = scan.nextInt();
		int sum_even  = 0 , sum_odd  = 0 , sum_all = 0;
		
		for(int i = 2; i <= num; i += 2) {
			sum_even += i;
		}
		for(int i = 1; i <= num; i += 2) {
			sum_odd += i;
		}
		for(int i = 1; i <= num; i += 1) {
			sum_all += i;
		}
		
		System.out.printf("짝수합 : %,d\n" , sum_even);
		System.out.printf("홀수합 : %,d\n" , sum_odd);
		System.out.printf("총합계 : %,d\n" , sum_all);
		
		scan.close();
		
	}

}
