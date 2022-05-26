package day0526;

public class AnimalMain {

	public static void main(String[] args) {
		
		Lion lion = new Lion();
		Eagle eagle = new Eagle();
		
		lion.roar();
		lion.animal.eat();
		lion.animal.sleep();
		
		eagle.fly();
		eagle.animal.eat();
		eagle.animal.sleep();
		
	}

}
