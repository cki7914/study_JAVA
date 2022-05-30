package day0530;

class Animal {
	String name;
	
	public void cry() {
		System.out.println(name + "이/가 소리를 냅니다.");
	}
}

class Dog extends Animal {
	@Override // 어노테이션
	public void cry() {
		super.cry();
		System.out.println("멍멍!");
	}

	public void run() {
		System.out.println(name + "이/가 뜁니다.");
	}
}

class Cat extends Animal {
	@Override
	public void cry() {
		super.cry();
		System.out.println("야옹~");
	}

	public void grooming() {
		System.out.println(name + "이/가 그루밍을 합니다.");
	}
}

class AnimalAction {
	public void action(Animal animal) {
		animal.cry();
		
		if(animal instanceof Dog) {
			((Dog) animal).run();
		} else if(animal instanceof Cat) {
			((Cat) animal).grooming();
		}
	}
}

public class AnimalMain {
	public static void main(String[] args) {
		AnimalAction a = new AnimalAction();
		
		Dog d = new Dog();
		d.name = "멍멍이";
		
		Cat c = new Cat();
		c.name = "야옹이";
		
		a.action(d);
		a.action(c);
	}
}
