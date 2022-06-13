package day0613;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HistoryMain1 {
	static Queue history = new LinkedList();
	static final int MAX_SIZE = 5; // history 저장 개수
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말이 출력됩니다.");
		while(true) {
			System.out.print(">> ");
			
			try {
				Scanner scan = new Scanner(System.in);
				String input = scan.nextLine();
				
				if(input.equals("")) continue;
				
				if(input.equalsIgnoreCase("Q")) {
					System.out.println("종료");
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println("  help - 도움말을 보여줍니다.");
					System.out.println("  Q 또는 q - 프로그램을 종료합니다.");
					System.out.println("  history - 최근에 입력한 명령어 " + MAX_SIZE + "개 확인.");
				} else if(input.equalsIgnoreCase("history")) {
					save(input);
					LinkedList list = (LinkedList)history;
					for(int i = 0 ; i < list.size() ; i++) {
						System.out.printf("%d. %s\n" , i + 1 , list.get(i));
					}
				} else {
					System.out.println(input);
					save(input);
				}
			} catch(Exception e) { System.out.println("입력 오류"); }
		} // while
	} // main
	
	public static void save(String str) {
		if(str != null && str.equals("")) history.offer(str);
		
		if(history.size() > MAX_SIZE) history.remove();
	}
}
