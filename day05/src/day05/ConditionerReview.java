package day05;
import java.util.Scanner;

public class ConditionerReview {
	public static void main(String[] args) {
		
		// 두 정수를 입력 받아 두 정수의 차 구하기
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 1 입력 >> ");
//		int num1 = sc.nextInt();
//		System.out.print("정수 2 입력 >> ");
//		int num2 = sc.nextInt();
//		int res = num1 > num2 ? num1 - num2 : num2 - num1;
//		System.out.println("두 수의 차는 " + res + "입니다");
		
		// 사용자에게 나이를 입력 받아서 나이가 10이상 30이하이면 1500원 아니면 무료 출력하기
//		System.out.print("나이 입력 >> ");
//		int age = sc.nextInt();
//		
//		System.out.println(age >= 10 && age <= 30 ? "1500원" : "무료");
		
		// 8살 이상, 110cm 이상 놀이기구
//		System.out.print("나이 입력 >> ");
//		int age = sc.nextInt();
//		System.out.print(" 키 입력 >> ");
//		int height = sc.nextInt();
//		
//		System.out.println(age >= 8 && height >= 110 ? "탑승 가능" : "탑승 불가능");
		
		// 20개의 라면이 들어갈 수 있는 상자가 몇 개 필요한지 알려주는 프로그램
//		System.out.print("라면이 몇개 있나요? >> ");
//		int ramen = sc.nextInt();
//		int boxCnt = ramen % 20 >0 ? ramen / 20+1 : ramen / 20;
//		
//		System.out.println("필요한 상자의 갯수는 "+ boxCnt + "개 입니다");
		
		
		// 두 수중 더 큰 수 출력하기
		// 만일 두 수가 같다면 같다고 출력하기
		System.out.print("정수 1 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 입력 >> ");
		int num2 = sc.nextInt();
		
		String res = num1 > num2 ? num1 + "" : num2 > num1 ? num2 + "" : "같다";
		
		System.out.println(res);
	}

}









