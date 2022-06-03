package day0603;

interface RemoteControl2 {
	void turnOn();
	void turnOff();
}

public class AnonymousMain {
	public static void main(String[] args) {
		RemoteControl2 rc = new RemoteControl2() {
			public void turnOn() {
				System.out.println("TV on");
			}
			public void turnOff() {
				System.out.println("TV off");
			}
		};
		
		rc.turnOn();
		rc.turnOff();
	}
}
