package day06;

import java.util.Scanner;

public class ForTest {
	public static void main(String[] args) {
//		// 초기식; 조건식; 증감식;
//		// i = 0부터 시작해서; i가 3미만인 동안 반복; 매 횟수마다 i에 1을 더해줘
//		// 이 때 첫번째 i는 처음에 준 0이다.
//		// 관례적으로는 i는 0부터, i는 값보다 미만,
//		// 후에 0을 사용하는 것이 더 편하니 익숙해지는 것이 좋을 수 있음
//		for (int i = 0; i < 3; i++) {
//			System.out.println(i + "이주홍");
//		}
//		System.out.println("for문 바깥 문장");

//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("i 입력 >> ");
//		
//		for (int i = sc.nextInt(); i < 10; i++) {
//			System.out.println(i + "이주홍");
//		}
//		System.out.println("for문 바깥 문장");	

		// 0 1 2 3 4 5 6 7 8 9 출력
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}

		// 1 2 3 4 5 6 7 8 9 10 출력
//		int num = 1;
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + " ");
//			num = num++;
		}
		

	}
}