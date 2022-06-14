package day0614;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap3 {
	public static void main(String[] args) {
		String[] data = {"A" , "B" , "A" , "C" , "D" , "E" , "C" , "E" , "C" , "B" , "D" , "E" , "E" , "A"};
		
		HashMap<String , Integer> map = new HashMap<>();
		for(String str : data) {
			if(!map.containsKey(str)) map.put(str , 0);
			
			map.replace(str , map.get(str) + 1);
		}
		
		Set<Entry<String , Integer>> set = map.entrySet();
		Iterator<Entry<String , Integer>> setIt = set.iterator();
		while(setIt.hasNext()) {
			Map.Entry<String , Integer> entry = setIt.next();
			
			entryPrint(entry);
		}
	} // main
	
	public static void entryPrint(Entry<String , Integer> entry) {
		String str = "";
		
		str += entry.getKey() + " : ";
		for(int i = 0 ; i < entry.getValue() ; i++) { str += "#"; }
		str += " " + entry.getValue();
		
		System.out.println(str);
	}
} // HashMap3

//출력 예시
// A : ### 3
// B : ## 2
// Z : # 1
// K : #### 4

// Map.Entry : Map 인터페이스의 내부 인터페이스
// Map에 저장된 key와 value를 다루기 위해 사용