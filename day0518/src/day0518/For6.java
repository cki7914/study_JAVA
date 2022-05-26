package day0518;

public class For6 {

	public static void main(String[] args) {
		
		// 1 + (-2) + 3 + (-4) ... 를 계속 계산했을 때 총합이 100이상 되는 것은 몇번째?
		
		int num = 0;
		int count = 1;
		
		while(true) {
			if(count % 2 == 1) {
				num += count;
			} else if(count % 2 == 0) {
				num -= count;
			}
			
			if(num >= 100) {
				break;
			} else {
				count++;
			}
		}
		
		System.out.println(count);
		
		//------------------------------------------------------------------
		
		int num2 = 0;
		int count2;
		
		for(count2 = 1 ; ; count2++) {
			if(count2 % 2 == 1) {
				num2 += count2;
			} else if(count2 % 2 == 0) {
				num2 -= count2;
			}
			
			if(num2 >= 100) {
				break;
			}
		}
		
		System.out.println(count2);
		
		// ---------------------------------------------------------------------
		
		int i;
		int s = 1;
		int num3 = 0;
		
		for(i = 1 ; true ; i++ , s = -s) {
			num3 += i * s;
			
			if(num3 >= 100) {
				break;
			}
		}
		
		System.out.println(i);

	}

}
