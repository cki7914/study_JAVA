package day0607;

public class TryCatch5 {
	
	public static void main(String[] args) {
		
		// 정수형 3칸짜리 arr 배열 생성하고 순서대로 1, 2, 3의 값을 입력
		// 0부터 4번 인덱스까지 출력하도록 for문 작성
		// 이를 예외 발생시 '인덱스 범위를 벗어났습니다.'를 출력하는 예외처리를 작성하시오
		int i;
		int[] arr = new int[3];
		String str = null;
		
		try {
			for(i = 0 ; i < 3 ; i++) {
				arr[i] = i + 1;
			}
			
			for(i = 0 ; i < 4; i++) {
				System.out.println(arr[i]);
			}
			
			i = 4 / 0;			
			str.charAt(i);
		} catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("ArrayIndexOutOfBoundsException 예외 발생");
			System.out.println(a);
		} catch(ArithmeticException a) {
			System.out.println("ArithmeticException 예외 발생");
		} catch(Exception a) {
			System.out.println("예외 타입의 최고 조상인 Exception을 처리");
		} finally {
			System.out.println("예외 발생시 무조건 실행");
		}
		
	}
	
}
