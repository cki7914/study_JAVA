package day0610;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		
		list1.add(new Integer(5));
		list1.add(new Integer(2));
		list1.add(new Integer(8));
		list1.add(new Integer(7));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		
		ArrayList list2 = new ArrayList(list1.subList(1 , 4));
		
		print(list1 , list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
//		Collections.reverse(list1);
		print(list1 , list2);
		
		// containsAll : list1에 list2의 모든 요소가 포함되어있는지(부분집합) 확인
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		System.out.println();
		
		list2.add("B");
		list2.add("C");
		list2.add(3 , "A");
		print(list1 , list2);
		
		list2.set(3 , "a");
		print(list1 , list2);
		
		list1.add(0 , "1");
		print(list1 , list2);
		System.out.println("index = " + list1.indexOf("1"));
		System.out.println("index = " + list1.indexOf(1));
		System.out.println();
		
		list1.remove(1);
		list1.remove(new Integer(1));
		print(list1 , list2);
		
		// reatinAll : list1에서 list2와 겹치는 부분만 남기고 나머지(여집합)를 삭제
		System.out.println(list1.retainAll(list2));
		print(list1 , list2);
		
		// list2에서 list1과 중복되는 부분을 삭제하려면?
		// 1. list2에 있는 내용을 하나씩 꺼내서 확인(get)
		// 2. contains()로 꺼낸 객체가 list1에 있는지 확인
		// 3. remove(i)를 이용해 객체를 list2에서 삭제
		for(int i = list2.size() - 1 ; i >= 0 ; i--) {
			if(list1.contains(list2.get(i))) list2.remove(i);
		}
		print(list1 , list2);
	}
	
	static void print(ArrayList list1 , ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
}
