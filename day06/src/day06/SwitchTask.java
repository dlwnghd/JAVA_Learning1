package day06;
import java.util.Scanner;

import java.util.Scanner;

public class SwitchTask {
	public static void main(String[] args) {
		// 사용자에게 월을 입력 받아서 해당 월의 마지막 날 출력하기
		// 2월 28일까지로 가정
		Scanner sc = new Scanner(System.in);
		
//		// [ 내풀이 ]
//		System.out.print("월을 입력 >> ");				// 사용자에게 입력해야하는 정보 요구 문구
//		int month = sc.nextInt();									// 입력값은 month라는 이름에 int(정수)값으로 받음
//		
//		switch (month) {													// month값에 따른 switch문 생성
//		case 1,3,5,7,8,10,12:											// 1,3,5,7,8,10,12의 값일 경우
//			System.out.println("31일");						// "31일" 출력
//			break;																// case문 탈출을 위한 break문 사용
//		case 2:																	// 2의 값일 경우
//			System.out.println("28일");						//"28일" 출력
//			break;																// case문 탈출을 위한 break문 사용
//		case 4,6,9,11:														// 4,6,9,11의 값일 경우
//			System.out.println("30일");						// "30일" 출력
//			break;																// case문 탈출을 위한 break문 사용
//		default:																	// 위의 case에 변수가 없는 경우
//			System.out.println("지구는 12월까지만 있습니다.");		// "지구는 12월까지만 있습니다."를 출력
////			break;																// case문 탈출을 위한 break문 사용
//		}

		// [선생님 풀이]
		// [풀이3]
		// 1.8버전에서도 사용할 수 있는 방법
//		System.out.print("월 입력 >>");
//		int month = sc.nextInt();
//		
//		switch(month) {
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//			System.out.println("31일");
//			break;
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//			System.out.println("30일");
//			break;
//		case 2:
//			System.out.println("28일");
//			break;
//		default:
//			System.out.println("존재하지 않는 월입니다");
//		}
		
		
		//[풀이2]
//		// 회사에서 JAVA 1.8버전을 사용하고 있다면 동작하지 않음
//		// 아래 방법은 11버전에서만 사용이 가능하다.
//		System.out.print("월 입력 >>");
//		int month = sc.nextInt();
//		
//		switch (month) {													// month값에 따른 switch문 생성
//		case 1,3,5,7,8,10,12:											// 1,3,5,7,8,10,12의 값일 경우
//			System.out.println("31일");						// "31일" 출력
//			break;																// case문 탈출을 위한 break문 사용
//		case 2:																	// 2의 값일 경우
//			System.out.println("28일");						//"28일" 출력
//			break;																// case문 탈출을 위한 break문 사용
//		case 4,6,9,11:														// 4,6,9,11의 값일 경우
//			System.out.println("30일");						// "30일" 출력
//			break;																// case문 탈출을 위한 break문 사용
//		default:																	// 위의 case에 변수가 없는 경우
//			System.out.println("지구는 12월까지만 있습니다.");		// "지구는 12월까지만 있습니다."를 출력
////			break;																// case문 탈출을 위한 break문 사용
//		}
		
		//[풀이]1
//		System.out.print("월 입력 >>");
//		int month = sc.nextInt();
//		
//		switch(month) {
//		case 1:
//			System.out.println("31일");
//		case 2:
//			System.out.println("28일");
//		case 3:
//			System.out.println("31일");
//		case 4:
//			System.out.println("30일");
//		case 5:
//			System.out.println("31일");
//		case 6:
//			System.out.println("30일");
//		case 7:
//			System.out.println("31일");
//		case 8:
//			System.out.println("31일");
//		case 9:
//			System.out.println("31일");
//		case 10:
//			System.out.println("31일");
//		case 11:
//			System.out.println("31일");
//		case 12:
//			System.out.println("31일");
//		}
		
		// 사용자에게 국어 점수를 입력 받아
		// 국어점수가 90점 이상이라면 A
		// 80점이상 90미만 B
		// 70점이상 80미만 C
		// 70미만 F
		
		// [선생님 풀이]
		// 물론 불필요한 계산이 많음
		System.out.print("국어 점수 입력 >> ");		// 사용자에게 입력해야하는 정보 요구 문구
		int kor = sc.nextInt();										// 입력값은 kor라는 이름에 int(정수)값으로 받음
		
		switch(kor/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
//			break;
		}
		
//		// [ 내풀이 ]
		// if문 + else if문 + else문
		
//		System.out.print("국어 점수 입력 >> ");		// 사용자에게 입력해야하는 정보 요구 문구
//		int kor = sc.nextInt();										// 입력값은 kor라는 이름에 int(정수)값으로 받음
//		
//		if (kor >= 90) {						// kor값이 90이상일 경우
//			System.out.println("A");	// "A"를 출력
//		}else if (kor >= 80) {				// kor값이 80점이상 90미만일 경우
//			System.out.println("B");	// "B"를 출력
//		}else if (kor >= 70) {				// kor값이 70점이상 80미만일 경우
//			System.out.println("C");	// "C"를 출력
//		}else{											// 그 외의 변수들
//			System.out.println("F");	// "F"를 출력 
//		}
	}
}
