package day0531;

class Product {
	int price;
	int bonus;
	
	Product() {}
	
	Product(int price) {
		this.price = price;
		bonus = (int)(price / 10F);
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 1000;
	int bonus = 0;
	Product[] cart = new Product[10];
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		money -= p.price;
		bonus += p.bonus;
		cart[i++] = p;
		System.out.println(p + "를 구입하였습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i = 0 ; i < cart.length ; i++) {
			if(cart[i] == null) { break; }
			
			sum += cart[i].price;
			itemList += (i == 0) ? cart[i] : " , " + cart[i];
		}
		
		System.out.println("구입한 물건 : " + itemList);
		System.out.println("총 금액 : " + sum);
	}
}

public class Array {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		
		b.summary();
	}
}
