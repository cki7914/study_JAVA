package day0609;

import java.util.Calendar;

public class Calendar1 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
//		int day = now.get(Calendar.DAY_OF_MONTH);
		int day = now.get(Calendar.DATE);
		
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
		
		String week = "";
		switch(now.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY :
			week = "일요일";
			break;
		case 2 :
			week = "월요일";
			break;
		case 3 :
			week = "화요일";
			break;
		case Calendar.WEDNESDAY :
			week = "수요일";
			break;
		case 5 :
			week = "목요일";
			break;
		case 6 :
			week = "금요일";
			break;
		case 7 :
			week = "토요일";
			break;
		}
		System.out.println(week);
		
		int amPm = now.get(Calendar.AM_PM);
		if(amPm == Calendar.AM) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(hour + "시");
		System.out.println(minute + "분");
		System.out.println(second + "초");
	}
}
