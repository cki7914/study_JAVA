package day0517;

public class 증감연산자1 {

	public static void main(String[] args) {
		
		int i = 5 , j = 0;
		
		j = i++;
		System.out.println("j = i++ : " + j + " , i : " + i);
		
		i = 5;
		j = 0;
		
		j = ++i;
		System.out.println("j = ++i : " + j + " , i : " + i);
		
		byte a = 10;
		System.out.println(~a);

	}

}
