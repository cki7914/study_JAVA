package day0608;

public class IndexOf1 {
	public static void main(String[] args) {
		// indexOf() : 매개변수로 주어진 문자열이 시작되는 위치를 반환. 없으면 -1을 반환
		String sub = "자바 프로그래밍";
		
		int loc = sub.indexOf("프로그래밍");
		System.out.println(loc);
		
		if(sub.indexOf("자바") != -1) {
			System.out.println("자바와 관련 있음");
		} else {
			System.out.println("자바와 관련 없음");
		}
	}
}
