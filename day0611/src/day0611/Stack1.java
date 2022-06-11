package day0611;

import java.util.Stack;

class Coin {
	private int value;
	
	public Coin(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

public class Stack1 {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// 100 , 50 , 500 , 10
		coinBox.add(new Coin(100));
		coinBox.add(new Coin(50));
		coinBox.add(new Coin(500));
		coinBox.add(new Coin(10));
		
		// peek() : stack의 맨 위에 저장된 객체를 반환
		// pop()과 달리 stack에서 객체를 꺼내지 않음
		System.out.println(coinBox.peek().getValue());
		
		while(!coinBox.empty()) {
			System.out.println("꺼내온 동전 : " + coinBox.pop().getValue());
		}
	}
}
