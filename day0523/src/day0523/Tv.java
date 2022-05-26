package day0523;

public class Tv {
	
	String color;
	boolean power;
	int channel;
	int volume;
	
	public void power() {power = !power;}
	public void channelUp() {++channel;}
	public void channelDown() {--channel;}
	public void volumeUp() {++volume;}
	public void volumeDown() {--volume;}
	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
	}
	void setChannel(int ch) {
		channel = ch;
	}
	
}
