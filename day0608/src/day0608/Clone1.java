package day0608;

class Point {
	public int x;
	public int y;
	
}

public class Clone1 {
	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = p1;
		
		p1.x = 10;
		p1.y = 20;
		
		System.out.println("p2.x : " + p2.x);
		System.out.println("p2.y : " + p2.y);
	}
}
