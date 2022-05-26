package day0517;

public class if문 {

	public static void main(String[] args) {
		
		String str = "C";
		char ch = 'c';
		
		System.out.println((str == "c") || (str == "C"));
		System.out.println((str.equals("c")) || (str.equals("C")));
		System.out.println(str.equalsIgnoreCase("c"));
		
		char num = '4';
		
		System.out.println(num >= '0' && num <= '9');
		
//		String str1 = "3";
		if(str != null && str.equals("")) {
			ch = str.charAt(0);
		}
		System.out.println(ch);

		//문자 '3'을 숫자로 바꾸고싶음
		System.out.println('3' - '0');
		
	}

}
