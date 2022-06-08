package day0608;

public class Replace1 {
	public static void main(String[] args) {
		String oldStr = "안녕하세요~ 반갑습니다.....";
		String newStr = oldStr.replace("안녕하세요" , "Hello");
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
