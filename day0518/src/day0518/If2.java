package day0518;

public class If2 {

	public static void main(String[] args) {
		
		// 랜덤으로 주사위를 던져서 결과값 확인하기. "n번이 나왔습니다."라고 출력. if문 사용
		int rndNum = (int)(Math.random() * 6 + 1);
		String result = null;
		
		if(rndNum == 1) {
			result = "1번이 나왔습니다.";
		} else if(rndNum == 2) {
			result = "2번이 나왔습니다.";
		} else if(rndNum == 3) {
			result = "3번이 나왔습니다.";
		} else if(rndNum == 4) {
			result = "4번이 나왔습니다.";
		} else if(rndNum == 5) {
			result = "5번이 나왔습니다.";
		} else if(rndNum == 6) {
			result = "6번이 나왔습니다.";
		}
		
		System.out.println(result);
		
	} // main

} // class
