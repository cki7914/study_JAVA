package day0608;

import java.util.Scanner;

public class Equals3 {
	public static void main(String[] args) {
		String id = "green";
		String pw = "1234";
		
		// 사용자에게 id와 pw를 입력받아 모두 동일하게 입력하면 '로그인 성공', 아니면 '로그인 실패'로 표시하기
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("id를 입력하세요 > ");
			String inputId = scan.nextLine();
			
			System.out.println("pw를 입력하세요 > ");
			String inputPw = scan.nextLine();
			
			if(inputId.equals(id) && inputPw.equals(pw)) {
				System.out.println("로그인 성공");
				break;
			} else {
				System.out.println("로그인 실패");
			}
		} while(true);
		
		scan.close();
	}
}
