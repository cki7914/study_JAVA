package day0525;

public class Box {
	
	int width;
	int length;
	int height;
	int volume;
	
	Box() {}
	
	Box(int width , int length , int height) {
		this.width = width;
		this.length = length;
		this.height = height;
		this.volume = width * length * height;
		// this : 객체 자신을 참조
	}
	
	public int getVolume() {
		return volume;
	}
	
}
