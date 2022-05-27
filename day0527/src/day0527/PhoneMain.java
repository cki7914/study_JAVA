package day0527;

public class PhoneMain {
	public static void main(String[] args) {
		Galaxy g1 = new Galaxy("갤럭시Z플립" , "6.7인치 Dynamic Amoled" , 1500000);
		g1.showInfo();
		
		System.out.println();
		
		Apple i1 = new Apple("IPhone12Pro" , "6.7인치 Super Letina" , 1400000);
		i1.showInfo();
	}
}
