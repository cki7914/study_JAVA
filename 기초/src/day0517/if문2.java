package day0517;

import java.util.Scanner;

public class if문2 {

	public static void main(String[] args) {
		
		// 사용자로부터 두 개의 정수를 입력받아 둘 중 큰 수를 출력
		Scanner s = new Scanner(System.in);
		
//		System.out.println("첫 번째 숫자 : ");
//		int num1 = s.nextInt();
//		System.out.println("두 번째 숫자 : ");
//		int num2 = s.nextInt();
//		
//		if(num1 > num2) {
//			System.out.println("더 큰 숫자 : " + num1);
//		} else if(num2 > num1) {
//			System.out.println("더 큰 숫자 : " + num2);
//		} else {
//			System.out.println("두 숫자가 같습니다.");
//		}
//		
//		s.close();
//		
		// s.next() : 공백을 만나기 전까지만 리턴
		// s.nextLine() : 엔터를 치기 전까지 리턴

		String tmp = s.next();
		System.out.println(tmp);
		
		s.close();
	}

}
