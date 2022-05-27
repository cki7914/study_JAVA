package day0527;

public class MemberMain {
	public static void main(String[] args) {
		Member m = new Member();
		
		m.setName("김그린");
		m.setTel("010-1111-1111");
		m.setAddress("울산시 남구");
		
		System.out.println("이름 : " + m.getName());
		System.out.println("전화번호 : " + m.getTel());
		System.out.println("주소 : " + m.getAddress());
		
		m.printMember();
	}
}
