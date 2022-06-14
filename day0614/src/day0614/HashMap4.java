package day0614;

import java.util.HashMap;
import java.util.Map;

class Student {
	public int number;
	public String name;
	
	public Student(int number , String name) {
		this.number = number;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return (number + name).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student stu = (Student) obj;
			return (number == stu.number) && name.equals(stu.name);
		} else return false;
	}
}

public class HashMap4 {
	public static void main(String[] args) {
		Map<Student , Integer> map = new HashMap<>();
		map.put(new Student(1 , "김그린") , 90);
		map.put(new Student(1 , "김그린") , 90);
		
		System.out.println(map.size());
	}
}
