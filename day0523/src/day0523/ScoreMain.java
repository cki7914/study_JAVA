package day0523;

public class ScoreMain {

	public static void main(String[] args) {
		
		Score s1 = new Score();
		
		s1.name = "김그린";
		s1.kor = 98;
		s1.eng = 88;
		s1.math = 70;
		s1.stu_sum();
		s1.stu_avg();
		s1.print();
		
		Score s2 = new Score();
		
		s2.name = "박자바";
		s2.kor = 99;
		s2.eng = 55;
		s2.math = 60;
		s2.print();
		

	}

}
