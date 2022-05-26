package day0519;

public class Debugging {

	public static void main(String[] args) {
		
		// F5 : 한 문장씩 실행. 매서드를 만나면 매서드로 진입 안함
		// F6 : 한 문장씩 실행. 매서드를 만나면 매서드로 진입
		int i = 0;
		for(i = 1 ; i <= 10 ; i++) ;{
			System.out.println("현재 숫자는 " + i);
		}

	}

}
