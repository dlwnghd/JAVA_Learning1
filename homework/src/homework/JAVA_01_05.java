package homework;

import java.util.Scanner;

public class JAVA_01_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 사용자에게 월을 입력 받아, 해당 월의 마지막 날을 출력하라
		// 단, 2월은 28일 까지 있다고 가정, switch문 사용
		
		System.out.print("월을 입력 >> ");				// 사용자에게 입력해야하는 정보 요구 문구
		int month = sc.nextInt();									// 입력값은 month라는 이름에 int(정수)값으로 받음
		
		switch (month) {													// month값에 따른 switch문 생성
		case 1,3,5,7,8,10,12:											// 1,3,5,7,8,10,12의 값일 경우
			System.out.println("31일");						// "31일" 출력
			break;																// case문 탈출을 위한 break문 사용
		case 2:																	// 2의 값일 경우
			System.out.println("28일");						//"28일" 출력
			break;																// case문 탈출을 위한 break문 사용
		case 4,6,9,11:														// 4,6,9,11의 값일 경우
			System.out.println("30일");						// "30일" 출력
			break;																// case문 탈출을 위한 break문 사용
		default:																	// 위의 case에 변수가 없는 경우
			System.out.println("지구는 12월까지만 있습니다.");		// "지구는 12월까지만 있습니다."를 출력
//			break;																// case문 탈출을 위한 break문 사용
		}
		

		// 사용자에게 국어 점수를 입력 받아
		// 국어점수가 90점 이상이라면 A
		// 80점이상 90미만 B
		// 70점이상 80미만 C
		// 70미만 F
		
		System.out.print("국어 점수 입력 >> ");		// 사용자에게 입력해야하는 정보 요구 문구
		int kor = sc.nextInt();										// 입력값은 kor라는 이름에 int(정수)값으로 받음
		
//		// if문
//		if (kor >= 90) {								// kor값이 90이상일 경우
//			System.out.println("A");			// "A"를 출력
//		}
//		if (kor >= 80 && kor < 90) {		// kor값이 80점이상 90미만일 경우
//			System.out.println("B");			// "B"를 출력
//		}
//		if (kor >= 70 && kor < 80) {		// kor값이 70점이상 80미만일 경우
//			System.out.println("C");			// "C"를 출력
//		}
//		if(kor < 70){										// kor값이 70미만일 경우
//			System.out.println("F");			// "F"를 출력
//		}
		
//		// if문 + else if문
//		if (kor >= 90) {								// kor값이 90이상일 경우
//			System.out.println("A");			// "A"를 출력
//		}else if (kor >= 80) {						// kor값이 80점이상 90미만일 경우
//			System.out.println("B");			// "B"를 출력
//		}else if (kor >= 70) {						// kor값이 70점이상 80미만일 경우
//			System.out.println("C");			// "C"를 출력
//		}else if(kor < 70){							// kor값이 70미만일 경우
//			System.out.println("F");			// "F"를 출력
//		}
		
		// if문 + else if문 + else문
				if (kor >= 90) {						// kor값이 90이상일 경우
					System.out.println("A");	// "A"를 출력
				}else if (kor >= 80) {				// kor값이 80점이상 90미만일 경우
					System.out.println("B");	// "B"를 출력
				}else if (kor >= 70) {				// kor값이 70점이상 80미만일 경우
					System.out.println("C");	// "C"를 출력
				}else{											// 그 외의 변수들
					System.out.println("F");	// "F"를 출력 
				}
		
//		//switch문
//		// 하지만 case문의 범위를 잡는 방법이 있는지 모르기 때문에
//		// 코드의 가독성이 너무 떨어진다고 생각함
//		switch(kor) {																// kor값에 따른 switch문 생성
//		case 100,99,98,97,96,95,94,93,92,91,90:		// kor 값이 100,99,98,97,96,95,94,93,92,91,90일 경우
//			System.out.println("A");									// "A"를 출력
//		break;																		// case문 탈출을 위한 break문 사용
//		case 89,88,87,86,85,84,83,82,81,80:				// kor 값이 89,88,87,86,85,84,83,82,81,80일 경우
//			System.out.println("B");									// "B"를 출력
//		break;																		// case문 탈출을 위한 break문 사용
//		case 79,78,77,76,75,74,73,72,71,70:				// kor 값이79,78,77,76,75,74,73,72,71,70일 경우
//			System.out.println("C");									// "C"를 출력
//		break;																		// case문 탈출을 위한 break문 사용
//		default:																		// 위의 case에 변수가 없는 경우
//			System.out.println("그외");								// "그외."를 출력
////			break;																	// case문 탈출을 위한 break문 사용
//		}
		
		
	}
}
