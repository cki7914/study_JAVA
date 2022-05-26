package day0523;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.name = "김그린";
		s.age = 22;
		s.addr = "울산시 중구 성남동";
		
		s.studentInfo();
		
		Student s2 = new Student();
		
		s2.name = "박자바";
		s2.age = 40;
		s2.addr = "부산시 연제구 연산동";
		
		s2.studentInfo();
		
	}

}
