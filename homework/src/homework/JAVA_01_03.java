package homework;
import java.util.Scanner;

public class JAVA_01_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 노래 한 곡당 300원인 코인노래방에서
		사용자에게 금액(int)을 입력받아서 부를 수 있는 노래와 잔돈을 출력하라
		int money;
		int song = money / 300; // 곡 수
		int rest = money % 300; // 잔돈
		*/
		
		int cost = 500;	// 1곡 당 가격
		System.out.printf("1. 노래 한 곡당 %d원인 코인노래방에서\n"
				+ "사용자에게 금액(int)을 입력받아서 부를 수 있는 노래와 잔돈을 출력하라\n",cost);
		System.out.print("금액을 입력해주세요(원(won) : ");	// 출력문
		int money = sc.nextInt();	// 금액 입력
		int song = money / cost;	 // 곡 수
		int rest = money % cost;	// 잔돈
		
		System.out.printf("부를 수 있는 노래 수 : %d곡\n", song);
		System.out.printf("잔돈 : %d원\n\n", rest);
		
		/*
		// 2. 10~99사이의 숫자(int 혹은 String일텐데...)를 입력받아 십의자리와 일의자리를 각각 출력하라
		99
		99 % 10 --> 9 // (일의자리 출력)
		99 / 10 --> 9 // (십의자리 출력)
		십의자리 : 9
		일의자리 : 9
		*/
		System.out.println("2. 10~99사이의 숫자(int 혹은 String일텐데...)를 입력받아 십의자리와 일의자리를 각각 출력하라");
		System.out.println("--- int 풀이 ---");
		System.out.print("10~99의 숫자를 입력해주세요 : ");	// 출력문
		int num = sc.nextInt();
		int ones = num  / 10;	// ex) 15 / 10 --> 1
		int tenth = num % 10;	// ex) 15 % 10 --> 5
		
		System.out.printf("십의자리 : %d\n", ones);
		System.out.printf("일의자리 : %d\n\n", tenth);
		
		/*
		3.사용자에게 국어, 영어점수(int)를 입력받아서 평균(double)을 출력하라
		int korean, math;
		double ave = (double)((국어점수+영어점수)/2); // 평균값
		*/
		System.out.println("3.사용자에게 국어, 영어점수(int)를 입력받아서 평균(double)을 출력하라");
		System.out.print("국어 점수를 입력해주세요 : ");
		int korean = sc.nextInt();
		System.out.print("영어 점수를 입력해주세요 : ");
		int english = sc.nextInt();
		double ave = (double)(korean + english)/2;
		
		System.out.printf("평균 : %.1f\n\n", ave);
		
		/*
		4.char target = 'a';  //입력한 값들에 따라 전부 대문자로 변환
		// target에 담긴 a를 대문자 A로 바꾸어 출력하라
		(아스키코드 참고) 32씩 차이가 남
		target값을 사용자로 부터 콘솔창에서 입력 받고*/
		System.out.println("4.char target = 'a';  //입력한 값들에 따라 전부 대문자로 변환\n"
				+ "target에 담긴 a를 대문자 A로 바꾸어 출력하라\n");
		
//		System.out.println("---기본 문제---");
//		sc.nextLine();
		char target = 'a';
		
//		System.out.println("---입력 값을 String으로 입력 받았을 경우---");
//		sc.nextLine();
//		System.out.print("알파벳 소문자 하나를 입력해주세요(ex) c ) : ");
//		String target = sc.next();
//		int target_num = Integer.parseInt(target);	// 명시적 변환
//		target_num = target_num-32;
//		char target_num_big = (char)target_num;	// 명시적 변환
//		System.out.printf("입력한 알파벳 : %c\n", target);
//		System.out.printf("대문자 알파벳 : %c\n", target_num_big);
		
//		System.out.println("---입력 값을 char로 입력 받았을 경우---");
//		sc.nextLine();
//		System.out.print("알파벳 소문자 하나를 입력해주세요(ex) c ) : ");
//		char target = sc.next().charAt(0);	// 인터넷에서 char입력 받는방법을 찾아서 푼 방법
		
//		System.out.println("---암묵적 변환---");
//		int target_num = target - 32;	// char - int --> int, 암묵적 변환
		
		System.out.println("---명시적 변환 + 암묵적 변환---");
		int target_num = (int)target -32;	// char(소문자) -> int - 32,	명시적 변환 + 암묵적 변환
		
		char target_num_big = (char)target_num; // int -> char(대문자),	명시적 변환
		System.out.printf("입력한 알파벳 : %c\n", target);
		System.out.printf("대문자 알파벳 : %c\n", target_num_big);
	}
}