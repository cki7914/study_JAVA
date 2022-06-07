package day0607;

public class TryCatch2 {
	
	public static void main(String[] args) {
		
		// 오류일 경우 "매개변수 값이 없습니다." 라고 출력
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		} catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("매개변수 값이 없습니다.");
		}
		
	}
	
}
