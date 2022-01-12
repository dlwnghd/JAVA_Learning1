package day05;
import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
		// 사용자에게 국어점수, 영어점수, 수학점수를 입력 받아
		// 평균이 90점 이상이라면 A
		// 80이상 90미만 B
		// 70이상 80미만 C
		// 70미만 F
		
		//점수 입력 구간
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력 >> ");
		int kor = sc.nextInt();
		System.out.print("영어점수 입력 >> ");
		int eng = sc.nextInt();
		System.out.print("수학점수 입력 >> ");
		int math = sc.nextInt();
		
		// 평균값 계산 구간
		int avg = (kor + eng + math) / 3;
		
		// 조건문 및 출력 구간
		String res;
		if (avg >= 90) {
			res = "A";
		}else if (avg >= 80 /*&& avg < 90*/) {
			res = "B";
		}else if (avg >= 70 /*&& avg < 80*/) {
			res = "C";
		}else /* if (avg < 70) */ {
			res = "F";
		}
		System.out.println(res);
		
		//줄 띄어주기용
		System.out.println();
		
		char target = 'a';
		// target에 들어있는 값이 소문자라면 소문자입니다
		// 대문자라면 대문자입니다
		// 그외의 문자라면 그외 입니다 출력하기
		
		//조건문, 암묵적 변환 및 출력 구간
		String about;
		if (target >= 'a' && target <= 'z' ) {
			about = "소문자";
		}else if (target >= 'A' && target <= 'Z') {
			about = "대문자";
		}else {
			about = "그 외 ";
		}
		System.out.println(about + "입니다");
		
		
		
		// target에 들어있는 값이 소문자라면 대문자로,
		// 대문자라면 소문자로, 그 외라면 그대로 출력하기
		if (target >= 'a' && target <= 'z') {
			System.out.println((char)(target - 32));
		}else if (target >= 'A' && target <= 'Z') {
			System.out.println((char)(target + 32));
		}else {
			System.out.println(target);
		}
	}

}
