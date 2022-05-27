package day0527;

public class Phone {
	String name;
	String spec;
	int price;
	
	Phone() {}
	
	Phone(String name , String spec , int price) {
		this.name = name;
		this.spec = spec;
		this.price = price;
	}
	
	void showInfo() {
		System.out.println("모델명 : " + name);
		System.out.println("스펙 : " + spec);
		System.out.println("가격 : " + price);
	}
}
