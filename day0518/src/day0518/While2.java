package day0518;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		
		// 1. 파일명 : game.java (X)
		// 2. while, Scanner, if문 이용
		// 3. 난수는 1부터 300까지의 숫자 중 발생
		// 4. 숫자 입력 : ###
		// 5. 만약 랜덤수보다 작은 수를 입력하면 "UP"
		// 	  만약 랜덤수보다 큰 수를 입력하면 "DOWN"
		// 6. 정답이면 "정답입니다. 시도횟수 : n" 출력
		
		int rndNum = (int) (Math.random() * 300 + 1);
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		int inputNum;
		
		while(true) {
			count++;
			
			System.out.println("input a number in 1 to 300 >");
			inputNum = scan.nextInt();
			
			if(inputNum != rndNum) {
				if(inputNum >= rndNum) {
					System.out.println("DOWN!");
				} else
				if(inputNum <= rndNum) {
					System.out.println("UP!");
				}
			} else
			if(inputNum == rndNum) {
				System.out.println("정답입니다!");
				System.out.println("시도 횟수 : " + count);
				break;
			}
		}
		
		scan.close();

	}

}
