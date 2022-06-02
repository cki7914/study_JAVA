package day0602;

public class Pokemon {
	int hp;
	int energy;
	int level;
	
	Pokemon() {
		hp = 30;
		level = 1;
	}
	public void eat() {
		System.out.println("밥을 먹어요");
	}
	
	public void sleep() {
		System.out.println("잠을 자요");
	}
	
	public void play() {
		System.out.println("놀아요");
	}
	
	public void training() {
		System.out.println("훈련을 해요");
	}
	
	public void printInfo() {
		System.out.println("현재 캐릭터의 정보");
		System.out.println("hp : " + hp);
		System.out.println("energy : " + energy);
		System.out.println("level : " + level);
	}
	
	public void levelUp() {
		hp -= 40;
		level++;
	}
}

class Pikachu extends Pokemon {
	Pikachu() {
		super();
		energy = 50;
	}

	public void eat() {
		energy += 10;
		super.eat();
	}

	public void sleep() {
		energy += 5;
		super.sleep();
	}

	public void play() {
		energy -= 20;
		hp += 5;
		super.play();
	}

	public void training() {
		energy -= 15;
		hp += 20;
		super.training();
	}
}

class Squirtle extends Pokemon {
	Squirtle() {
		super();
		energy = 35;
	}
	
	public void eat() {
		energy += 15;
		super.eat();
	}
	
	public void sleep() {
		energy += 10;
		super.sleep();
	}
	
	public void play() {
		energy -= 25;
		hp += 10;
		super.play();
	}
	
	public void training() {
		energy -= 30;
		hp += 15;
		super.training();
	}
}

class Charmander extends Pokemon {
	Charmander() {
		super();
		energy = 80;
	}
	
	public void eat() {
		energy += 10;
		super.eat();
	}
	
	public void sleep() {
		energy += 5;
		super.sleep();
	}
	
	public void play() {
		energy -= 40;
		hp += 20;
		super.play();
	}
	
	public void training() {
		energy -= 50;
		hp += 30;
		super.training();
	}
}
