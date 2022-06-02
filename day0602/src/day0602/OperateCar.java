package day0602;

public interface OperateCar {
	public abstract void start();
	
	void stop(); // public abstract void stop();
	
	void setSpeed(int speed);
	
	void turn(int degree);
}
