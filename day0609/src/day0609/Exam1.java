package day0609;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 단어 저장
		String[] words = {"java" , "count" , "school" , "book" , "student" , "programmer"};
		
		// 정답 단어를 하나 선정해 word 변수에 저장
		int rndNum = (int)(Math.random() * words.length); // rndNum 선택
		StringBuffer word = new StringBuffer(words[rndNum]); // word 변수에 words[rndNum] 저장
		for(int i = 0 ; i < word.length(); i++) { // word 변수의 값을 "_____"로 변경
			word.setCharAt(i , '_');
		}
		
		while(true) {
			System.out.println("현재의 상태 : " + word);
			
			if(word.indexOf("_") == -1) break; // 종료 시점 판별
			
			System.out.print("글자를 추측하세요 > ");
			char input = scan.next().charAt(0);
			
			for(int i = 0 ; i < word.length(); i++) {
				if(words[rndNum].charAt(i) == input) {
					word.setCharAt(i , words[rndNum].charAt(i));
				}
			}
		}
		
		scan.close();
	} // main
}
