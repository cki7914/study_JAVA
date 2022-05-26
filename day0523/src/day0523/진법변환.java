package day0523;

import java.util.Scanner;

public class 진법변환 {

	public static void main(String[] args) {
		
			// 10진수를 2진수로 변환하는 코드
		Scanner scan = new Scanner(System.in);
		
		// 전역 변수 지정
		int num = 0;
		int[] arr = new int[8];
		
		// 데이터 입력 , 데이터 유효성 검사
		while(true) {
			System.out.printf("2진수로 변환할 숫자를 입력하세요 >");
			num = scan.nextInt();
			
			if(num < 0 || num > 255) {
				System.out.println("0 ~ 255 사이의 숫자를 입력하세요.");
			} else
			if(num >= 0 || num <= 255) {
				break;
			}
		}
		
		System.out.printf("%d = %n" , num);
		
		// num을 2진수로 변환
		for(int i = 0 ; num > 0 ; i++) {
			arr[i] = num % 2;
			num /= 2;
		}
		
		// arr[] 출력
		for(int i = arr.length - 1 ; i >= 0 ; i--) {
			System.out.printf("%d" , arr[i]);
		}
		System.out.println("(2)");
		
		scan.close();

	} // main

} // class
