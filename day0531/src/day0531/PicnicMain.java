package day0531;

abstract class Living {
	int x , y;
	
	abstract void move(int x , int y);
	
	void stop() {
		System.out.println("도착했어요!");
	}
}

class Parent extends Living {
	void move(int x , int y) {
		System.out.printf("Parent의 위치 : %d , %d\n" , x , y);
	}
	
	void drive() {
		System.out.println("운전을 해요");
	}
}

class Child extends Living {
	void move(int x , int y) {
		System.out.printf("Child의 위치 : %d , %d\n" , x , y);
	}
	
	void play() {
		System.out.println("놀아요");
	}
	
	void cry() {
		System.out.println("울어요");
	}
}

class Dog2 extends Living {
	void move(int x , int y) {
		System.out.printf("Dog의 위치 : %d , %d\n" , x , y);
	}
	
	void sleep() {
		System.out.println("자요");
	}
}

public class PicnicMain {
	public static void main(String[] args) {
		Living[] group = {new Parent() , new Child() , new Dog2()};
		
		for(int i = 0 ; i < group.length ; i++) {
			group[i].move(100 , 200);
			group[i].stop();
		}
	}
}

// 부모님, 아이, 강아지랑 소풍을 가요.