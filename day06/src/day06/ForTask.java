package day06;

import java.util.Iterator;
import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 사용자에게 이름과 반복횟수를 입력받아서
		// 해당 횟수만큼 입력받은 이름을 출력하라
//		System.out.print("이름 입력 >> ");					// 사용자로부터 이름 입력을 유도
//		String name = sc.next();									// name이라는 변수로 String타입으로 입력 값을 저장
//		System.out.print("반복 횟수 입력 >> ");			// 사용자로부터 반복 횟수 입력을 유도
//		int cnt = sc.nextInt();										// cnt라는 변수로 int타입으로 입력 값을 저장
//		
//		for (int i = 0; i < cnt; i++) {		// i는 0부터; i가 cnt미만인 동안; i를 점점 추가
//			System.out.println(name);
//		}

//		// 2. 10 9 8 7 6 5 4 3 2 1 출력하기
//		// 디버깅표 작성해보기
//		for(int i = 10; i > 0; i--) {
//			System.out.print(i + " ");
//		}

//		int num = 10;
//		for(int i = 0; i < 10; i++) {
//			System.out.print(num + " ");
//			num = num - 1;
//		}

//		System.out.println();
//		// 3. 1부터 100까지 숫자 중 짝수만 가로로 출력하기
//		String res = "";
//		for (int i = 1; i < 100; i++) {
//			if (i % 2 == 0) {
//				res += i + " ";
//				res = res + i + " ";					// res라는 String 값에 2 4 6 8 10 ... 96 98까지를 res에 집어 넣은 것
//				System.out.print(i + " ");
//			}
//		}
//		
//		res = "";
//		for (int i = 1; i < 100; i++) {
//			if (i % 2 == 1) {
//				continue; // 즉시 다음 반복으로 이동(아래로 이동하는 것이 아닌 증감체로 이동)
////				System.out.println("안녕"); dead code
//			}
//			res += i + " ";
//		}
//		System.out.println(res); // 마지막에 res 하나만 출력

		// 4. 1부터 10까지 총합 구하기
//		int total = 0;
//		for(int i = 1; i <=10; i++) {
//			total +=  i;		// total = total + i;
//		}
//		System.out.println(total);

		// 4-1. 1부터 사용자가 입력한 값까지 총합 구하기
//		int total = 0;
//		System.out.println("몇까지 합을 구할까요? >> ");
//		int num = sc.nextInt();
//		for(int i = 1; i <=num; i++) {
//			total +=  i;		// total = total + i;
//		}
//		System.out.println(total);
		
		
		// 5. 구구단 3단 출력하기
		// --- -3단----
		// 3 * 1 = 3
		// 3 * 2 = 6
		// 3 * 3 = 9
		// ...
		// 3 * 9 = 27
		int num = 0;
		System.out.println("----3단----");
		for(int i = 1; i < 10; i++) {
			num = 3 * i;
		System.out.println("3 * " + i + " = " + num);	
		}
		
//		for(int i = 0; i < 9; i++) {
//		System.out.println("3 * " + (i+1) + " = " + (i+1);	
//		}
		

	}

}
