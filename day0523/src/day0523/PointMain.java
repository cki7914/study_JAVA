package day0523;

public class PointMain {

	public static void main(String[] args) {
		
		// point 타입의 변수를 저장할 수 있는 길이 5인 객체 배열을 생성하여
		// x에는 1씩 증가하는 값을 입력하고
		// y에는 2의 배수씩 증가하는 값을 입력하여
		// x와 y를 출력하시오.
		Point[] arr_point = new Point[5];
		for(int i = 0 ; i < arr_point.length ; i++) {
			arr_point[i] = new Point();
			
			arr_point[i].x = i + 1;
			arr_point[i].y = 2 * (i + 1);
		}
		
		for(int i = 0 ; i < arr_point.length ; i++) {
			System.out.printf("arr_point[%d] x : %d , y : %d\n" , i , arr_point[i].x , arr_point[i].y);
		}
		
	}

}
