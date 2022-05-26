package day0524;

public class Test {

	public static void main(String[] args) {
		
		Test t = new Test();
		
//		System.out.println(t.add_int(5 , 3));
//		System.out.println(t.add_float(4.2f , 2.3f));
//		System.out.println(t.add_String("A" , "B"));
		
		System.out.println(t.add(1.2f , 2.2f));

	}
	
	// 매개변수로 입력받은 값에 대해 합계를 구하고자 함
	// int, float, String 형에 대한 합계
	
//	int add_int(int x , int y) {
//		return x + y;
//	}
//	
//	float add_float(float x , float y) {
//		return x + y;
//	}
//	
//	String add_String(String x , String y) {
//		return x + y;
//	}
	
	int add(int x , int y) {
		return x + y;
	}
	
	float add(float x , float y) {
		return x + y;
	}
	
	String add(String x , String y) {
		return x + y;
	}

}
