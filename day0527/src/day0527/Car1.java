package day0527;

public class Car1 {
	int speed;
	
	void run() {
		System.out.println(speed + "km/h로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car1 myCar = new Car1();
		myCar.speed = 60;
		
		myCar.run();
	}
}
