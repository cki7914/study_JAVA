package day0525;

public class Document {
	
	static int count = 0;
	String name;
	
	{
		name = "제목없음" + ++count;
	}
	
	Document() {}
	
	Document(String name) {
		this.name = name;
	}
	
}
