package day0610;

import java.util.ArrayList;
import java.util.Scanner;

class Member {
	private String name;
	private String tel;
	private String address;
	
	public Member(String name , String tel , String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

public class ArrayListExam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Member> list = new ArrayList<Member>();
		String name , tel , address;
		
		System.out.println("< Member DB 관리 시스템 >");
		loop : do {
			System.out.println();
			System.out.println("1.추가 2.검색 3.수정 4.삭제 5.전체출력 6.데이터초기화 7.종료");
			int input = scan.nextInt();
			switch(input) {
			case 1 :
				System.out.print("이름 : ");
				name = scan.next();
				System.out.print("전화번호 : ");
				tel = scan.next();
				System.out.print("주소 : ");
				address = scan.next();
				
				Member member = new Member(name , tel , address);
				list.add(member);
				break;
			case 2 :
				System.out.print("이름 : ");
				name = scan.next();
				
				for(int i = 0 ; i < list.size() ; i++) {
					if(contain(list , name)) {
						print(list.get(i));
					} else System.out.println("검색 결과 없음");
				}
				
				break;
			case 3 :
				System.out.print("이름 : ");
				name = scan.next();
				for(int i = 0 ; i < list.size() ; i++) {
					if(contain(list , name)) {
						System.out.print("새 전화번호 : ");
						tel = scan.next();
						System.out.print("새 주소 : ");
						address = scan.next();
						
						list.get(i).setTel(tel);
						list.get(i).setAddress(address);
					} else System.out.println("검색 결과 없음");
				}
				break;
			case 4 :
				System.out.print("이름 : ");
				name = scan.next();
				for(int i = 0 ; i < list.size() ; i++) {
					if(contain(list , name)) {
						list.remove(i);
					} else System.out.println("검색 결과 없음");
				}
				break;
			case 5 :
				for(Member m : list) {
					print(m);
				}
				break;
			case 6 :
				list.removeAll(list);
				break;
			case 7 :
				break loop;
			} // switch
		} while(true);
	} // main
	
	public static boolean contain(ArrayList<Member> list , String name) {
		for(Member m : list) {
			if(m.getName() == name) return true;
		}
		return false;
	}
	
	public static int searchIndex(ArrayList<Member> list , String name) {
		for(int i = 0 ; )
	}
	
	public static void print(Member member) {
		System.out.printf("Member [name=%s, tel=%s, address=%s]\n" , member.getName() , member.getTel() , member.getAddress());
	}
}
