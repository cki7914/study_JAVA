package day0520;

import java.util.Arrays;

public class Exam3 {

	public static void main(String[] args) {
		
		// 길이가 10인 배열을 만들어 0부터 9까지의 임의의 값으로 초기화
		// 배열에 저장된 숫자가 각각 몇 번씩 나오는지 출력
		
		int[] nums = new int[10];
		int[] count = new int[10];
		
		for(int i = 0 ; i < nums.length ; i++) {
			int rndNum = (int)(Math.random() * 10);
			
			nums[i] = rndNum;
			count[rndNum]++;
		}
		
		System.out.println(Arrays.toString(nums));
		for(int i = 0 ; i < count.length ; i++) {
			System.out.printf("%d의 개수 : %d%n" , i , count[i]);
		}
		
	}

}
