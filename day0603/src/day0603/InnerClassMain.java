package day0603;

class OuterClass {
	
	private int value = 100;
	
	class InnerClass {
		public void myMethod() {
			int num = value;
			System.out.println("InnerClass.num = " + num);
		}
	}
	
	OuterClass() {
		InnerClass inner = new InnerClass();
		inner.myMethod();
	}
	
}

public class InnerClassMain {
	
	public static void main(String[] args) {
		
		OuterClass oc = new OuterClass();
		
		
	}
	
}
