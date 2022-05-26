package day0516;

public class 변수사용범위 {

	public static void main(String[] args) {
		int v1 = 15;
		int v2 = 0;
		if(v1 > 10){
			v2 = v1 - 10;
		}
		System.out.println("v1 : " + v1 + " , v2 : " + v2);
		
//		int num1 = 0;
//		if(true) {
//			int num2 = 0;
//			int num3 = 0;
//			if(true) {
//				num1 = 1;
//				num2 = 2;
//				num3 = 3;
//			}
//			num1 = num2 + num3;
//		}
	} // main

} // class
