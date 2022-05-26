package day0523;

public class TvMain1 {

	public static void main(String[] args) {
		
		Tv t = new Tv();
		
		t.channel = 7;
		t.volume = 10;
		
		System.out.println("t의 채널은 " + t.channel + "이고 볼륨은 " + t.volume + "입니다.");
		
		t.channelDown();
		
		System.out.println("t의 채널은 " + t.channel + "이고 볼륨은 " + t.volume + "입니다.");
		
		System.out.println();
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.printf("t1의 channel : %d , t1의 volume : %d%n" , t1.channel , t1.volume);
		System.out.printf("t2의 channel : %d , t2의 volume : %d%n" , t2.channel , t2.volume);
		
		t1.channel = 7;
		t1.volume = 20;
		
		System.out.println();
		System.out.printf("t1의 channel : %d , t1의 volume : %d%n" , t1.channel , t1.volume);
		System.out.printf("t2의 channel : %d , t2의 volume : %d%n" , t2.channel , t2.volume);
		
		t2 = t1;
		
		System.out.println();
		System.out.printf("t1의 channel : %d , t1의 volume : %d%n" , t1.channel , t1.volume);
		System.out.printf("t2의 channel : %d , t2의 volume : %d%n" , t2.channel , t2.volume);
		
		System.out.println();
		
		Tv t3 = new Tv();
		Tv t4 = new Tv();
		
		t4 = t3;
		t3.channel = 9;
		
		System.out.printf("t3의 channel : %d , t3의 volume : %d%n" , t3.channel , t3.volume);
		System.out.printf("t4의 channel : %d , t4의 volume : %d%n" , t4.channel , t4.volume);

	}

}
