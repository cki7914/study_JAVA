package day0530;

class Car {
	String color = "white";
	int door = 4;
	
	Car() {}
	
	void drive() {
		System.out.println("달려요");
	}
	
	void stop() {
		System.out.println("멈춰요");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("불꺼요");
	}
}

class Ambulance extends Car {
	void siren() {
		System.out.println("삐뽀삐뽀");
	}
}

public class CarMain {
	public static void main(String[] args) {
		FireEngine f = new FireEngine();
		
		System.out.println(f.color);
		System.out.println(f.door);
		f.drive();
		f.stop();
		f.water();
		
		System.out.println("-----------------------------------------------------------");
		
		Car c = f;
		
		System.out.println(c.color);
		System.out.println(c.door);
		c.drive();
		c.stop();
		
		System.out.println("-----------------------------------------------------------");
		
		FireEngine f2 = (FireEngine)c;
		
		System.out.println(f2.color);
		System.out.println(f2.door);
		f2.drive();
		f2.stop();
		f2.water();
		
		System.out.println("-----------------------------------------------------------");
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		fe2 = (FireEngine)car;
		fe2.water();
	}
}
