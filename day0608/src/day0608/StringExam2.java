package day0608;

import java.util.Scanner;

public class StringExam2 {
	public static void main(String[] args) {
		String alpha = "abcdefgheiglmnopqrstuvwxyz";
		String num = "1234567890";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("영문 또는 숫자를 입력하세요 : ");
		String input = scan.next();
		scan.close();
		
		System.out.println("Input character : " + input);
		if(alpha.indexOf(input.toLowerCase()) != -1) {
			System.out.println("입력하신 " + input + "은/는 문자입니다.");
		} else if(num.indexOf(input) != -1) {
			System.out.println("입력하신 " + input + "은/는 숫자입니다.");
		} else {
			System.out.println("입력값을 확인하세요!");
		}
		
	}
}
