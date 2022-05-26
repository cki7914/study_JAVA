package day0526;

public class TvMain {
	public static void main(String[] args) {
		SmartTv sTv = new SmartTv();
		
		if(sTv.power != true) {
			sTv.power();
			System.out.println("smartTv 전원을 켭니다.");
		}
		
		sTv.channel = 10;
		sTv.channelUp();
		sTv.channelUp();
		System.out.println("현재 채널은 " + sTv.channel + "입니다.");
		sTv.channelDown();
		System.out.println("현재 채널은 " + sTv.channel + "입니다.");
		
		if(sTv.netflex.power != true) {
			sTv.netflex.power();
			System.out.println("넷플릭스를 켭니다.");
		}
		
		sTv.play();
		sTv.rew();
		sTv.stop();
		sTv.ff();
		sTv.play();
		
		if(sTv.netflex.power == true) {
			sTv.netflex.power();
			System.out.println("넷플릭스를 끕니다.");
		}
		
		if(sTv.power == true) {
			sTv.power();
			System.out.println("smartTv 전원을 끕니다.");
		}
	}
}
