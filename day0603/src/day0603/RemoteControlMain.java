package day0603;

public class RemoteControlMain {
	public static void main(String[] args) {
		Television t = new Television();
		t.turnOn();
		t.setVolume(5);
		t.turnOff();
		
		System.out.println();
		
		Audio a = new Audio();
		a.turnOn();
		a.setVolume(7);
		a.turnOff();
	}
}
