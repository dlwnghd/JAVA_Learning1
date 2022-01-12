package day04;

import java.util.Scanner;

public class ConditionalTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// target에 들어있는 문자가 소문자라면 소문자입니다 출력하고,
		// 아니라면 소문자가 아닙니다 출력하기
		char target = 'a';
		System.out.println((int)target > 96 && (int)target < 123 ? "소문자입니다" : "소문자가 아닙니다");
		
		// 사용자에게 두 정수를 입력 받은 후
		// 둘 중 더 큰 수를 출력하기
		// 둘 중 더 큰 수는 50입니다
		// 정수입력 >>> 20
		// 정수입력 >>> 100
		// 둘 중 더 큰 수는 100입니다.
		System.out.println("정수1를 입력하시오 >> ");
		int num1 = sc.nextInt();
		System.out.println("정수2를 입력하시오 >> ");
		int num2 = sc.nextInt();
		int res = (num1 > num2 ? num1 : num2);
		System.out.println( "둘 중 더 큰 수는" + res + "입니다.");
		
		
		// 사용자에게 두 정수를 입력 받아
		//두 수의 차(큰수 - 작은수)0이상의 값을 출력하기
		// 정수입력 >>> 20
		// 정수입력 >>> 100
		// 두 수의 차는 80입니다
		System.out.println("정수1를 입력하시오 >> ");
		int num3 = sc.nextInt();
		System.out.println("정수2를 입력하시오 >> ");
		int num4 = sc.nextInt();
		
		System.out.println("두 정수의 차는" +(num3 > num4 ? num3-num4 : num4-num3)+"입니다.");
		
		// 사용자에게 나이를 입력 받아서
		// 나이가 10이상 30이하라면 1500원 입니다, 아니라면 무료입니다 출력하기
		System.out.println("나이를 입력하시오 >> ");
		int age = sc.nextInt();
		
		System.out.println(age >= 10 && age <= 30 ? "1500원 입니다." : "무료입니다.");
		
		// 8살 이상, 110cm 이상의 사람만 탑슬할 수 있는 놀이기구가 있다
		// 나이와 키를 입력 받아서 탑승가능 여부를 출력하여라
		
		System.out.println("나이를 입력하시오 >> ");
		int age1 = sc.nextInt();
		System.out.println("키를 입력하시오(cm) >> ");
		int height = sc.nextInt();
		
		System.out.println(age1 >= 8 && height >= 110 ? "가능" : "불가능");
		
		// 한 박스에 20개의 라면이 들어간다
		// 라면의 갯수를 입력 받아 필요한 상자의 갯수를 출력하라
		// 56 --> 3박스, 60 --> 3박스
		System.out.println("라면의 갯수를 입력하시오 >> ");
		int ramen = sc.nextInt();
		
		System.out.println((ramen % 30 > 0 ? ramen/20+1 : ramen/20)+ "박스");
		
	}

}
