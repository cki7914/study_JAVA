package day0609;

public class StringBuffer1 {
	public static void main(String[] args) {
		String result1 = "";
		result1 += "Hello";
		result1 += " ";
		result1 += "World";
		System.out.println(result1);
		
		System.out.println("-----------------------------------------------");
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("good");
		sb1.append(" ");
		sb1.append("morning");
		System.out.println(sb1);
		
		System.out.println("-----------------------------------------------");
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("java");
		sb2.insert(2 , "hello ");
		System.out.println(sb2);
		System.out.println(sb2.substring(2 , 7));
		System.out.println(sb2.reverse());
	}
}
