package day0608;

public class Substring1 {
	public static void main(String[] args) {
		String ssn = "920124-1234567";
		
		// 주민번호 앞자리와 뒷자리를 분리하여 출력
		
		String ssn_1 = ssn.substring(0 , 6);
		String ssn_2 = ssn.substring(7);
		
		System.out.println(ssn_1);
		System.out.println(ssn_2);
	}
}
