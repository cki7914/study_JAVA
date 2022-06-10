package day0610;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" <- Calendar ->");
		System.out.print("년도 입력 : ");
		int year = scan.nextInt();
		System.out.print("월 입력 : ");
		int month = scan.nextInt() - 1;
		
		scan.close();
		
		Calendar cal = Calendar.getInstance();
		cal.set(year , month , 1);
		
		int firstDay = cal.get(Calendar.DAY_OF_WEEK); // 해당 달의 1일의 요일
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(year , month , 1);
		cal2.add(Calendar.MONTH , 1);
		cal2.add(Calendar.DATE , -1);
		int lastDate = cal2.get(Calendar.DATE); // 다음달 1일 -1
		
		// 출력부
		System.out.printf("       %d년 %d월\n" , year , month + 1);
		System.out.printf(" SU MO TU WE TH FR SA\n");
		
		for(int i = 1 ; i < firstDay ; i++) { // 공백 출력
			System.out.printf("   ");
		}
		
		for(int i = 1 ; i <= lastDate ; i++) {
			int date = cal.get(Calendar.DATE);
			System.out.printf(" %2d" , date);
			
			if(cal.get(Calendar.DAY_OF_WEEK) == 7) System.out.println();
			cal.add(Calendar.DATE , 1);
		}
		
		
	}
}

// Calendar 인스턴스 생성
// 사용자에게 년, 월을 입력받아 해당 정보를 Calendar 인스턴스에 set
// add 함수를 이용해 날짜를 하루씩 더해가면서 해당 날짜들을 배열에 저장
// 해당 년, 월의 첫날이 무슨 요일인지 확인

// 1. 이번달의 시작일, 이번달의 말일(다음달 1일에서 하루 빼기) 확인
// 2. 확인하고자 하는 달의 1일이 무슨 요일인지 확인
// 3. 해당하는 요일부터 화면에 출력