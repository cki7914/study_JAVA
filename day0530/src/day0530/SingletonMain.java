package day0530;

final class Singleton {
	private static Singleton single = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return single;
	}
}

public class SingletonMain {
	public static void main(String[] args) {
//		Singleton obj1 = new Singleton();
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체");
		} else {
			System.out.println("다른 Singleton 객체");
		}
	}
}
