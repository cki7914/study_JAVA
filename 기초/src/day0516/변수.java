package day0516;

public class 변수 {

	public static void main(String[] args) {

		int a;
		
		a = 10;
		System.out.println(a);
		
		a = 20;
		System.out.println(a);
		
		System.out.println("---------------------------------");
		
		int x = 10 , y;
		
		y = x;
		
		y += 20;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("---------------------------------");
		
		// 시간 계산하기
		int hour = 3;
		int minute = 5;
		
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = hour * 60 + minute;
		
		System.out.println("총 " + totalMinute + "분");
		
		System.out.println("---------------------------------");
		
		int b = 5;
		int c = 3;
		
		System.out.println("b : " + b + " c : " + c);
		
		//b와 c의 값을 서로 바꾸기
		int temp = b;
		b = c;
		c = temp;
		
		System.out.println("b : " + b + " c : " + c);
		
	}

}
