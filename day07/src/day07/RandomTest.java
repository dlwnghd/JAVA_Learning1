package day07;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
	// nextInt() --> Random이라는 클래스에 만들어져 있음
		Random r = new Random();
		
		// nextInt(값) --> 0부터 값 -1 사이의 정수를 랜덤으로 가져온다
		System.out.println(r.nextInt(100)+1);	// 랜덤한 int타입의 수를 가져옴
	}
}
