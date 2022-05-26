package day0523;

public class Score {
	
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float avg;
	
	public void stu_sum() {
		sum = kor + eng + math;
	}
	void stu_avg() {
		avg = sum / 3f;
	}
	void print() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}
	
}
