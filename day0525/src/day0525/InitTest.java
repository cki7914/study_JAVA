package day0525;

public class InitTest {

	// 명시적 초기화
	static int cv = 1;
	int iv = 1;
	
	static {
		cv = 2;
	}
	
	{
		iv = 2;
	}
	
	// 생성자 초기화
	InitTest() {
		iv = 3;
	}
	
	public static void main(String[] args) {
		
		InitTest it = new InitTest();
		
		System.out.println(InitTest.cv);
		System.out.println(it.iv);

	}

}
