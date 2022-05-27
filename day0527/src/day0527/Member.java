package day0527;

public class Member {
	private String name;
	private String tel;
	private String address;
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void printMember() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}
}
