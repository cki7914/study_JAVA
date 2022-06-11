package day0611;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exam2 {
	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		for(int i = 1 ; i <= 45 ; i++) {
			lotto.add(i);
		}
		
		Collections.shuffle(lotto);
		System.out.println(lotto);
		
		int[] lottoArr = new int[6];
		for(int i = 0 ; i < lottoArr.length ; i++) {
			lottoArr[i] = lotto.remove(0);
		}
		
		String lottoNumStr = Arrays.toString(lottoArr);
		System.out.println(lottoNumStr);
	}
}
