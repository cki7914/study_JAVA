package day0530;

class Employee {
	private String name;
	private double salary;
	
	private static int count = 0;
	
	Employee(String name , int salary) {
		this.name = name;
		this.salary = salary;
		++count;
	}
	
	protected void finalize() {
		count--;
	}
	
	public static int get_count() {
		return count;
	}
}

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1, e2, e3;
		e1 = new Employee("김그린" , 15000);
		e2 = new Employee("이자바" , 20000);
		e3 = new Employee("김하하" , 28000);
		
		e1 = null;
		System.gc();
		
		System.out.println("현재 직원수 : " + Employee.get_count());
	}
}
