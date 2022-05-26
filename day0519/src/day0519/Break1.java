package day0519;

public class Break1 {

	public static void main(String[] args) {
		
		// 1부터 10까지의 숫자를 무작위로 추출하다가 무작위 수가 10이 되면 종료
//		int count = 0;
//		
//		while(true) {
//			int rndNum = (int) (Math.random() * 10 + 1);
//			count++;
//			
//			System.out.println(count + "번째 숫자 : " + rndNum);
//			
//			if(rndNum == 10) {
//				break;
//			}
//		}
//		
//		System.out.println("프로그램 종료");
		
		// -------------------------------------------------------------------------------------------
		
		// 화면에 1부터 10까지의 수를 표시하는데 한 줄에 3개씩 표시
//		int k = 0;
//		
//		Loop1 : for(int i = 0 ; i < 10 ; i++) {
//			for(int j = 0 ; j < 3 ; j++) {
//				System.out.print(++k + "\t");
//				if(k == 10) {
//					break Loop1;
//				}
//			}
//			System.out.println();
//		}
		
		// --------------------------------------------------------------------------------------------
		
		outter : for(char upper = 'A' ; upper <= 'Z' ; upper++) {
			for(char lower = 'a' ; lower <= 'z' ; lower++) {
				System.out.println(upper + " - " + lower);
				
				if(lower == 'g') {
					break outter;
				}
			}
		}

	} // main

}
