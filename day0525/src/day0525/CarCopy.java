package day0525;

public class CarCopy {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		System.out.println("c1.color : " + c1.color);
		System.out.println("c1.gearType : " + c1.gearType);
		System.out.println("c1.door : " + c1.door);
		
		c1.color = "black";
		c1.gearType = "manual";
		c1.door = 6;
		
		Car c2 = new Car(c1);
		System.out.println("c2.color : " + c2.color);
		System.out.println("c2.gearType : " + c2.gearType);
		System.out.println("c2.door : " + c2.door);

	}

}
