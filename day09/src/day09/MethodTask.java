package day09;

import java.util.ArrayList;

public class MethodTask {
	public static void main(String[] args) {
		// 1. 사용자에게 이름과 반복 횟수를 입력 받아서
		// 사용자가 입력한 이름을 해당 반복 횟수만큼 출력하는 메소드

		// 2. target이라는 변수에 들어있는 값이 대문자인지 소문자인지 판별하는 메소드
		// 만들기 (단, target에는 소문자 혹은 대문자 영어 문자만 들어갈 수 있다)
		char target = 'a'; // 다른 문자가 들어가면 작동 안되게 만들기

		// 3. target이라는 변수에 들어있는 값이 대문자라면 소문자로,
		// 소문자라면 대문자로 바꾸어 출력하는 메소드 만들기
		// (단, target에는 소문자 혹은 대문자 영어 문자만 들어갈 수 있다)

		// 4. 배열의 요소를 출력해주는 메소드 만들기
		// {10, 20, 30}
		// {{10, 20}, {30, 40}, {50, 60}}
		// {{10, 20}, {30, 40}, {50, 60}, {70, 80}}
	}

	// 문제 해결을 위해 인터넷에서 퍼온 것 하지만 아쉽게도 도움이 되지는 못했다 아마 내가 아직 코드에 대한 이해도가 부족하기 때문일 것이다.
//	public static void main(String[] args){
//		int[][] lengthTest1 = new int[7][3];
//		System.out.println( lengthTest1.length ); // 7 
//		String lengthTest2 = "lengthSizeTest"; 
//		System.out.println( lengthTest2.length() ); // 14 
//		ArrayList<Object> sizeTest = new ArrayList<Object>();
//		System.out.println( sizeTest .size() ); // 0 }
//	}
}