package day0609;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendar4 {
	public static void main(String[] args) {
		// Date -> Calendar
		// 1. 현재 날짜 date 구하기
		Date date = new Date();
		
		// 2. Calendar 객체 생성
		Calendar cal = Calendar.getInstance();
		
		// 3. Date 객체를 Calendar로 변환
		// Calendar.setTime(Date) : Date객체를 Calendar객체에 설정하여 Date객체가 나타내는 날짜와 Calendar객체가 나타내는 날짜가 같도록 함
		cal.setTime(date);
		
		// 4. date, cal 확인
		System.out.println(date);
		System.out.println(cal.getTime());
		
		System.out.println("---------------------------------------------");
		
		// Calendar -> Date
		// 1. 원하는 날짜로 객체 생성
		Calendar calendar = new GregorianCalendar(2022 , 5 , 9);
		
		// 2. Calendar를 Date로 변경
		Date date1 = calendar.getTime();
		
		// 3. date1 확인
		System.out.println(date1);
	}
}
