package day0614;

import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap<Integer , String> map = new TreeMap<>();
		map.put(5 , "value");
		map.put(9 , "value");
		map.put(2 , "value");
		map.put(8 , "value");
		map.put(7 , "value");
		map.put(4 , "value");
		map.put(2 , "value");
		map.put(1 , "value");
		
		System.out.println(map.keySet());
	}
}
