package day05;
import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//		if(true) {
//			System.out.println("문장1");
//			if(true) {
//				System.out.println("문장3");
//			}
//			System.out.println("문장4");
//		}
//		System.out.println("문장2");	
		// 사용자에게 정수를 입력 받아서 짝수라면 짝수 출력하기
		// 홀수라면 홀수 출력하기
		Scanner sc = new Scanner(System.in);
//	System.out.print("정수를 입력해 주세요 : ");
//	int num1 = sc.nextInt();

		// if문
//	if (num1 % 2 == 0) {
//		System.out.println("짝수");
//	}
//	
//	if ( !(num1 % 2 == 0)) {
//		System.out.println("홀수");
//	}

//	// if + else문
//	if (num1 % 2 == 0) {
//		System.out.println("짝수");
//	}else{
//		System.out.println("홀수");
//	}
//	System.out.println("if문 바깥 문장");
//	
//	// 삼항연산자
//	System.out.println( num1 % 2 == 0 ? "짝수" : "홀수");

		// 두 수중 더 큰 수 출력하기
		// 만일 두 수가 같다면 같다고 출력하기
		System.out.print("정수 1 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 입력 >> ");
		int num2 = sc.nextInt();

//		// 삼항연산자
//		String res = num1 > num2 ? num1 + "" : num2 > num1 ? num2 + "" : "같다";
//		System.out.println(res);
//
//		// if + else
//		if (num1 > num2) {
//			System.out.println(num1);
//		} else {
		System.out.println("이제 뭐 다른 것을 비교해 보겠습니다.");
//			if (num2 > num1) {
//				System.out.println(num2);
//			} else {
//				System.out.println("같다");
//			}
//		}

		// 들여쓰기 맞추기 : 드래그(ctrl + a) >> ctrl + shift + f

		// if + else if + else
		if (num1 > num2) {
			System.out.println(num1);
		} else if (num2 > num1) {
			System.out.println(num2);
		} else {
			System.out.println("같다");
		}
	}

}