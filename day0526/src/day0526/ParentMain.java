package day0526;

class Parent {
	String name;
	
	void printInfo() {
		System.out.println("name : " + name);
	}
}

class Child extends Parent{
	String hobby;
	
	void printInfo() {
		System.out.println("name : " + name);
		System.out.println("hobby : " + hobby);
	}
	
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}

public class ParentMain {
	public static void main(String[] args) {
		Parent parent1 = new Parent();
		parent1.name = "parent";
		Child child1 = new Child();
		child1.name = "child";
		child1.setHobby("swimming");
		
		parent1.printInfo();
		System.out.println("--------------");
		child1.printInfo();
	}
}
