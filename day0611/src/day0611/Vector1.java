package day0611;

import java.util.ArrayList;

public class Vector1 {
	public static void main(String[] args) {
		ArrayList vc = new ArrayList();
		vc.add("ㄷㄷㄷㅈ");
		vc.add(new Integer(10));
		vc.add(Integer.valueOf(20));
		vc.add(30);
		System.out.println("vector size : " + vc.size());
		
		for(int i = 0 ; i <vc.size() ; i++) {
			System.out.println("vc[" + i + "] : " + vc.get(i));
		}
	}
}
