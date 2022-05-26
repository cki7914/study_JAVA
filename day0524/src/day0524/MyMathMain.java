package day0524;

public class MyMathMain {
	
	public static void main(String[] args) {
		
		System.out.println(MyMath.add(200L , 100L));
		
		MyMath mm = new MyMath();
		
		mm.a = 300L;
		mm.b = 400L;
		System.out.println(mm.add());
		
	}
	
}
