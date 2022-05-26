package day0525;

public class Bus {
	
	Bus() {
		num = 1234;
		gas = 10.2D;
		System.out.println("버스가 만들어졌습니다.");
	}
	
	int num;
	double gas;
	
	public void show() {
		System.out.println("차량 번호 : " + num);
		System.out.println("연료량 : " + gas);
	}
	
}
