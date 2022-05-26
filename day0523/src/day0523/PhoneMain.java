package day0523;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone p1 = new Phone();
		
		p1.name = "삼성 갤럭시 Z플립";
		p1.spec = "접는 휴대폰";
		p1.cost = 1500000;
		
		p1.phoneSpec();
		
		Phone p2 = new Phone();
		
		p2.name = "아이폰";
		p2.spec = "감성적인 디자인";
		p2.cost = 1400000;
		
		p2.phoneSpec();
		
	}

}
