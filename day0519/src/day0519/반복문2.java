package day0519;

import java.util.Scanner;

public class 반복문2 {

	public static void main(String[] args) {
		
		// while문과 Scanner를 이용하여 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성
		Scanner scan = new Scanner(System.in);
		int money = 0;
		
		processer : while(true) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			
			System.out.println("선택 >");
			int input_1 = scan.nextInt();
			
			switch(input_1) {
			case 1 :
				System.out.println("예금액 >");
				money += scan.nextInt();
				
				break;
			case 2 :
				System.out.println("출금액 >");
				money -= scan.nextInt();
				
				break;
			case 3 :
				System.out.println("잔액 > " + money);
				
				break;
			case 4 :
				System.out.println("프로그램 종료");
				
				break processer;
			}
		}
		
		scan.close();
		
	}

}
