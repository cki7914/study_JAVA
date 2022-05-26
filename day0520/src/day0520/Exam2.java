package day0520;

public class Exam2 {

	public static void main(String[] args) {
		
		// 1부터 9사이의 숫자들을 이용하여 중복되지 않는 숫자로 이루어진 3자리 숫자를 만드시오.
		// System.arrayCopy 이용
		int[] num = new int[9];
		
		// num[]에 1~9까지의 숫자 지정
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = i + 1;
		}
		
		// num[]의 숫자 섞음
		for(int i = 0 ; i < 100 ; i++) {
			int rndNum = (int)(Math.random() * num.length);
			
			int temp = num[0];
			num[0] = num[rndNum];
			num[rndNum] = temp;
		}
		
		// num[0] ~ num[2]를 result[]에 저장
		int[] result = new int[3];
		System.arraycopy(num, 0, result, 0, result.length);
		
		// result[] 출력
		for(int i = 0 ; i < result.length ; i++) {
			System.out.print(result[i]);
		}
		
	}

}
