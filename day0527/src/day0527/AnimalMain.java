package day0527;

class Animal {
	// 동물의 수를 출력
	String name;
	String color;
	int age;
	
	static int number = 0;
	
	Animal() {}
	
	Animal(String name , String color , int age) {
		this.name = name;
		this.color = color;
		this.age = age;
		
		++number;
	}
	
	static void showNumber() {
		System.out.println("현재까지 접수된 동물 : " + number + "마리");
	}
}

public class AnimalMain {
	public static void main(String[] args) {
		// 동물이름 , 색깔 , 나이 입력
		Animal a1 = new Animal("댕댕이" , "흰색" , 14);
		Animal a2 = new Animal("떼껄룩" , "갈색" , 5);
		
		Animal.showNumber();
	}
}
