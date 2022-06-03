package day0603;

public class SmartTelevisionMain {
	public static void main(String[] args) {
		SmartTelevision st = new SmartTelevision();
		st.turnOn();
		st.setVolume(15);
		st.search("유튜브");
		st.turnOff();
	}
}
