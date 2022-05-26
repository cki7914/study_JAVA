package day0524;

public class StaticClass {

	public static void main(String[] args) {
		
		CarSta.showSumSta();
		
		CarSta cs_1 = new CarSta();
		cs_1.setCarSta(1111 , 11.22);
		
		CarSta.showSumSta();
		
		CarSta cs_2 = new CarSta();
		
		CarSta.showSumSta();
		
	}

}
