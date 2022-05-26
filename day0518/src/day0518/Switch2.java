package day0518;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		
		// 성적을 입력받아
		// 100 ~ 90 : A
		// 89 ~ 80 : B
		// 79 ~ 70 : C
		// 69 ~ 60 : D
		// 나머지는 F
		// 를 출력하되, switch문을 이용해서 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("성적을 입력하세요.");
		int score = scan.nextInt();
		
		switch(score / 10) {
		case 10 : case 9 :
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		case 6 :
			System.out.println("D");
			break;
		default :
			System.out.println("F");
		}
		
		scan.close();
		
	}
}
