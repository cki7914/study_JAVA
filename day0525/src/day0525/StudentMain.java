package day0525;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student("김그린" , 1 , 1);
		s1.setScore(83 , 72 , 98);
		
		System.out.println("이름 : " + s1.name);
		System.out.println("총점 : " + s1.getTotal());
		System.out.println("평균 : " + s1.getAverage());

	}

}
