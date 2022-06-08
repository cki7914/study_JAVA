package day0608;

import java.util.Scanner;

public class StringExam1 {
	public static void main(String[] args) {
		System.out.print("문자열을 입력하세요 : ");
		String str = new Scanner(System.in).nextLine();
		
		String[] result = str.split(" ");
		System.out.println(String.join("," , result));
		System.out.println("총 " + result.length + "개의 단어가 있습니다.");
	}
}
