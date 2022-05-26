package day0520;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		
		final int SIZE = 10;
		int x = 0 , y = 0;
		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = {
				{0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0},
				{0 , 0 , 0 , 0 , 0 , 0 , 1 , 0 , 0},
				{0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0},
				{0 , 0 , 1 , 0 , 0 , 0 , 0 , 0 , 0},
				{0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0},
				{0 , 0 , 0 , 0 , 0 , 1 , 0 , 1 , 0},
				{0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0},
				{0 , 1 , 0 , 0 , 0 , 0 , 0 , 0 , 0},
				{0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0}
		};
		Scanner scan = new Scanner(System.in);
		
		// 숫자를 문자로 변환 : 숫자 + 문자
		for(int i = 1 ; i < SIZE ; i++) {
			board[0][i] = (char)(i + '0');
			board[i][0] = (char)(i + '0');
		}
		
		while(true) {
			System.out.println("좌표를 입력하세요 (종료는 00)");
			
			String input = scan.nextLine();
			if(input.length() == 2) {
				x = input.charAt(0) - '0';
				y = input.charAt(1) - '0';
				
				if(x == 0 && y == 0) {
					break;
				}
			} else
			if(input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
				System.out.println("값이 잘못되었습니다. 다시 입력하세요.");
				continue;
			}
			
			if(shipBoard[x - 1][y - 1] != 1) {
				board[x][y] = 'X';
			} else
			if(shipBoard[x - 1][y - 1] == 1) {
				board[x][y] = 'O';
			}
			
			for(int i = 0 ; i < board.length ; i++) {
				System.out.println(board[i]);
			}
		} // while
		
		scan.close();
		
	} // main

}
