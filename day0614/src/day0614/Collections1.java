package day0614;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Collections1 {
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		// list에 값을 알아서 넣어줌
		Collections.addAll(list , 1 , 2 , 3 , 4 , 5);
		System.out.println(list);
		
		// 오른쪽으로 n만큼 이동함
		Collections.rotate(list , 2);
		System.out.println(list);
		
		// i번째와 j번째의 값을 교환
		Collections.swap(list , 0 , 2);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.sort(list , Collections.reverseOrder());
		System.out.println(list);
		
		// binarySearch : 지정된 값이 저장된 위치(index)반환. 단, 반드시 정렬되어있어야 함
		int index = Collections.binarySearch(list , 3);
		System.out.println(index);
		
		System.out.println("max : " + Collections.max(list));
		System.out.println("min : " + Collections.min(list));
		System.out.println("min : " + Collections.max(list , Collections.reverseOrder()));
		
		// list를 해당 값으로 모두 채우기
		Collections.fill(list , 9);
		System.out.println(list);
		
		// nCopies : list와 같은 크기의 새로운 list를 생성하고 해당 값으로 채움
		List newList = Collections.nCopies(list.size() , 8);
		System.out.println("newList : " + newList);
		
		// nCopies로 생성한 결과는 변경 불가능
//		Collections.fill(newList , 2);
//		System.out.println("newList : " + newList);
		
		// 두 list의 공통요소가 없으면 true
		System.out.println(Collections.disjoint(list , newList));
		
		Collections.copy(list , newList);
		System.out.println(list);
		System.out.println(newList);
		
		Enumeration e = Collections.enumeration(list);
		ArrayList list2 = Collections.list(e);
		System.out.println("list2 : " + list2);
	}
}
