package day0525;

public class ProductTest {

	public static void main(String[] args) {
		 
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1 : " + p1.serialNo);
		System.out.println("p2 : " + p2.serialNo);
		System.out.println("p3 : " + p3.serialNo);
		System.out.println("총 제품의 수는 " + Product.count);

	}

}
