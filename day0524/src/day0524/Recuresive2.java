package day0524;

public class Recuresive2 {

	public static void main(String[] args) {
		
		System.out.println("sum : " + sum(1));
		
	}
	
	public static int sum(int num) {
		System.out.println("시작 : " + num);
		
		if(num > 3) {
			System.out.println("끝 : " + num);
			return num;
		} else {
			System.out.println("종료 : " + num);
		}
		
		return sum(num + 1);
	}

}

// 시작 : 1
// 종료 : 1
// 시작 : 2
// 종료 : 2
// 시작 : 3
// 종료 : 3
// 시작 : 4
// 끝 : 4
// sum : 4