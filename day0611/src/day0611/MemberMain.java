package day0611;

import java.util.ArrayList;

public class MemberMain {
	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<Member>();
		MemberMenu mm = new MemberMenu();
		
		System.out.println(" < MemberDB 관리 시스템 > ");
		mm.menuProcess(list);
	}
}
