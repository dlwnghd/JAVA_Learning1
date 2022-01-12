package homework;

import java.util.Scanner;

public class JAVA_01_11 {
	public static void name() {
		// 1차 풀이
		Scanner sc = new Scanner (System.in);
		System.out.print("이름 입력 >> ");
		String name = sc.next();
		System.out.print("반복 횟수 입력 >> ");
		int cnt = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			System.out.println(name);
		}
	}
	
	public static void Alphabet(int target) {
		// 1차 풀이
		if (target >= 65 && target <= 90) {
			System.out.println("대문자");
		} else if(target >= 97 && target <= 122){
			System.out.println("소문자");
		}else {
			System.out.println("알파벳이 아닙니다!");
			return;
		}
	}
	
	public static void Alpha_Change(char target) {
		// 1차 풀이
		if (target >= 65 && target <= 90) {
			target += 32;
		} else if(target >= 97 && target <= 122){
			target -= 32;
		}else {
			System.out.println("알파벳이 아닙니다!");
			return;
		}
		System.out.println(target);		
	}
	
	public static void Arrary_Out1(int[] ar) {
		System.out.print("{");		// "{" 출력, 제일 외부 배열의 여는 대괄호
		for (int i = 0; i < ar.length; i++) {		// int i가 0이고; i가 ar.length보다 미만동안; i++
			if(i == ar.length-1) {				
				System.out.print(ar[i]);
			}else {				
				System.out.print(ar[i] + ", ");
			}
		}
		System.out.print("}");		// "{" 출력, 제일 외부 배열의 여는 대괄호
	}
	
	public static void Arrary_Out2(int[][] ar) {
		System.out.print("{");		// "{" 출력, 제일 외부 배열의 여는 대괄호
		for (int i = 0; i < ar.length; i++) {		// int i가 0이고; i가 ar.length보다 미만동안; i++
			System.out.print("{");		// "{" 출력, 내부 배열의 여는 대괄호
			for (int j = 0; j < ar[i].length; j++) {		// int j가 0이고; j가 ar[i].length보다 미만동안; j++
				if (j == ar[i].length - 1) {		// j가 ar[i].length - 1일때
					System.out.print(ar[i][j]);		// "ar[i][j]"출력
				} else { // j가 1이 아니라면
					System.out.print(ar[i][j] + ",");		// "ar[i][j],"출력
				}
			}
			if(i == ar.length -1) {		// i가 ar.length -1일때		
				System.out.print("}");		// "}" 출력, 내부 마지막 배열의 닫는 대괄호
			}else {			// i가 2가 아니라면	
				System.out.print("}, ");		// "}, " 출력, 내부 배열의 닫는 대괄호
			}
		}
		System.out.print("}");		// "}" 출력, 제일 외부 닫는 대괄호
	}
	

	
	public static void main(String[] args) {
		// 1. 사용자에게 이름과 반복 횟수를 입력 받아서
		// 사용자가 입력한 이름을 해당 반복 횟수만큼 출력하는 메소드
		JAVA_01_11.name();

		// 2. target이라는 변수에 들어있는 값이 대문자인지 소문자인지 판별하는 메소드
		// 만들기	(단, target에는 소문자 혹은 대문자 영어 문자만 들어갈 수 있다)
		char target = 'a';	// 다른 문자가 들어가면 작동 안되게 만들기
		// 65~90 || 97~122범위가 알파벳 아스키코드 번호
		JAVA_01_11.Alphabet(target);
		
		// 3. target이라는 변수에 들어있는 값이 대문자라면 소문자로,
		// 소문자라면 대문자로 바꾸어 출력하는 메소드 만들기
		// (단, target에는 소문자 혹은 대문자 영어 문자만 들어갈 수 있다)
		JAVA_01_11.Alpha_Change(target);
		
		// 4. 배열의 요소를 출력해주는 메소드 만들기
		// {10, 20, 30}
		// {{10, 20}, {30, 40}, {50, 60}}
		// {{10, 20}, {30, 40}, {50, 60}, {70, 80}}
		// 만약 차원이 n차원이라면 계속해서 코드를 만들어야하는 불편함이 생길 것이다.
		// 그렇다면 차원의 수에 따라서 만들어주는 코드를 만드는 것이 가장 좋을 것
		int[] ar1 = {10, 20, 30};
		int[][] ar2 = {{10, 20}, {30, 40}, {50, 60}};
		int[][] ar3 = {{10, 20}, {30, 40}, {50, 60}, {70, 80}};
//		System.out.println(ar1.length);	// ar1에 있는 데이터의 길이를 알 수 있다. 다만 배열이 몇개다 인지는 알 수가 없다. 후우.....
//		System.out.println(ar2.length);
//		System.out.println(ar3.length);
		
		
		JAVA_01_11.Arrary_Out1(ar1);
		System.out.println();
		JAVA_01_11.Arrary_Out2(ar2);
		System.out.println();
		JAVA_01_11.Arrary_Out2(ar3);
	}
}
