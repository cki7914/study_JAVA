package day0523;

public class TvMain3 {

	public static void main(String[] args) {
		
		Tv[] tvArr4 = new Tv[3];
		for(int i = 0 ; i < tvArr4.length ; i++) {
			tvArr4[i] = new Tv();
			tvArr4[i].channel = i + 10;
		}
		
		for(int i = 0 ; i < tvArr4.length ; i++) {
			tvArr4[i].channelUp();
			System.out.printf("tvArr4[%d].channel = %d\n" , i , tvArr4[i].channel);
		}

	}

}
