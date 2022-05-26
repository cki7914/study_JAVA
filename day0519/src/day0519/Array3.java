package day0519;

public class Array3 {

	public static void main(String[] args) {
		
		// 2차원 배열 선언 방법 1
		int[][] arr1 = new int[][] {{10 , 20 , 30} , {40 , 50 , 60}};
		
		// 2차원 배열 선언 방법 2
		int[][] arr2 = {{11 , 22 , 33} , {44 , 55 , 66}};
		
		// 2차원 배열 선언 방법 3
		int[][] arr3 = {
				{10 , 20 , 30} ,
				{40 , 50 , 60} ,
				{70 , 80 , 90}
		};
		
		System.out.println(arr3[1][2]);
		
		int[][] arr4 = {
				{11 , 12 , 13 , 14 , 15},
				{22 , 23 , 24},
				{46 , 47 , 48 , 49},
				{88 , 99}
		};
		
		System.out.println(arr4[2][1]);
		System.out.println(arr4.length);
		System.out.println(arr4[3].length);

	}

}
