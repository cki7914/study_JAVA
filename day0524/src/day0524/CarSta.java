package day0524;

public class CarSta {
	
	static int sum = 0; // 클래스 변수
	int num;
	double gas;
	
	public CarSta() {
		sum++;
	}
	
	void setCarSta(int n , double g) {
		num = n;
		gas = g;
		
		System.out.println("차량 번호 : " + num + ", 연료량 : " + gas + "로 변경");
	}
	
	public static void showSumSta() {
		System.out.println("자동차의 수 : " + sum + "대");
	}
	
	void showCarSta() {
		System.out.println("차량번호 : " + num);
		System.out.println("연료량 : " + gas);
	}
	
}
