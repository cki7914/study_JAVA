package day0527;

public class Bus {
	private int num;
	private int count;
	
	public void setNumCount(int num , int count) {
		if(extracted(count)) {
			this.num = num;
			this.count = count;
			
			System.out.println("차량 번호 : " + num + " , 탑승 인원 : " + count + "로 설정");
		} else {
			System.out.println(count + "는 올바른 인원이 아닙니다.");
		}
	}

	private boolean extracted(int count) {
		return count >= 0 && count <= 45;
	}
	
	public void show() {
		System.out.println("차량 번호 : " + num);
		System.out.println("탑승 인원 : " + count);
	}
}
