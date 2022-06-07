package day0607;

public class Throws2 {
	
	public static void main(String[] args) {
		
		try {
			method1();
		} catch(Exception e) {
			System.out.println("main에서 예외를 처리함");
		}
		
	}
	
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("method1에서 예외를 처리함");
			throw e;
		}
	}
	
}

// 예외 되던지기 : 예외를 처리한 후에 다시 인위적으로 예외를 발생시키는 것
// 예외 되던지기 주의점
// 예외가 발생한 매서드에서는 try-catch문을 이용하여 예외를 처리하고
// 매서드 선언부에서는 발생할 예외를 throws에 지정해야함