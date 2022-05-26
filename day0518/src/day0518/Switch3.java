package day0518;

public class Switch3 {

	public static void main(String[] args) {
		
		// 현재 시각에 따라 스케쥴을 표시
		// 8 ~ 12 : 출근 (출근 시간은 랜덤으로 설정)
		// 8시 : 출근을 합니다.
		// 9시 : 회의를 합니다.
		// 10시 : 외근을 나갑니다.
		// 나머지 시간에는 업무를 합니다.
		
		int time = (int) (Math.random() * 5 + 8);
		
		System.out.println("현재 시간 : " + time);
		switch(time) {
		case 8 :
			System.out.println("8시 : 출근");
		case 9 :
			System.out.println("9시 : 회의");
		case 10 :
			System.out.println("10시 : 외근");
		default :
			System.out.println("업무");
		}

	}

}
