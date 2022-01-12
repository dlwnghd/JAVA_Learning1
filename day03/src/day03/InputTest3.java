package day03;

import java.util.Scanner;

public class InputTest3 {
	public static void main(String[] args) {
		// 사용자에게 월과 일과 요일을 입력 받아서
		// 00월 00일 0요일
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 >> ");
		int month = sc.nextInt();	// 사용자가 입력한 (int)값은 가져감 + Enter가 버퍼에 남아있음
		
		System.out.print("일 입력 >> ");
		int dd = sc.nextInt();	// 사용자가 입력한 (int)값은 가져감 + Enter가 버퍼에 남아있음
		
		sc.nextLine();	// 버퍼에 있는 Enter을 가지고 나옴
		System.out.print("요일 입력 >> ");
		String day = sc.nextLine();	// Enter가 있으면 받아옴, 사용자가 입력한 (String)값은 가져감 + Enter가 버퍼에 남아있음
		
		System.out.printf("%d월 %d일 %s요일\n", month, dd, day);
	}
}