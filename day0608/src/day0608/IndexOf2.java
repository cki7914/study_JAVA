package day0608;

public class IndexOf2 {
	public static void emailTest(String str) {
		int index_1 = str.indexOf('@');
		int index_2 = str.indexOf('.');
		
		if(index_1 == -1 || index_2 == -1 || index_1 > index_2) {
			System.out.println("E-mail 형식이 잘못되었습니다.");
		} else {
			System.out.println("E-mail이 확인되었습니다.");
		}
	}
	
	public static void main(String[] args) {
		// 입력받은 값이 메일주소가 맞는지 확인하는 메서드
		// 1. 반드시 '@'가 있어야 함
		// 2. 반드시 '.'이 있어야 함
		// 3. '@'가 '.'보다 먼저 나와야 함
		
		String email1 = "test@naver.com";
		String email2 = "testnaver.com";
		String email3 = "test@navercom";
		String email4 = "test.naver@com";
		
		emailTest(email1);
		emailTest(email2);
		emailTest(email3);
		emailTest(email4);
	}
}
