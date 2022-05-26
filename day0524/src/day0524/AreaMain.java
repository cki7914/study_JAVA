package day0524;

import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) {
		
		AreaCalculator squar1 = new AreaCalculator();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가로 길이 >");
		squar1.width = scan.nextInt();
		System.out.println("세로 길이 >");
		squar1.height = scan.nextInt();
		
		scan.close();
		
		int result = squar1.areaResult(squar1.width , squar1.height);
		System.out.printf("가로 길이가 %d이고 세로 길이가 %d인 직사각형의 면적은 %d입니다." , squar1.width , squar1.height , result);
		
	}

}
