package day0519;

import java.util.Scanner;

public class 반복문1 {

	public static void main(String[] args) {
		
		// 숫자를 입력받아서 그 숫자가 소수인지 아닌지를 판단하는 코드를 작성하시오.
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 >");
		int num = scan.nextInt();
		scan.close();
		
		for(int i = 1 ; i <= num ; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		
		if(count > 2) {
			System.out.println("입력하신 " + num + "은 소수가 아닙니다.");
		} else {
			System.out.println("입력하신 " + num + "은 소수입니다.");
		}
		
		// 풀이
		for(int i = 2 ; i <= num ; i++) {
			if(num == i) {
				System.out.println("입력하신 " + num + "은 소수입니다.");
			} else
			if(num % i == 0) {
				System.out.println("입력하신 " + num + "은 소수가 아닙니다.");
				break;
			}
			
		}
		
	} // main

}
