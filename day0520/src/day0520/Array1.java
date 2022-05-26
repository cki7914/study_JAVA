package day0520;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] type = {
				{"boolean" , "1"},
				{"char" , "2"},
				{"byte" , "1"},
				{"short" , "2"},
				{"int" , "4"},
				{"long" , "8"},
				{"float" , "4"},
				{"double" , "8"}
		};
		int count = 0;
		
		System.out.println("-----기본형의 크기는?-----");
		
		for(int i = 0 ; i < 10 ; i++) {
			int rndNum = (int) (Math.random() * type.length);
			System.out.printf("Q%d. %s의 길이는?" , i + 1 , type[rndNum][0]);
			int input = scan.nextInt();
			
			if(input == Integer.parseInt(type[rndNum][1])) {
				System.out.printf("정답입니다!");
				count++;
			} else
			if(input != Integer.parseInt(type[rndNum][1])) {
				System.out.printf("오답입니다! 정답은 %s입니다." , type[rndNum][1]);
			}
			
			System.out.println();
			System.out.println();
		}
		
		System.out.printf("총 %d개 정답입니다!" , count);
		
		scan.close();
		
	}

}
