package day0518;

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		
		// 사원이 실적 목표를 달성하였을 경우에는 실적 목표를 초과한 금액의 10%를 성과급으로 받는 프로그램을 작성
		// 실적 목표는 1000이고 상수로 설정
		// 실적 목표, 사원의 실적, 보너스 금액 + a
		Scanner scan = new Scanner(System.in);
		
		System.out.println("실적 :");
		int result = scan.nextInt();		
		final int TARGET = 1000;
		int bonus = 0;
		
		if(result >= TARGET) {
			bonus = (result - TARGET) / 10;
		}
		
		System.out.printf("%s : %d" , "보너스" , bonus);
		
		scan.close();

	}

}
