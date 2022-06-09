package day0609;

import java.util.Calendar;

public class Calendar2 {
	public static void main(String[] args) {
		final String[] WEEK = {"" , "일" , "월" , "화" , "수" , "목" , "금" , "토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.clear();
		
		date1.set(1997 , 1 , 9);
		System.out.println("date1 : " + toString(date1) + " " + WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고, ");
		
		System.out.println("오늘은 " + toString(date2) + " " + WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일");
		System.out.println("오늘은 올해가 시작하고 난 뒤 " + date2.get(Calendar.WEEK_OF_YEAR) + "째 주 입니다.");
		
		// 두 날짜의 차이
		// ms로 변환하여 계산
		long diff = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("date1에서 date2까지 " + diff + "초가 지났습니다.");
		System.out.println("date1에서 date2까지 " + (diff / (60 * 60 * 24)) + "일이 지났습니다.");
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년" + (date.get(Calendar.MONTH) + 1) + "월" + date.get(Calendar.DATE) + "일";
	}
}
