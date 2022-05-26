package day0517;

public class 연산자종합 {

	public static void main(String[] args) {
		
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		System.out.println(1 + x << 33);
		
		System.out.println(y >= 5 || x < 0 && x > 2);
		
		System.out.println(y += 10 - x++);
		
		System.out.println(x += 2);
		
		System.out.println(!('A' <= c && c <= 'Z'));
		
		System.out.println('C' - c);
		
		System.out.println(c + 1); // 이항연산자 : 연산을 수행할 때 연산자를 피연산자스택이라는 장소에 보관
		
		System.out.println(++c); // 단항연산자 : int보다 작은 타입도 형변환을 하지 않음
		
		System.out.println(c++);

	}

}
