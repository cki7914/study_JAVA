package day0614;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTable1 {
	public static void main(String[] args) {
		Map<String , String> map = new Hashtable<>();
		map.put("takanashi" , "12");
		map.put("dekomori" , "123");
		map.put("dekomori" , "1234");
		map.put("sichimiya" , "12345");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			// 아이디와 비밀번호를 입력받아 일치하면 "로그인 완료" 출력
			// 아이디가 존재하지 않으면 "아이디 오류" 출력
			// 비밀번호가 일치하지 않으면 "비밀번호 오류" 출력
			System.out.print("ID를 입력하세요 > ");
			String inputId = scan.nextLine();
			System.out.print("비밀번호를 입력하세요 > ");
			String inputPw = scan.nextLine();
			
			if(!map.containsKey(inputId)) {
				System.out.println("아이디 오류");
				continue;
			}
			
			if(inputPw.equals(map.get(inputId))) {
				System.out.println("로그인 완료");
				break;
			} else {
				System.out.println("비밀번호 오류");
			}
		}
	}
}
