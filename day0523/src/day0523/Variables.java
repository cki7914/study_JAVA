package day0523;

public class Variables {

	public static void main(String[] args) {
		
		System.out.println("Card.width : " + Card.width);
		System.out.println("Card.height : " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "visa";
		c1.number = 1234;
		
		Card c2 = new Card();
		c2.kind = "master";
		c2.number = 5678;
		
		System.out.println("c1의 종류 : " + c1.kind + ", c1의 카드번호 : " + c1.number + ", 크기 : " + Card.width + " , " + Card.height);
		System.out.println("c2의 종류 : " + c2.kind + ", c2의 카드번호 : " + c2.number + ", 크기 : " + Card.width + " , " + Card.height);
		
		System.out.println("c1의 width와 height를 50, 80으로 변경");
		Card.width = 50;
		Card.height = 80;
		
		System.out.println("c1의 종류 : " + c1.kind + ", c1의 카드번호 : " + c1.number + ", 크기 : " + Card.width + " , " + Card.height);
		System.out.println("c2의 종류 : " + c2.kind + ", c2의 카드번호 : " + c2.number + ", 크기 : " + Card.width + " , " + Card.height);
		
	}

}
