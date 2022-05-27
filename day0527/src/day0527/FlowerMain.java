package day0527;

public class FlowerMain {
	public static void main(String[] args) {
		Rose rose = new Rose("장미" , 1500);
		rose.flowerInfo();
		
		Tulip tulip = new Tulip("튤립" , 2000);
		tulip.flowerInfo();
	}
}
