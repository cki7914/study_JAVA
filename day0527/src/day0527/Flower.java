package day0527;

public class Flower {
	String name;
	int cost;
	
	Flower() {}
	
	Flower(String name , int cost) {
		this.name = name;
		this.cost = cost;
	}
	
	void flowerInfo() {
		System.out.printf("%s 1송이의 가격은 %,d원입니다.\n" , name , cost);
	}
}
