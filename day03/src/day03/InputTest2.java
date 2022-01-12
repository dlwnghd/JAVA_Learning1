package day03;

import java.util.Scanner;	// java.util이라는패키지에서 Scanner라는 클래스를 불러옴

public class InputTest2 {
	public static void main(String[] args) {
		// 사용자에게 나이를 입력 받고, 당신의 나이는 00살입니다 출력하기
		Scanner scan = new Scanner(System.in);	// Scanner를 scan으로 사용한다고 컴퓨터에게 알려줌
		System.out.print("나이를 입력 하시오 : ");	// 출력문
		int age = scan.nextInt();	// 콘솔창에 입력한 값을 int(정수형)으로 받아옴
		System.out.printf("당신의 나이는 %d살입니다.\n",age);		// 받아온 값을 %d위치에 출력함
		
		System.out.print("원주율을 입력 하시오 : ");	// 출력문
		double pi = scan.nextDouble();	// 콘솔창에 입력한 값은 double(실수형)타입으로 pi라는 변수에 저장함
		
		System.out.printf("원주율은 %.2f입니다.",pi);	// 받아온 값을 %.2f위치에 출력함 
	}
}