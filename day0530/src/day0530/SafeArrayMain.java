package day0530;

class SafeArray {
	private int a[];
	public int length;
	
	public SafeArray(int size) {
		a = new int[size];
		length = size;
	}
	
	public int get_num(int index) {
		if(index >= 0 && index < length) {
			return a[index];
		}
		return -1;
	}
	
	public void put_num(int index , int num) {
		if(index >= 0 && index < length) {
			a[index] = num;
			System.out.println(a[index]);
		} else {
			System.out.println("잘못된 인덱스 : " + index);
		}
	}
}

public class SafeArrayMain {
	public static void main(String[] args) {
		SafeArray array = new SafeArray(3);
		
		for(int i = 0 ; i <= array.length ; i++) {
			array.put_num(i , i * 10);
		}
	}
}
