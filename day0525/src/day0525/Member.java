package day0525;

public class Member {
	
	String name; // 명시적 초기화
	String tel;
	String address;
	
	Member() {}
	
	Member(String name , String tel , String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	void setMemberData(String name , String tel , String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}
	
}
