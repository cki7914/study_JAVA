package day0525;

public class CarMain {
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		System.out.println("c1.color : " + c1.color);
		System.out.println("c1.gearType : " + c1.gearType);
		System.out.println("c1.door : " + c1.door);
		
		System.out.println();
		
		Car c2 = new Car("black");
		System.out.println("c2.color : " + c2.color);
		System.out.println("c2.gearType : " + c2.gearType);
		System.out.println("c2.door : " + c2.door);
		
		System.out.println();
		
		Car c3 = new Car("orange" , "auto" , 6);
		System.out.println("c3.color : " + c3.color);
		System.out.println("c3.gearType : " + c3.gearType);
		System.out.println("c3.door : " + c3.door);
		
	}
	
}
