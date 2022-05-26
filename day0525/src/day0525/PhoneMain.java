package day0525;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone phone_1 = new Phone("samsung" , "black" , 1200000);
		Phone phone_2 = new Phone("apple" , "white" , 1090000);
		
		System.out.printf("제조사 : %s / 색상 : %s / 가격 : %d\n" , phone_1.maker , phone_1.color , phone_1.price);
		System.out.printf("제조사 : %s / 색상 : %s / 가격 : %d\n" , phone_2.maker , phone_2.color , phone_2.price);

	}

}
