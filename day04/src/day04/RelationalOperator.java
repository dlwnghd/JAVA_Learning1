package day04;

import java.util.Scanner;

public class RelationalOperator {
	public static void main(String[] args) {
		System.out.println(10 > 5);			// true
		System.out.println(10 > 100);		// false
		
		System.out.println(10.5 > 10);		// double, int 비교 가능
		
		System.out.println(100 > 'a');		// int, char 비교 가능 (아스키 코드로 계산하기 때문에 가능)
		
		System.out.println('a' > 'b');			// char, char 비교 가능
		
//		System.out.println("안녕" > "반가워");		//오류 발생
		
		int num = 10;
		System.out.println(10 == num);
		
		String str = "안녕";
		
		// String은 서로 같은지 비교할 때 equals() 메소드를 사용한다
		// 문자열1.equals(문자열2);		문자열 1과 문자열 2가 서로 같다면 true, 아니면 false
		System.out.println(str.equals("안녕"));
		

		// 사용자에게 아이디를 입력받아, 해당 아이디가 admin이라면 true, 아니면 false를
		// 출력하라
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요 : ");	// 출력문
		String id = sc.nextLine();	// 아이디 입력
		System.out.println(id.equals("admin"));
	}

}
















