package day0607;

public class TryCatch3 {
	
	public static void main(String[] args) {
		
		try {
			String data1 = "100";
			String data2 = "aa";
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			
			int result2 = value1 / value2;
			
			System.out.printf("%d + %d = %d" , value1 , value2 , result);
			System.out.printf("%d / %d = %d" , value1 , value2 , result2);
		} catch(NumberFormatException | ArithmeticException e) {
			System.out.println("문자는 숫자로 변환할 수 없습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
}

// multi catch문 주의할 점
// 1. 부모-자식 관계의 Exception을 둘 다 쓰는것은 지양(의미가 없음)
// 2. catch문에서 매서드를 호출할 경우에는 하나의 예외에서만 가지고 있는 매서드를 호출하면 안됨.