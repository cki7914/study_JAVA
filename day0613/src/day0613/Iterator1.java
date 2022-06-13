package day0613;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Iterator1 {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
		Collection list = new HashSet();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
//		for(int i = 0 ; i < list.size() ; i++) {
//			System.out.println(list.get(i));
//		}
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println("출력1");
			System.out.println(it.next());
		}
//		while(it.hasNext()) {
//			System.out.println("출력2");
//			System.out.println(it.next());
//		}
		// hasNext()를 한 번 사용하고 나면 끝까지 이동하였으므로 다시 호출해도 처음으로 이동하지 않음
		// 그러므로 Iterator는 일회용
		// 다시 사용하고 싶으면 객체를 새로 생성해야함
	}
}
