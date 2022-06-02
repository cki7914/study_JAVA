package day0602;

import java.util.Scanner;

public class PokemonMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Pokemon pokemon = null;
		System.out.println("캐릭터를 선택하세요!");
		System.out.println("1. 피카츄 / 2. 꼬부기 / 3. 파이리");
		int input = scan.nextInt();
		switch(input) {
		case 1 :
			pokemon = new Pikachu();
			System.out.println("피카츄를 선택하셨습니다.");
			break;
		case 2 :
			pokemon = new Squirtle();
			System.out.println("꼬부기를 선택하셨습니다.");
			break;
		case 3 :
			pokemon = new Charmander();
			System.out.println("파이리를 선택하셨습니다.");
			break;
		default :
			System.out.println("input error");
		}
		
		while1 : while(true) {
			System.out.println("------------------");
			pokemon.printInfo();
			System.out.println("------------------");
			System.out.println("1. 밥먹이기 / 2. 잠재우기 / 3. 놀아주기 / 4. 운동시키기 / 5. 종료");
			
			input = scan.nextInt();
			switch(input) {
			case 1 :
				pokemon.eat();
				break;
			case 2 :
				pokemon.sleep();
				break;
			case 3 :
				pokemon.play();
				break;
			case 4 :
				pokemon.training();
				break;
			case 5 :
				System.out.println("게임을 종료합니다.");
				break while1;
			default :
				System.out.println("input error");
			}
			
			if(pokemon.energy <= 0) {
				System.out.println("당신의 캐릭터가 사망했습니다.");
				System.out.println("다음엔 좀 더 잘해보세요!");
				break;
			}
			if(pokemon.hp >= 40) {
				System.out.println("당신의 캐릭터가 성장했습니다!");
				pokemon.levelUp();
			}
		}
		
		scan.close();
	}
}
