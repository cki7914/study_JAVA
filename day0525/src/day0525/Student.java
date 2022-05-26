package day0525;

public class Student {
	
	String name;
	int ban;
	int no;
	
	int kor;
	int eng;
	int math;
	
	Student() {}
	
	Student(String name , int ban , int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	
	void setScore(int kor , int eng , int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int)((getTotal() / 3F) * 100 + 0.5F) / 100F;
	}
	
}
