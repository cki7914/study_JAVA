package day0530;

class SingleTest {
	private static SingleTest singletest = new SingleTest();
	
	private int x;
	private int y;
	
	private SingleTest() {
		x = 10;
		y = 20;
	}
	
	public static SingleTest getSingleTest() {
		return singletest;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

public class SingleTestMain {
	public static void main(String[] args) {
		SingleTest t1 = SingleTest.getSingleTest();
		SingleTest t2 = SingleTest.getSingleTest();
		
		t1.setX(1000);
		
		System.out.println("t1.x = " + t1.getX());
		System.out.println("t2.x = " + t2.getX());
	}
}
