package day0531;

public class Cal extends Calculator {
	public int add(int num1 , int num2) {
		return num1 + num2;
	}
	
	public int minus(int num1 , int num2) {
		return num1 - num2;
	}
	
	public int mul(int num1 , int num2) {
		return num1 * num2;
	}
	
	public int div(int num1 , int num2) {
		if(num2 == 0) {
			return 0;
		} else {
			return num1 / num2;
		}
	}
}
