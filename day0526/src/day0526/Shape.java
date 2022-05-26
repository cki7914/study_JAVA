package day0526;

class Point {
	int x;
	int y;
}

// 상속
//class Circle extends Point {
//	int r;
//}

// 포함
class Circle {
	Point p = new Point();
	int r;
}

public class Shape {
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.toString());
		
		Circle c1 = new Circle();
		System.out.println(c1.toString());
		
		// 상속
//		c.x = 1;
//		c.y = 2;
//		c.r = 3;
//		
//		System.out.println("c.x = " + c.x);
//		System.out.println("c.y = " + c.y);
//		System.out.println("c.r = " + c.r);
		
		// 포함
//		c.p.x = 10;
//		c.p.y = 20;
//		c.r = 30;
//		
//		System.out.println("c.x = " + c.p.x);
//		System.out.println("c.y = " + c.p.y);
//		System.out.println("c.r = " + c.r);
	}
}
