package day0527;

class Airplane {
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
	
	public void fly() {
		System.out.println("일반 비행합니다.");
	}
	
	public void land() {
		System.out.println("착륙합니다.");
	}
}

class Supersonic extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	public int flyMode = NORMAL;
	
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초고속 비행합니다.");
		} else {
			super.fly();
		}
	}
}

public class SuperAirplane {
	public static void main(String[] args) {
		// 이륙합니다
		// 일반비행합니다.
		// 초고속비행합니다.
		// 일반비행합니다.
		// 착륙합니다.
		Supersonic sa = new Supersonic();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = Supersonic.SUPERSONIC;
		sa.fly();
		sa.flyMode = Supersonic.NORMAL;
		sa.fly();
		sa.land();
	}
}
