package day0524;

public class MathTest {

	public static void main(String[] args) {
		
		Math obj = new Math();
		int sum;
		
		sum = obj.add(2 , 3);
		System.out.println("2 + 3 = " + sum);
		
		sum = obj.add(6 , 2);
		System.out.println("6 + 2 = " + sum);
		
		sum = obj.add('a' , 4);

	}

}
