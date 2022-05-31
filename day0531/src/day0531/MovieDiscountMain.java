package day0531;

abstract class Movie {
	String title;
	String genre;
	
	int price;
	double discountRate;
	int discount;
	
	Movie(String title , String genre) {
		this.title = title;
		this.genre = genre;
		price = 10000;
		discountRate = 0.1;
	}
	
	abstract double discountedPrice();
}

class ActionMovie extends Movie {
	ActionMovie(String title , String genre){
		super(title , genre);
		discount = 1000;
	}
	
	double discountedPrice() {
		return price * (1 - discountRate) - discount;
	}
}

class HorrorMovie extends Movie {
	HorrorMovie(String title , String genre){
		super(title , genre);
		discount = 800;
	}
	
	double discountedPrice() {
		return price * (1 - discountRate) - discount;
	}
}

class ComedyMovie extends Movie {
	ComedyMovie(String title , String genre){
		super(title , genre);
		discount = 1500;
	}
	
	double discountedPrice() {
		return price * (1 - discountRate) - discount;
	}
}

public class MovieDiscountMain {
	public static void main(String[] args) {
		ActionMovie am = new ActionMovie("범죄도시" , "액션");
		HorrorMovie hm = new HorrorMovie("여고괴담" , "공포");
		ComedyMovie cm = new ComedyMovie("극한직업" , "코미디");
		
		Movie[] arr = {am , hm , cm};
		int totalPrice = 0;
		for(Movie movie : arr) {
			totalPrice += movie.discountedPrice();
		}
		System.out.println("총 예매금액 : " + totalPrice);
	}
}

// 영화 예매 금액의 총 합계를 계산하고자 함.
// 모든 영화의 정가는 10,000원이며, 기본 할인율을 10%이다.
// 또한 장르별로 추가로 할인 가능하며 할인 금액은 아래와 같다.
// 1. 액션 : 1,000원 / 2. 공포 : 800원 / 3. 코미디 : 1,500원
// 총 3장의 영화를 다음과 같이 예매하였을 때 총 예매 금액을 표시하시오.
// 1. 범죄도시(액션) / 2. 여고괴담(공포) / 3. 극한직업(코미디)
// 클래스 이름 : ActionMovie , HorrorMovie , ComedyMovie
// 추가로 필요한 클래스가 있다면 본인이 선택하여 작성하시오.