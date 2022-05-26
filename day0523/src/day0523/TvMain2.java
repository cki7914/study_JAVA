package day0523;

public class TvMain2 {

	public static void main(String[] args) {
		
		// 객체배열 초기화 방법 1
		Tv[] tvArr1 = new Tv[3];
		tvArr1[0] = new Tv();
		tvArr1[1] = new Tv();
		tvArr1[2] = new Tv();
		
		// 객체배열 초기화 방법 2
		Tv[] tvArr2 = {new Tv() , new Tv() , new Tv()};
		System.out.println(tvArr2); // 미참조 오류 지우기용
		
		// 객체배열 초기화 방법 3
		Tv[] tvArr3 = new Tv[100];
		for(int i = 0 ; i < tvArr3.length ; i++) {
			tvArr3[i] = new Tv();
		}
		
	}

}
