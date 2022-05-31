package day0531;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cal cal = new Cal();
		
		System.out.println("첫 번째 숫자를 입력하세요.");
		int num1 = scan.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int num2 = scan.nextInt();
		
		System.out.printf("%d + %d = %d");
	}
}

// 클래스 이름 : Calculator.java
// 추상 매서드 : 매개변수 2개인 add, minus, mul, div 생성
// Calculator를 상속받는 Cal.java 생성
// CalMain.java를 생성하여 사용자에게서 두 수를 입력받아 Cal.java를 통해 계산하여 그 결과를 출력하시오.
// 출력 예시
// 5 + 3 = 8
// 5 - 3 = 2
// 5 * 3 = 15
// 5 / 3 = 1
// 단, 나눗셈에서 나누는 수에 0이 입력될 때 오류가 발생하지 않도록 설정하시오.