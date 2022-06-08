package day0608;

import java.io.IOException;
import java.util.Scanner;

public class StringExam3 {
	public static void main(String[] args) throws IOException {
		System.out.print("영문 또는 숫자를 입력하세요 > ");
		
		// 1. Scanner 사용
		Scanner scan = new Scanner(System.in);
		int num = scan.next().charAt(0);
		scan.close();
		// 2. System.in.read() 사용
//		int num = System.in.read();
		
		if(num >= 48 && num <= 57) {
			System.out.println("입력하신 " + (char)num + "은/는 숫자입니다.");
		} else if((num >= 65 && num <= 90) || (num >= 97 && num <= 122)) {
			System.out.println("입력하신 " + (char)num + "은/는 문자입니다.");
		} else {
			System.out.println("입력값을 확인하세요!");
		}
	}
}
