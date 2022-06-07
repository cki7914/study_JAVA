package day0607;

import java.util.Scanner;

public class Throws4 {
	public static void main(String[] args) {
		int count = 0;
		int[] arr = null;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("원하는 배열 크기를 입력하세요 > ");
		count = scan.nextInt();
		if(count < 5) {
			try {
				throw new MyException(5);
			} catch(MyException e) {
				e.printStackTrace();
			} finally {
				scan.close();
			}
		} else {
			arr = new int[count];
			System.out.println("크기가 " + count + "인 배열이 만들어졌습니다.");
		}
	} // main
}

class MyException extends Exception {
	private int count;
	
	public MyException(int count) {
		super("크기는 " + count + "이상이어야 합니다.");
	}
}
