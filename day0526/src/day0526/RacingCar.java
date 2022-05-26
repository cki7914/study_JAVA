package day0526;

public class RacingCar extends Car {
	
	private int course;
	
	public RacingCar() {
		course = 0;
		System.out.println("레이싱카가 만들어졌습니다.");
	}
	
	public void setCourse(int course) {
		this.course = course;
		System.out.println("코스 번호를 " + course + "로 설정합니다.");
	}
	
}
