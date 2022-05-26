package day0526;

public class SmartTv extends Tv{
	Netflex netflex = new Netflex();
	
	int counter = netflex.counter;
	
	void play() { netflex.play(); }
	void stop() { netflex.stop(); }
	void rew() { netflex.rew(); }
	void ff() { netflex.ff(); }
}
