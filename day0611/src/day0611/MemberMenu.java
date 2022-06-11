package day0611;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMenu {
	Scanner scan = new Scanner(System.in);
	private int menu; // 메뉴 번호 저장
	boolean flag = true; // 현재 실행중인지에 대한 상태
	private String menuStr = "1.추가 | 2.검색 | 3.수정 | 4.삭제 | 5.전체출력 | 6.데이터초기화 | 7.종료";
	
	public void menuProcess(ArrayList<Member> list) {
		while(flag) {
			int indexNum = 0;
			
			System.out.println();
			System.out.println(menuStr);
			menu = scan.nextInt();
			switch(menu) {
			case 1 : // 추가
				System.out.println("1.추가 : 새 맴버를 추가합니다.");
				list.add(addMember());
				break;
			case 2 : // 검색
				System.out.println("2.검색 : 찾을 맴버의 이름을 입력하세요.");
				indexNum = searchMember(list);
				if(indexNum >= 0) System.out.println(list.get(indexNum).toString());
				else System.out.println("해당하는 맴버가 없습니다.");
				break;
			case 3 : // 수정
				System.out.println("3.수정 : 정보를 수정할 맴버의 이름을 입력하세요.");
				indexNum = searchMember(list);
				if(indexNum >= 0) setMember(list , indexNum);
				else System.out.println("해당하는 맴버가 없습니다.");
				break;
			case 4 : // 삭제
				System.out.println("4.삭제 : 삭제할 맴버의 이름을 입력하세요.");
				indexNum = searchMember(list);
				if(indexNum >= 0) list.remove(indexNum);
				else System.out.println("해당하는 맴버가 없습니다.");
				break;
			case 5 : // 전체출력
				System.out.println("5.전체출력");
				if(list.size() > 0) for(Member m : list) { System.out.println(m.toString());}
				else System.out.println("맴버가 없습니다.");
				break;
			case 6 : // 데이터초기화
				System.out.println("6.데이터초기화");
				System.out.print("정말 초기화 하시겠습니까? Y/N > ");
				String result = new Scanner(System.in).nextLine();
				if(result.equals("Y")) list.removeAll(list);
				else System.out.println("취소되었습니다.");
				break;
			case 7 : // 종료
				flag = false;
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	} // menuProcess()
	
	public Member addMember() { // 추가 기능을 수행하는 매서드
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 > ");
		String name = scan.nextLine();
		System.out.print("전화번호 > ");
		String tel = scan.nextLine();
		System.out.print("주소 > ");
		String address = scan.nextLine();
		
		return new Member(name , tel , address);
	} // addMember()
	
	public int searchMember(ArrayList<Member> list) { // 검색 기능을 수행하는 매서드
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 > ");
		String name = scan.nextLine();
		for(Member m : list) {
			if(m.getName().equals(name)) return list.indexOf(m); 
		}
		return -1;
	} // searchMember()
	
	public void setMember(ArrayList<Member> list , int indexNum) { // 수정 기능을 수행하는 매서드
		Scanner scan = new Scanner(System.in);
		
		System.out.print("변경할 전화번호 > ");
		String newTel = scan.nextLine();
		System.out.print("변경할 주소 > ");
		String newAddress = scan.nextLine();
		
		list.get(indexNum).setTel(newTel);
		list.get(indexNum).setAddress(newAddress);
	} // setMember()
} // MemberMenu
