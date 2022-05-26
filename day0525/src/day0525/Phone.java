package day0525;

public class Phone {
	
	String maker;
	String color;
	int price;
	
	Phone() {}
	
	Phone(String maker , String color , int price) {
		this.maker = maker;
		this.color = color;
		this.price = price;
		
//		System.out.printf("제조사 : %s / 색상 : %s / 가격 : %d\n" , this.maker , this.color , this.price);
	}
	
}
