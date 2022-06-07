package day0607;

import java.util.Scanner;

public class Exam1 {
	
	public static void main(String[] args) {
		
		// 1 ~ 100 사이의 랜덤수를 하나 지정하고 사용자가 그 수를 맞추는 게임
		// 정답보다 큰 수를 입력하면 '더 작은 수를 입력하세요' 출력
		// 정답보다 작은 수를 입력하면 '더 큰 수를 입력하세요' 출력
		// 맞추면 시도횟수와 함께 '정답입니다!' 출력
		// 1부터 100 사이의 값을 입력하지 않은 경우와 문자를 입력했을 때 예외 발생
		
		int rndNum = (int)(Math.random() * 100 + 1); // 정답
		int num; // 사용자의 입력값 저장
		int count = 0; // 시도횟수 저장
		
		do {
			System.out.println("1 ~ 100 사이의 값을 입력하세요 : ");
			try {	
				num = new Scanner(System.in).nextInt();
				
				if(num < 0 || num > 100) throw new Exception();
			} catch(Exception e) {
				System.out.println("유효하지 않습니다. 다시 입력하세요.");
				System.out.println();
				continue;
			}
			
			count++;
			if(num > rndNum) {
				System.out.println("더 작은 수를 입력하세요");
				System.out.println();
			} else if(num < rndNum) {
				System.out.println("더 큰 수를 입력하세요.");
				System.out.println();
			} else if(num == rndNum) {
				System.out.println("정답입니다!");
				System.out.println("시도횟수 : " + count);
				break;
			}
		} while(true);
		
	} // main
	
}
