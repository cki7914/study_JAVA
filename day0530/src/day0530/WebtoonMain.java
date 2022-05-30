package day0530;

class Webtoon {
	private String title;
	private String genre;
	private String writer;
	
	private static int count = 0;
	
	public Webtoon() {
		this(null , null , null);
	}
	
	public Webtoon(String title , String genre , String writer) {
		this.title = title;
		this.genre = genre;
		this.writer = writer;
		++count;
	}
	
	public void print_info() {
		System.out.printf("Webtoon {제목 : %s, 장르 : %s, 작가 : %s}\n" , title , genre , writer);
	}
	
	public static int getCount() {
		return count;
	}
}

public class WebtoonMain {
	public static void main(String[] args) {
		Webtoon webtoons[] = {
				new Webtoon("나 혼자만 레벨업!" , "판타지" , "나혼자"),
				new Webtoon("스위트 집" , "스릴러" , "김달콤"),
				new Webtoon("이태원 클래식" , "드라마" , "이태원")
		};
		
		for(int i = 0 ; i < webtoons.length ; i++) {
			webtoons[i].print_info();
		}
		System.out.printf("총 웹툰의 수 : %d\n" , Webtoon.getCount());
	}
}

// 아래의 웹툰 목록을 객체화하여 출력 결과와 같은 결과값을 나타내시오.
// 웹툰 목록
//	제목 : 나 혼자만 레벨업!	장르 : 판타지	작가 : 나혼자
//	제목 : 스위트 집 		장르 : 스릴러	작가 : 김달콤
//	제목 : 이태원 클래식		장르 : 드라마	작가 : 이태원
//
// 출력 예
// Webtoon {제목 : 나혼자만 레벨업!, 장르 : 판타지, 작가 : 나혼자}
// Webtoon {...}
// Webtoon {...}
// 총 웹툰의 수 : 3