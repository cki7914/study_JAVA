package day0608;

class CloneTest implements Cloneable {
	public int x;
	public int y;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Clone2 {
	public static void main(String[] args) {
		CloneTest c1 = new CloneTest();
		CloneTest c2 = null;
		
		try {
			c2 = (CloneTest)c1.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		c1.x = 10;
		c1.y = 20;
		
		c2.x = 30;
		c2.y = 40;
		
		System.out.println("c1.x = " + c1.x + " , c1.y = " + c1.y);
		System.out.println("c2.x = " + c2.x + " , c2.y = " + c2.y);
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
	}
}
