package day0518;

public class For2 {

	public static void main(String[] args) {
		
		for(int i = 2; i <= 9; i++) {
			System.out.print("<<< " + i + "단 >>>\n");
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n" , i , j , i * j);
			}
		}

	}

}
