package day0608;

class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Member)) return false;
		
		Member mem = (Member)obj;
		return this.id == mem.id;
	}
}

public class Equals2 {
	public static void main(String[] args) {
		Member mem1 = new Member("blue");
		Member mem2 = new Member("blue");
		Member mem3 = new Member("red");
		
		if(mem1.equals(mem2)) {
			System.out.println("mem1 == mem2");
		} else {
			System.out.println("mem1 != mem2");
		}
		
		if(mem1.equals(mem3)) {
			System.out.println("mem1 == mem3");
		} else {
			System.out.println("mem1 != mem3");
		}
	}
}
