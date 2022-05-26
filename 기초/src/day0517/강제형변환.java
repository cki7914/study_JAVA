package day0517;

public class 강제형변환 {

	public static void main(String[] args) {
		
		int intValue = 10;
		byte byteValue = (byte)intValue; // 캐스팅
		System.out.println(byteValue);
		
		intValue = 65;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		intValue = 44032;
		charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
	}

}
