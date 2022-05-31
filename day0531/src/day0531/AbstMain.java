package day0531;

abstract class Vehicle {
	int speed;
	
	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("속도를 " + speed + "으로 설정하였습니다.");
		}
	
	abstract void show();
}

class Car extends Vehicle {
	int num;
	double gas;
	
	Car(int num , double gas) {
		this.num = num;
		this.gas = gas;
		
		System.out.println("새 자동차가 생성되었습니다.");
		System.out.println("차량 번호를 " + num + "으로 설정하였습니다.");
		System.out.println("연료량을 " + gas + "으로 설정하였습니다.");
	}
	
	void show() {
		System.out.println("차량 번호 : " + num);
		System.out.println("연료량 : " + gas);
		System.out.println("속도 : " + speed);
	}
}

class Plane extends Vehicle {
	int flight;
	
	Plane(int flight) {
		this.flight = flight;
		
		System.out.println("새 비행기가 생성되었습니다.");
		System.out.println("비행기 번호를 " + flight + "으로 설정하였습니다.");
	}
	
	void show() {
		System.out.println("비행기 번호 : " + flight);
		System.out.println("속도 : " + speed);
	}
}

public class AbstMain {
	public static void main(String[] args) {
		Vehicle[] vc = {
				new Car(1234 , 30.6) ,
				new Plane(333)
		};
		
		vc[0].setSpeed(80);
		vc[1].setSpeed(800);
		
		vc[0].show();
		vc[1].show();
	}
}
