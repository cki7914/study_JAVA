package day0517;

public class 삼항연산자 {
	
	public static void main(String[] args) {
		
		// 변수 num의 값에 따라 '양수' , '음수' , 0을 출력
		
		int num = -10;
		
		System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : '0'));
		
		System.out.println("---------------------------------------------");
		// 점수를 이용해서 등급 표시하기
		// 점수가 90점 이상이면 'A', 80점 이상이면 'B', 나머지는 'C'출력
		
		int score = 79;
		char grade = score >= 90 ? 'A' : (score >= 80 ? 'B' : 'C');
		
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
	}
	
}
