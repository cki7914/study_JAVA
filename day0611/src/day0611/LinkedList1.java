package day0611;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		//ArrayList
		startTime = System.currentTimeMillis();
		
		for(int i = 0 ; i < 10000 ; i++) {
			list1.add(0 , String.valueOf(i));
		}
		
		endTime = System.currentTimeMillis();
		
		System.out.println("ArrayList : " + (endTime - startTime));
		
		//LinkedList
		startTime = System.currentTimeMillis();
		
		for(int i = 0 ; i < 10000 ; i++) {
			list2.add(0 , String.valueOf(i));
		}
		
		endTime = System.currentTimeMillis();
		
		System.out.println("LinkedList : " + (endTime - startTime));
	}
}
