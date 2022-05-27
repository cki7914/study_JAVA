package day0527;

class Person {
	// 주민번호, 국적, 이름
	final String SSN;
	final String NATION = "Korea";
	String name;
	
	public Person(String ssn , String name) {
		this.SSN = ssn;
		this.name = name;
	}
}

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567" , "김그린");
		
		System.out.println(p1.SSN);
		System.out.println(p1.NATION);
		System.out.println(p1.name);
	}
}
