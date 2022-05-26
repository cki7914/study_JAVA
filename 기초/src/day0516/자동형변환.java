package day0516;

public class 자동형변환 {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);
		
		int intV = 300;
		byte byteV = (byte)intV;
		System.out.println("byteV : " + byteV);
		
		char charValue = '쒧';
		intValue = charValue;
		System.out.println("intValue : " + intValue);
		
		byteValue = 65;
		charValue = (char)byteValue;
		System.out.println("charValue : " + charValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);
	} // main

} // class
