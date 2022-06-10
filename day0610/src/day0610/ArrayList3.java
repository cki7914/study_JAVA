package day0610;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList3 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		
		al.set(2 , "D");
		
		for(int i = 0 ; i < al.size() ; i++) {
			System.out.println(i + "번째 요소 : " + al.get(i));
		}
		
		System.out.print("검색할 데이터를 입력 > ");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		if(al.contains(input)) {
			int indexNum = al.indexOf(input);
			System.out.printf("[%d] 위치에서 %s 발견%n" , indexNum , input);
		} else System.out.println("해당 값을 찾지 못함");
		
		System.out.print("삭제할 데이터를 입력 > ");
		input = scan.next();
		
		if(al.contains(input)) {
			int indexNum = al.indexOf(input);
			al.remove(indexNum);
			System.out.printf("%s를 삭제했습니다.%n" , input);
		} else System.out.println("해당 값을 찾지 못함");
		
		for(int i = 0 ; i < al.size() ; i++) {
			System.out.println(i + "번째 요소 : " + al.get(i));
		}
		
		System.out.println("전체 내용을 삭제합니다.");
		al.removeAll(al);
		if(al.isEmpty()) {
			System.out.println("아무 내용이 없습니다.");
		}
	}
}
