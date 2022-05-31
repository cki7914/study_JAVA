package day0531;

class Car2 {
	int maxSpeed;
	int speed;
	
	Car2() {}
	
	Car2(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void speedUp() {}
	
	public void speedUp(int num) {
		if(speed + num > maxSpeed || num < 0) {
			System.out.println("현재 속도를 유지합니다.");
			return;
		}
		
		speed += num;
		System.out.println("현재 속도를 " + speed + "로 설정합니다.");
	}
	
	public void speedDown() {}
	
	public void speedDown(int num) {
		if(speed - num < 0) {
			System.out.println("현재 속도를 유지합니다.");
			return;
		}
		
		speed -= num;
		System.out.println("현재 속도를 " + speed + "로 설정합니다.");
	}
}

public class CarMain {
	public static void main(String[] args) {
		Car2 car = new Car2(300);
		
		car.speedUp(50);
		car.speedUp(100);
		car.speedUp(-100);
		car.speedDown(70);
		car.speedUp(500);
		car.speedDown(500);
	}
}
