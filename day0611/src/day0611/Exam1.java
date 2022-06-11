package day0611;

import java.util.ArrayList;

class Item {
	private String name;
	private int price;
	
	public Item() {}
	
	public Item(String name , int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String print() {
		return String.format("Item { name : %s | price : %d }" , name , price);
	}
}

public class Exam1 {
	public static void main(String[] args) {
		ArrayList<Item> list = new ArrayList<Item>();
		list.add(new Item("스트라이프 셔츠" , 49900));
		list.add(new Item("슬림 면바지" , 58900));
		list.add(new Item("스니커즈" , 46900));
		
		// 출력
		int sum = 0;
		for(Item item : list) {
			System.out.println(item.print());
			sum += item.getPrice();
		}
		System.out.println("======================================");
		System.out.printf("총합 : %d원" , sum);
	}
}

// Item 객체(이름 , 가격)를 생성하고 이를 이용하여 장바구니 만들기
// 장바구니 품목
// 이름			가격
// 티셔츠			49900
// 면바지			58900
// 스니커즈		46900

// 출력 결과
// Item { name : 스트라이프 셔츠 | price : 49900 }
// Item { name : 슬림 면바지 | price : 58900 }
// Item { name : 스니커즈 | price : 46900 }
// ===========================================
// 총합 : 155700원