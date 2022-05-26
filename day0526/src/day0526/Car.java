package day0526;

public class Car {
	
	private int num;
	private double gas;
	
	Car() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar(int num , double gas) {
		this.num = num;
		this.gas = gas;
		System.out.println("차량 번호 : " + num + ", 연료량 : " + gas);
	}
	
	public void show() {
		System.out.println("차량 번호 : " + num);
		System.out.println("연료량 : " + gas);
	}
	
}
