package day0602;

public class CarMain {
	public static void main(String[] args) {
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		Vehicle b2 = t.getVehicle();
		
		b.run(100 , 200);
		t.run(200 , 300);
		
		Driver d = new Bus();
		
		b.stop(b);
		t.stop(new Taxi());
		
		Driver d1 = new Taxi();
		d1.checkPass();
	}
}
