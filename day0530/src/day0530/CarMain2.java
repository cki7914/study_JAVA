package day0530;

public class CarMain2 {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("FireEngine OK!");
		}
		
		if(fe instanceof Car) {
			System.out.println("Car OK!");
		}
	}
}
