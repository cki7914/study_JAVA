package day0603;

interface OperateCar {
	void start();
	void stop();
	void setSpeed(int speed);
	void turn(int degree);
	
	default void fly() {
		System.out.println("하늘을 날아요~");
	}
}

class OldCar implements OperateCar {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turn(int degree) {
		// TODO Auto-generated method stub
		
	}
	
}

public class DefaultMethod2 {
	public static void main(String[] args) {
		OldCar oc = new OldCar();
		oc.fly();
	}
}
