package day0524;

public class Recuresive3 {

	public static void main(String[] args) {
		
		System.out.println("sum2 : " + sum2(1));
		
	}
	
	public static int sum2(int num) {
		System.out.println("시작 : " + num);
		
		int result = 0;
		if(num > 3) {
			System.out.println("끝 : " + num);
			return num;
		} else {
			result = sum2(num+1);
		}
		
		System.out.println("종료 : " + num);
		return result;
	}

}

// 시작 : 1
// 시작 : 2
// 시작 : 3
// 시작 : 4
// 끝 : 4
// 종료 : 3
// 종료 : 2
// 종료 : 1
// sum2 : 4