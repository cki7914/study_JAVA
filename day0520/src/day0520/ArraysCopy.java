package day0520;

import java.util.Arrays;

public class ArraysCopy {

	public static void main(String[] args) {
		
		// 배열의 복사
		// copyOf() : 배열 전체를 복사
		// copyOfRange() : 배열의 일부를 복사해서 새로운 배열을 생성 후 반환
		int[] arrCopy1 = {0 , 1 , 2 , 3 , 4};
		int[] arrCopy2 = Arrays.copyOf(arrCopy1 , arrCopy1.length);
		int[] arrCopy3 = Arrays.copyOf(arrCopy1 , 3);
		int[] arrCopy4 = Arrays.copyOf(arrCopy1 , 7);
		int[] arrCopy5 = Arrays.copyOfRange(arrCopy1 , 2 , 4);
		int[] arrCopy6 = Arrays.copyOfRange(arrCopy1 , 0 , 8);
		
		System.out.println("arrCopy1 :" + Arrays.toString(arrCopy1));
		System.out.println("arrCopy2 :" + Arrays.toString(arrCopy2));
		System.out.println("arrCopy3 :" + Arrays.toString(arrCopy3));
		System.out.println("arrCopy4 :" + Arrays.toString(arrCopy4));
		System.out.println("arrCopy5 :" + Arrays.toString(arrCopy5));
		System.out.println("arrCopy6 :" + Arrays.toString(arrCopy6));
		
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		// 배열의 정렬
		int[] arrSort = {5 , 2 , 8 , 9 , 4 , 12 , 1 , 3};
		
		System.out.println(Arrays.toString(arrSort));
		Arrays.sort(arrSort);
		System.out.println(Arrays.toString(arrSort));

	}

}
