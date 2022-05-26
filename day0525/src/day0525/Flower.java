package day0525;

public class Flower {
	
	String name;
	int cost;
	
	Flower() {}
	
	Flower(String name , int cost) {
		this.name = name;
		this.cost = cost;
	}
	
	public void flowerInfo() {
		System.out.printf("%s 한 송이의 가격은 %,d원입니다.\n" , name , cost);
	}
	
}
