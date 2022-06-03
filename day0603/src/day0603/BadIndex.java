package day0603;

public class BadIndex {
	
	public static void main(String[] args) {
	
		int[] array = new int[10];
		for(int i : array) {
			i = 0;
		}
		
		try {
			int result = array[12];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 잘못되었습니다.");
		}
		
		System.out.println("출력될까요?");
	}
	
}
