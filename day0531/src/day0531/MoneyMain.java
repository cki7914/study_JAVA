package day0531;

abstract class Money {
	double price;
	
	Money(double price){
		this.price = price;
	}
	
	abstract void printInfo();
}

class KRW extends Money {
	KRW(double price) {
		super(price);
	}
	
	void printInfo() {
		System.out.printf("KRW : %.2f원\n" , price);
	}
}

class USD extends Money {
	USD(double price) {
		super(price);
	}
	
	void printInfo() {
		System.out.printf("USD : %.2f달러\n" , price);
	}
}

class EUR extends Money {
	EUR(double price) {
		super(price);
	}
	
	void printInfo() {
		System.out.printf("EUR : %.2f유로\n" , price);
	}
}

public class MoneyMain {
	public static void main(String[] args) {
		Money[] Curreny = {new KRW(1500.00) , new USD(100.50) , new EUR(260.75)};
		
		for(Money i : Curreny) {
			i.printInfo();
		}
	}
}

// 각국 통화(원화 / 달러 / 유로)의 금액을 출력하고자 한다.
// 원화 : 1500원 , 달러 : 100.50달러 , 유로 : 260.75유로
// 모든 화폐를 Curreny 배열에 담고, 반복문을 이용하여 금액을 출력하시오.
// 출력 예시
// KRW : 1500.00원
// USD : 100.50달러
// EUR : 260.75유로