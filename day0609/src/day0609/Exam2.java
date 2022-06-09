package day0609;

import java.util.Random;

class Dice {
	private int sides;
	private static Random rand = new Random();
	
	public Dice(int sides) {
		this.sides = sides;
	}
	
	public int roll() {
//		return (int)(Math.random() * sides + 1);
		return rand.nextInt(sides) + 1;
	}
}

public class Exam2 {
	public static void main(String[] args) {
		// 두 개의 주사위를 던져 그 합을 출력하는 프로그램 작성
		// 두 주사위를 100번 던졌을 때 각 결과의 갯수를 출력
		// 주사위 클래스 / 주사위를 던지는 매서드 생성
		
		// 객체 생성
		Dice dice_1 = new Dice(6);
		Dice dice_2 = new Dice(6);
		
		// 결과값을 저장하는 arr 배열에 결과값 저장
		int[] arr = new int[13];
		for(int i = 0 ; i < 100 ; i++) {
			int result = dice_1.roll() + dice_2.roll();
			arr[result]++;
		}
		
		// 결과를 숫자로 표시
		for(int i = 2 ; i < arr.length ; i++) {
			System.out.printf("%2d : %d개\n" , i , arr[i]);
		}
		
		System.out.println();
		
		// 결과를 #으로 표시
		for(int i = 2 ; i < arr.length ; i++) {
			System.out.printf("%2d : " , i);
			
			for(int j = arr[i] ; j > 0 ; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
