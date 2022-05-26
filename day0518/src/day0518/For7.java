package day0518;

public class For7 {

	public static void main(String[] args) {
		
		// 두 개의 주사위를 던졌을 때 주사위의 합이 6이 되는 모든 경우의 수를 출력하시오.
		
		int dice_1 , dice_2;
		
		for(dice_1 = 1 ; dice_1 <= 6; dice_1++) {
			for(dice_2 = 1; dice_2 <= 6; dice_2++) {
				if(dice_1 + dice_2 == 6) {
					System.out.println("dice_1 : " + dice_1 + " / dice_2 : " + dice_2);
				}
			}
		}

	}

}
