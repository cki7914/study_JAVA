package day0607;

import java.io.File;
import java.util.Scanner;

public class File1 {
	
	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("파일명 > ");
			File f = createFile(scan.nextLine());
			System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage() + " 다시 입력해주세요.");
		}
		
	}
	
	static File createFile(String fileName) throws Exception {
		if(fileName == null || fileName.equals(""))
			throw new Exception("파일 이름이 유효하지 않습니다.");
		
		File f = new File(fileName); // File 클래스 객체 생성
		f.createNewFile(); // File 객체의 createNewFile() 매서드를 이용하여 파일을 생성
		return f; // 생성된 객체의 참조를 반환함
	}
	
}
