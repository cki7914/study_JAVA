package day0608;

public class ValueOf {
	public static void main(String[] args) {
		int iVal = 100;
		String strVal1 = String.valueOf(iVal);
		
		double dVal = 200.0;
		String strVal2 = dVal + "";
		
		double sum1 = Integer.parseInt(strVal1) + Double.parseDouble(strVal2);
		System.out.println("strVal1 + strVal2 = " + sum1);
		
		double sum2 = Integer.valueOf(strVal1) + Double.valueOf(strVal2);
		System.out.println("strVal1 + strVal2 = " + sum2);
		
		// split("문자열") : 해당 문자열을 구분자로 나눠 배열에 저장
		// join() : 여러 문자열 사이에 구분자를 넣어서 결합
		String animal = "dog, cat, bear";
		
		String[] arr = animal.split(", ");
		for(String i : arr) {
			System.out.println(i);
		}
		
		String str = String.join("-", arr);
		System.out.println(str);
	}
}
