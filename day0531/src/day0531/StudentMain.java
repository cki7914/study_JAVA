package day0531;

class Person {
	String name;
	int age;
	String addr;
}

class Student extends Person {
	String school;
	String dept;
	int number;
	int[] score = new int[8];
	
	Student(String school , String dept , int number) {
		this.school = school;
		this.dept = dept;
		this.number = number;
	}
	
	public double average(int[] score) {
		double result = 0;
		for(int i : score) {
			result += i;
		}
		result /= score.length;
		return result;
	}
}

public class StudentMain {
	public static void main(String[] args) {
		Student s = new Student("그린대학교" , "컴퓨터공학과" , 220101);
		
		s.score[0] = 90;
		s.score[1] = 84;
		s.score[2] = 71;
		s.score[3] = 88;
		s.score[4] = 67;
		s.score[5] = 94;
		s.score[6] = 78;
		s.score[7] = 72;
		
		System.out.println("평균점수 : " + s.average(s.score));
	}
}
