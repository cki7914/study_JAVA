package day0519;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		
		int[] arr1;
		arr1 = new int[10];
		
		for(int i = 0 ; i < arr1.length ; i++) {
			arr1[i] = i;
		}
		
//		for(int i = 0 ; i < arr1.length ; i++) {
//			System.out.print(arr1[i] + " , ");
//		}
		
		// Arrays : 배열에서 사용하기에 유용한 기능을 모아둔 클래스
		// toString : 배열에 저장된 내용을 문자열로 변경
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("------------------------------------------------------------");
		
		int[] arr2 = new int[10];
		
		for(int i = 0 ; i < arr2.length ; i++) {
			arr2[i] = (int) (Math.random() * 10 + 1);
		}
		
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("------------------------------------------------------------");
		
		int[] arr3 = {100 , 95 , 80 , 75 , 60};
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(arr3);
		
		System.out.println("------------------------------------------------------------");
		
		char[] chArr = {'A' , 'B' , 'C' , 'D'};
		
		System.out.println(chArr);
		
	}

}
