package day0523;

public class Student {
	
	// 1. 필드(속성) 선언
	String name;
	int age;
	String addr;
	
	// 2. 메서드(기능) 선언
	public void studentInfo() {
		System.out.println("학생 이름 : " + name);
		System.out.println("학생 나이 : " + age);
		System.out.println("학생 주소 : " + addr);
	}
	
}
