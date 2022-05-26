package day0525;

public class DocumentMain {
	
	public static void main(String[] args) {
		
		Document d1 = new Document();
		Document d2 = new Document("str1");
		Document d3 = new Document("str2");
		Document d4 = new Document();
		
		System.out.println("d1 : " + d1.name);
		System.out.println("d2 : " + d2.name);
		System.out.println("d3 : " + d3.name);
		System.out.println("d4 : " + d4.name);
		
	}
	
}
