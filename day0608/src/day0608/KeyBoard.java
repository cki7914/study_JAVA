package day0608;

import java.io.IOException;

public class KeyBoard {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("입력 > ");
		// System.in.read() : 키보드에서 입력한 내용을 매개변수 값으로 주어진 바이트 배열에 저장하고 읽은 바이트 수를 리턴함
		int readByte = System.in.read(bytes);
		
		String str = new String(bytes , 0 , readByte);
		System.out.println(str);
	}
}
