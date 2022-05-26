package day0525;

public class CalculatorMain {

	public static void main(String[] args) {
		
		// 정사각형과 직사각형의 넓이를 계산하는
		// areaRectangle 메서드를 오버로딩하여 작성하고
		// 정사각형의 한 변의 길이는 10,
		// 직사각형의 넓이는 가로 10, 세로 20으로 계산
		System.out.println("길이 10인 정사각형의 넓이 : " + Calculator.areaRectangle(10));
		System.out.println("길이 10, 높이 20인 직사각형의 넓이 : " + Calculator.areaRectangle(10 , 20));
		
	}

}
