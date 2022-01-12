package day07;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
//		for (int i = 0; i < 3; i++) {
//			System.out.println("for문 안쪽 문장");
//		}
//		System.out.println("for문 바깥 문장");
//
//		int i = 0;
//		while (i < 3) {
//			System.out.println("while문 안쪽 문장");
//			i++;
//		} // 끝나면 무조건 조건식 다시 물어봄
//		System.out.println("while문 바깥 문장"); // while문은

		Scanner sc = new Scanner(System.in);

//		while은 무한반복을 할 때 효율적
//		while (true) {
//			System.out.print("1. 주문하기 2. 결제하기 >> "); // 사용자로부터 메뉴 입력 유도
//			int choice = sc.nextInt(); // 사용자로부터 입력받은 값을 choice에 저장
//			if (choice == 3) {
//				break; // break를 만나면 즉시 반복문을 탈출한다
//			}
//		}
		
		int choice = 0;
		
		do {
			System.out.println("1. 주문하기 2. 결제하기 0. 나가기>> ");
			choice = sc.nextInt();
		} while (choice != 0);
		
		
		// 나가기가 3이라면 문제가 없지만 0으로 바꾼다면 choice의 초기값이 0이기 때문에 문제가 발생함
		// 설령 choice값을 다른 값으로 바꾸더라도 개발자의 관점에서 협업을 할때 왜 다른 값을 했는지는 나만 알 수 있는 코드가 되어버림
//		while (choice != 0) {
//			System.out.print("1. 주문하기 2. 결제하기 0. 나가기>> "); // 사용자로부터 메뉴 입력 유도
//			choice = sc.nextInt(); // 사용자로부터 입력받은 값을 choice에 저장
//		}
	}
}