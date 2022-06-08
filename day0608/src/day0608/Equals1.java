package day0608;

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
}

public class Equals1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2가 같습니다.");
		} else {
			System.out.println("v1과 v2가 다릅니다.");
		}
		
		v2 = v1;
		if(v1.equals(v2)) {
			System.out.println("v1과 v2가 같습니다.");
		} else {
			System.out.println("v1과 v2가 다릅니다.");
		}
	}
}
