package day0608;

import java.io.UnsupportedEncodingException;

public class GetBytes {
	public static void main(String[] args) {
		// getBytes() : 시스템의 기본 문자셋으로 인코딩된 바이트 배열을 반환
		
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length);
		
		String str1 = new String(bytes1);
		System.out.println(str1);
		
		byte[] bytes2;
		byte[] bytes3;
		try {
			bytes2 = str.getBytes("UTF-8");
			System.out.println(bytes2.length);
			
			String str2 = new String(bytes2);
			System.out.println(str2);
			
			bytes3 = str.getBytes("EUC-KR");
			System.out.println(bytes3.length);
			
			String str3 = new String(bytes3);
			System.out.println(str3);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
