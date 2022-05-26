package day0520;

import java.util.Arrays;

public class Exam1 {

	public static void main(String[] args) {
		
		// 로또 번호 추출하기
		int[] ball = new int[6];
		
		selectNum : for(int i = 0 ; i < 6 ; i++) {
			int rndNum = (int)(Math.random() * 45 + 1);
			
			for(int j = 0 ; j < ball.length ; j++) {
				if(rndNum == ball[j]) {
					i--;
					continue selectNum;
				}
			}
			
			ball[i] = rndNum;
		}
		
		Arrays.sort(ball);
		
		for(int i = 0 ; i < ball.length ; i++) {
			System.out.printf("ball[%d] = %d%n" , i , ball[i]);
		}
		
		System.out.println("-----------------------------------------------------------------------------------------------------");
		
		int[] ball2 = new int[45];
		
		for(int i = 0 ; i < ball2.length ; i++) {
			ball2[i] = i + 1;
		}
		
		for(int i = 0 ; i <= 100 ; i++) {
			int rndNum = (int)(Math.random() * ball2.length);
			
			int num = ball2[0];
			ball2[0] = ball2[rndNum];
			ball2[rndNum] = num;
		}
		
		int[] result = Arrays.copyOfRange(ball2, 0 , 6);
		Arrays.sort(result);
		
		for(int i = 0 ; i < result.length ; i++) {
			System.out.printf("ball2[%d] = %d%n" , i , result[i]);
		}

	}

}
