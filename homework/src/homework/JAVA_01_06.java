package homework;

public class JAVA_01_06 {
	public static void main(String[] args) {
//		[오늘의 문제]
		// 1번
		/*
		 * 	*
		 * 	**
		 * 	***
		 * 	****
		 * *****
		 * 
		 * */
		
//		전체적으로 보면 
//		1. i가 5미만이면 2번으로 후에 다시 시작시 i++ 아니면 for문 탈출
//		2. j가 i이하라면 3번으로 후에 다시 시작시 j++ 아니면 for문 탈출
//		3. "*"을 출력 후 2번으로
//		4. "엔터" 입력 후 1번으로
		
//		for(int i =0; i <5; i++) {		// i는 0; i가 5미만동안; i = i+1; (i => 0,1,2,3,4)
//			for(int j = 0; j <= i; j++) {	// j는 0; j가 i이하인 동안; j = j + 1; (j => 0,1,2,3,4 지만 i보다 클 수 없음)
//				System.out.print("*");	// "*"출력
//			}
//			System.out.println();	// 다음 줄로 이동
//		}
		
		
		// 2번
		/*
		 *       *
		 *      **
		 *    ***
		 *  ****
		 * *****
		 * */
		
//		전체적으로 보면 
//		1. num 정의
//		2. i가 0미만이면 3번으로 후에 다시 시작시 i-- 아니면 for문 탈출
//		3. j가 i-1미만라면 4번으로 후에 다시 시작시 j++ 아니면 for문 탈출
//		4. " "을 출력 후 3번으로
//		5. "*" 입력, num에 1을 더해준 후 2번으로
		
//		int num = 1;	// int num은 1로 정의
//		for(int i =5; i >0; i--) {		// i는 5; i가 0초과동안 반복; i = i-1;
//			for(int j = 0; j < i-1; j++) {	// j는 0; j가 (i-1)미만동안 반복; j = j + 1;
//				System.out.print(" ");	// "*"출력
//			}
//			for(int j = 0; j < num; j++) {		// j는 0; j가 num미만동안 반복; j = j + 1;
//				System.out.print("*");		// "*" 출력
//			}
//			System.out.println();	// Enter 줄 바꿈
//			num++;		// num = num + 1
//		}
		
		// 3번
		// 구구단 2단부터 9단까지 출력
		
//		전체적으로 보면 
//		1. num 정의
//		2. i가 10미만이면 3번으로 후에 다시 시작시 i++ 아니면 for문 탈출
//		3. "----i단----" 출력 후 4번으로
//		4. j가 10미만라면 5번으로 후에 다시 시작시 j++ 아니면 for문 탈출
//		5. num = i * j 계산 후  "i * j = num" 형태가 나오도록 출력 후 4번으로
		
		int num = 0;		// int num은 0으로 정의
		for(int i=1; i <10; i++) {			// i는 1; i가 10미만동안 반복; i = i+1;
			System.out.println("----"+i+"단----");			// i에 맞춰서 몇단인지 출력
			for(int j = 1; j < 10; j++) {		// j는 1; j가 10미만동안 반복; j = j + 1;
				num = i * j;		// num은 i * j
				System.out.println(i + " * " + j + " = " + num);		// "i * j = num" 형태가 나오도록 출력	
			}
		}
		
		for (int i = 0; i < 8; i++) {
			System.out.println("----" + (i+2) + "단----"); // i에 맞춰서 몇단인지 출력
			for (int j = 0; j < 9; j++) {
				System.out.println((i + 2) + "x" + (j + 1) + "=" + (i + 2) * (j + 1));
			}
		}
		
		// 내가 낸 문제
		// 사용자의 입력 값에 따라 별 출력하기
		// ex) 6
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * ******
		 * *******
		 * */
		
//		Scanner sc = new Scanner(System.in);		// 사용자 입력값을 받기 위해 Scanner 불러오기
//		System.out.print("'*'의 반복 횟수를 입력해주세요.");		// 사용자로 부터 반복횟수 유도
//		int num = sc.nextInt();		// num은 사용자의 입력값을 int로 저장
//		for (int i = 0; i < num; i++) { // i는 0; i가 6미만동안; i = i+1;		// i는 0; i가 num미만동안 반복; i = i+1;
//			for (int j = 0; j <= i; j++) { // j는 0; j가 i미만동안; j = j + 1;		// j는 0; j가 i이하동안 반복; j = j + 1;
//				System.out.print("*"); // "*"출력			// "*"출력
//			}
//			System.out.println(); // 다음 줄로 이동
//		}
	}
}