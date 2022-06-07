package day0607;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		// 두 개의 정수를 입력받아 곱셈과 나눗셈의 연산 결과를 출력
		// 입력값에서 정수가 아닌 값이 입력되면 예외가 발생하면서 실행이 중단되는 예외 처리하고 구현하시오.
		int num1 , num2;
		int result1;
		double result2;
		
		do {
			try {
				System.out.println("첫 번째 숫자를 입력하세요 > ");
				num1 = new Scanner(System.in).nextInt();
				break;
			} catch(Exception e) {
				System.out.println("Exception : " + e);
				System.out.println("다시 입력하세요.");
				continue;
			}
		} while(true);
		
		do {
			try {
				System.out.println("두 번째 숫자를 입력하세요 > ");
				num2 = new Scanner(System.in).nextInt();
				if(num2 == 0) throw new Exception("두 번째 숫자에는 0을 입력할 수 없습니다.");
				break;
			} catch(Exception e) {
				System.out.println("Exception : " + e);
				System.out.println("다시 입력하세요.");
				continue;
			}
		} while(true);
		
		result1 = num1 * num2;
		result2 = num1 / num2;
		
		System.out.println(num1 + " * " + num2 + " = " + result1);
		System.out.println(num1 + " / " + num2 + " = " + result2);
	}
}
