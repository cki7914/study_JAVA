package day0524;

//class Data {
//	
//	int x;
//	
//}

public class Reference {
	
	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d) ");
		System.out.println("main () : x = " + d.x);
		
	}
	
	static void change(Data data) {
		data.x = 1000;
		System.out.println("Change() : d.x = " + data.x);
	}
	
}
