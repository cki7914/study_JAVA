package day0520;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		
		// 극장 예약 시스템
		// 좌석은 1부터 10번까지의 좌석이 있음
		// 사용자가 원하는 좌석번호를 선택하면 선택된 좌석은 1로 표시를 하고
		// 만약 동일한 좌석을 선택하면 '이미 선택된 좌석입니다.' 라고 표시
		// -1을 입력하면 종료
		
		Scanner scan = new Scanner(System.in);
		final int SIZE = 10;
		int[][] seat = new int[SIZE][2];
		for(int i = 0 ; i < seat.length ; i++) {
			seat[i][0] = i + 1;
		}
		
		System.out.println("예제 4");
		
		while(true) {
			System.out.println("---------------------");
			
			for(int i = 0 ; i < seat.length ; i++) {
				System.out.printf("%d " , seat[i][0]);
			}
			
			System.out.println();
			System.out.println("---------------------");
			
			for(int i = 0 ; i < seat.length ; i++) {
				System.out.printf("%d " , seat[i][1]);
			}
			
			System.out.println();
			System.out.println("---------------------");
			
			System.out.println("원하시는 좌석번호를 입력하세요(종료는 -1) >");
			int input = scan.nextInt();
			
			if(input == -1) {
				System.out.println("프로그램 종료");
				break;
			} else
			if(input != -1 && seat[input - 1][1] == 0) {
				System.out.println("예약되었습니다.\n");
				seat[input - 1][1] = 1;
			} else
			if(input != -1 && seat[input - 1][1] == 1) {
				System.out.println("이미 예약된 좌석입니다.\n");
			}
		}
		
		scan.close();
		
	}

}
