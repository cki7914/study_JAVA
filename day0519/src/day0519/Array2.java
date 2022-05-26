package day0519;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		
		int[] scores = {97 , 88 , 71};
		
		// 배열의 합계와 평균
		
		int sum = 0;
		
		for(int i = 0 ; i < scores.length ; i++) {
			sum += scores[i];
		}
		
		float avg = (float)sum / scores.length;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
		System.out.println("-----------------------------------------------");
		
		int[] scores_2 = {14 , 52 , 7 , 132 , 41 , 99};
		
		// scores_2의 값 중에서 최대값과 최소값을 찾아서 출력
		
		int max = scores_2[0];
		int min = scores_2[0];
		
		for(int i = 1 ; i < scores_2.length ; i++) {
			if(max < scores_2[i]) {
				max = scores_2[i];
			}
			if(min > scores_2[i]) {
				min = scores_2[i];
			}
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
		System.out.println("-----------------------------------------------");
		
		int[] numArr = {0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9};
		
		System.out.println(Arrays.toString(numArr));
		
		// 숫자의 순서를 섞어서 출력
		int temp = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			int rndNum = (int) (Math.random() * numArr.length);
			
			temp = numArr[0];
			numArr[0] = numArr[rndNum];
			numArr[rndNum] = temp;
		}
		
		System.out.println(Arrays.toString(numArr));

	}

}
