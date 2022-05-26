package day0525;

public class Card {
	
	String name;
	int orderAmt;
	
	Card() {}
	
	Card(String name , int orderAmt) {
		this.name = name;
		this.orderAmt = orderAmt;
	}
	
	void pointAmt() {
		int point = (int)(orderAmt * 0.03F);
		
		System.out.println(name + "의 구매금액 " + orderAmt + "원에 대한 포인트 적립액은 " + point + "원입니다.");
	}
	
}
