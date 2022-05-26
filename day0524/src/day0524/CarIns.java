package day0524;

public class CarIns {
	
	int num; // 인스턴스 변수
	double gas; // 인스턴스 변수
	
	void setCarIns(int n , double g) {
		num = n;
		gas = g;
		
		System.out.println("차량 번호 : " + num + ", 연료량 : " + gas + "로 변경");
	} // 인스턴스 메서드
	void showCarIns() {
		System.out.println("차량 번호 : " + num);
		System.out.println("연료량 : " + gas);
	} // 인스턴스 메서드
	
}
