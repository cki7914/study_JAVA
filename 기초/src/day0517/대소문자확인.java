package day0517;

import java.util.Scanner;

public class 대소문자확인 {

	public static void main(String[] args) {
		
		// 영문자를 입력받아 문자가 대문자이면 소문자로 출력, 소문자면 대문자로 출력. 그 외의 문자이면 '입력데이터오류'라고 출력
		Scanner s = new Scanner(System.in);
		
		System.out.println("영문자 입력 >");
		String word = s.next();
		
		char c = word.charAt(0);
		// 아스키코드 A~Z:65~90 , a~z : 97~122
		if(c >= 65 && c <= 90) {
			System.out.println(word.toLowerCase());
		} else if(c >= 97 && c <= 122) {
			System.out.println(word.toUpperCase());
		} else {
			System.out.println("입력데이터오류");
		}
		
		s.close();

	}

}
