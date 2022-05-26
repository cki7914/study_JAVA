package day0517;

import java.util.Scanner;

public class 값입력받기 {

	public static void main(String[] args) {
		
		// 사용자에게 값을 입력받기위해 Scanner라는걸 사용
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자 : ");
		int num1 = s.nextInt();
		
		System.out.println("두 번째 숫자 : ");
		int num2 = s.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.printf("%d + %d = %d" , num1 , num2 , num1 + num2);
		// printf 형식 = %d : 정수, %f : 실수, %s : 문자
		
		s.close();

	}

}
