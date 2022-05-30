package day0530;

class MyTv {
	private boolean isPowerOn; // 전원
	private int channel; // 채널
	private int volume; // 볼륨
	private int prevChannel; // 이전 채널
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	// 문제
	// MyTv 클래스의 맴버변수 isPowerOn, channel, volume은 클래스 외부에서 접근할 수 없음.
	// 이 맴버 변수들의 값을 어디서나 읽고 변경할 수 있도록 getter와 setter 매서드를 추가하시오.
	// 매개변수가 있는 매서드는 반드시 작업 전에 넘겨받은 값의 유효성 검사를 실시할 것.
	
	public void set_isPowerOn() {
		isPowerOn = !isPowerOn;
	}
	
	public boolean get_isPowerOn() {
		return isPowerOn;
	}
	
	public void set_channel(int channel) {
		if(channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
			prevChannel = this.channel;
			this.channel = channel;
			
			System.out.println("채널을 " + channel + "번으로 설정합니다.");
		} else {
			System.out.println("notion : input error");
		}
	}
	
	public int get_channel() {
		return channel;
	}
	
	public void set_volume(int volume) {
		if(volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
			this.volume = volume;
			
			System.out.println("볼륨을 " + volume + "으로 설정합니다.");
		} else {
			System.out.println("notion : input error");
		}
	}
	
	public int get_volume() {
		return volume;
	}
	
	public void gotoPrevChannel() {
		System.out.println("이전 채널로 돌아갑니다.");
		
		set_channel(prevChannel);
	}
}

public class TvMain {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		t.set_channel(10);
		t.set_volume(20);
		
		t.set_channel(50);
		t.gotoPrevChannel();
		System.out.println("channel : " + t.get_channel());
	}
}
