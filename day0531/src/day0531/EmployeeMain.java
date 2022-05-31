package day0531;

class Employee {
	String name;
	int age;
	String loc;
	String dept;
	int salary;
	
	Employee(String name , int age , String loc , String dept) {
		this.name = name;
		this.age = age;
		this.loc = loc;
		this.dept = dept;
	}
	
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("지역 : " + loc);
		System.out.println("부서 : " + dept);
	}
	
	public void setSalary(int salary) {}
}

class Regular extends Employee {
	Regular(String name , int age , String loc , String dept) {
		super(name , age , loc , dept);
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	void printInfo() {
		super.printInfo();
		System.out.println("정규직");
		System.out.println("급여 : " + salary);
	}
}

class Temporary extends Employee {
	int money;
	int time;
	
	Temporary(String name , int age , String loc , String dept) {
		super(name , age , loc , dept);
		money = 10000;
	}
	
	public void setSalary(int time) {
		this.time = time;
		this.salary = time * money;
	}
	
	void printInfo() {
		super.printInfo();
		System.out.println("계약직");
		System.out.println("일한시간 : " + time);
		System.out.println("급여 : " + salary);
	}
}

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1 = new Regular("김그린" , 35 , "울산" , "인사부");
		e1.setSalary(5000000);
		e1.printInfo();
		
		System.out.println();
		
		Employee e2 = new Temporary("이자바" , 22 , "서울" , "개발부");
		e2.setSalary(120);
		e2.printInfo();
	}
}