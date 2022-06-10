package day0610;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		// 제네릭(Generic) : 외부에서 사용자에 의해 타입을 지정할 수 있음
		ArrayList<String> list = new ArrayList<String>();
		list.add("JAVA");
		list.add("HTML");
		list.add("JSP");
		list.add(2 , "DATABASE");
		list.add("SPRING");
		
		int size = list.size();
		System.out.println("총 데이터 수 : " + size);
		
		String str2 = list.get(2);
		System.out.println("index(2) : " + str2);
		
		System.out.println();
		
		// 저장된 모든 데이터 확인
		for(int i = 0 ; i < list.size(); i++) {
			System.out.printf("index(%d) : %s\n" , i , list.get(i));
		}
		
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("SPRING");
		for(int i = 0 ; i < list.size(); i++) {
			System.out.printf("index(%d) : %s\n" , i , list.get(i));
		}
	}
}
