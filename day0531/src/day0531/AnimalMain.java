package day0531;

abstract class Animal {
	String kind;
	
	void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	abstract void sound();
}

class Dog extends Animal {
	Dog() {
		this.kind = "포유류";
	}
	
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	Cat() {
		this.kind = "표유류";
	}
	
	void sound() {
		System.out.println("야옹");
	}
}

public class AnimalMain {
	public static void main(String[] args) {
		// sound() 매서드 호출
		// 1. 일반적인 방법
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("------------------------------------------------------------------------------------");
		
		// 2. 부모타입의 참조변수를 이용하여 자식의 sound() 매서드를 호출
		Animal animal = null;
		
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("------------------------------------------------------------------------------------");
		
		// 3. 매서드를 생성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
