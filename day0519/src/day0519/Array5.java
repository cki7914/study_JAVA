package day0519;

public class Array5 {

	public static void main(String[] args) {
		
		// 성적 입력
		int[][] score = {
				{100 , 100 , 100},
				{90 , 95 , 97},
				{80 , 85 , 90},
				{60 , 65 , 70},
				{50 , 55 , 60}
		};
		
		System.out.printf("%s \t %s \t %s \t %s \t %s \t %s \n" , "번호" , "국어" , "영어" , "수학" , "합계" , "평균");
		System.out.println("==============================================");
		
		for(int i = 0 ; i < score.length ; i++) {
			System.out.printf("%3d \t" , i + 1);
			
			int sum = 0;
			for(int j = 0 ; j < score[i].length ; j++) {
				System.out.printf("%3d \t" , score[i][j]);
				sum += score[i][j];
			}
			
			System.out.printf("%3d \t %5.1f \n" , sum , ((float)sum / score[i].length));
		}
		
		System.out.println("==============================================");
		
		System.out.print("총점 : \t");
		
		for(int i = 0 ; i < score[i].length ; i++) {
			int sum = 0;
			
			for(int j = 0 ; j < score.length ; j++) {
				sum += score[j][i];
			}
			
			System.out.printf("%3d \t" , sum);
		}
		
	}

}
