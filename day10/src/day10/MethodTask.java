package day10;

import java.util.Scanner;

public class MethodTask {
	
	public static void printName(String name, int cnt) {	// printName이라는 이름의 메소드 생성 (String값 name, int값 cnt)를 받아옴
		for (int i = 0; i < cnt; i++) {		// int값 i는 0; i가 cnt미만동안; i++
			System.out.println(name);	// name 출력
		}		
	}
	
	public static boolean isCapital(char ch) {	// boolean값으로 값을 돌려줌, isCapital이라는 이름의 메소드 생성 (char값 ch)를 받아옴
		if(ch >= 'a' && ch <= 'z') {	// ch가 a 이상 z 이하 일 때
			return false;	// false 값으로 반환, 소문자 + 메소드문 탈출
		}	// return으로 인해 메소드가 바로 종료되기 때문에 else 생략 가능
		return true;	// true 값으로 반환, 대문자	+ 메소드문 탈출
	}
	
	// 메소드 안에서 다른 메소드 활용하기
	public static char changeAlphabet(char ch) {	// char값으로 값을 돌려줌, changeAlphabet이라는 이름의 메소드 생성 (char ch)를 받아옴
		if(MethodTask.isCapital(ch)) {	// MethodTask클래스의 isCapital에 ch값을 넣어주고 isCapital로 부터 반환 값을 받아옴 true(대문자)라면 if문 동작
			 return(char)(ch + 32);	// (ch + 32)를 암묵적으로 char값으로 바꾸어 돌려줌
		}else {	// isCapital로부터 받은 반환값이 true외의 값이라면
			return (char)(ch - 32);	// (ch - 32)를 암묵적으로 char값으로 바꾸어 돌려줌
		}
	}
	
	public static void printAr(int[] array) {		// printAr이라는 이름의 메소드 생성 (int배열 array)를 받아옴
		System.out.print("{");		// "{" 출력
		for (int i = 0; i < array.length; i++) {	//	i가 0; i가 array의 데이터 길이 미만동안; i++
			if (i == array.length - 1) {	// i가 (array의 데이터 길이 -1)과 같다면
				System.out.print(array[i]);	// array[i]값 출력
				break;		// for문 종료(탈출)
			}
			System.out.print(array[i] + ", ");	// "array[i]," 출력 
		}
		System.out.println("}");	// "}" 출력
	}
	
	public static void main(String[] args) {
		// 실무에서는 main에서 사용자로부터 값을 입력받을 수 있도록하는 경우가 있음
		// ex) 이니셜을 새기는 곳이 있는데 이니셜이 고정이라면 사용자가 원하는 것을 새길 수가 없음
		// 하지만 이니셜을 요청하여 사용자가 원하는 이니셜을 새길 수 있는 것이 사용자가 원하는 것
		// 이처럼 메소드는 기능은 하되 main으로부터 입력값을 받는 것이 좋다고 생각함(내 생각)
		// 물론 코드에 정답을 없음
		
		// 1. 사용자에게 이름과 반복 횟수를 입력 받아서
		// 사용자가 입력한 이름을 해당 반복 횟수만큼 출력하는 메소드
		Scanner sc = new Scanner(System.in);	// Scanner 지정
		System.out.print("이름 입력 >> ");	// 사용자로 부터 이름 입력 유도
		String name = sc.next();		// 입력한 값 String값 name에 저장
		System.out.print("반복 횟수 >> ");	// 사용자로 부터 반복 횟수 입력 유도
		int cnt = sc.nextInt();	// 입력한 값 int값 cnt에 저장
		
		MethodTask.printName(name, cnt);	//MethodTask클래스에서 printName이라는 메소드 호출 (name, cnt)데이터 입력
		
		// 2. target이라는 변수에 들어있는 값이 대문자인지 소문자인지 판별하는 메소드
		// 만들기 (단, target에는 소문자 혹은 대문자 영어 문자만 들어갈 수 있다)
		char target = 'a'; // 다른 문자가 들어가면 작동 안되게 만들기
		
		// 실무에서 사용자가 원하는 문자를 출력하고 싶다고 하는 경우가 생길 수도 있다
		// 이 때는 메소드 안보다는 main에서 출력할 수 있도록 하는 것이 좋다.
		if (MethodTask.isCapital(target)) {	// MethodTask클래스에서 isCapital이라는 메소드 호출 (target)데이터 입력하고 나온 값이 true라면
			System.out.println("축하합니다!! 대문자!!!");	// "축하합니다!! 대문자!!!" 출력
		}else {	// 나온 값이 true가 아니라면
			System.out.println("ㅜㅜ 소문자");	// "ㅜㅜ 소문자" 출력
		}
		
		// 3. target이라는 변수에 들어있는 값이 대문자라면 소문자로,
		// 소문자라면 대문자로 바꾸어 출력하는 메소드 만들기
		// (단, target에는 소문자 혹은 대문자 영어 문자만 들어갈 수 있다)
		char res = MethodTask.changeAlphabet(target);	// char값 res는 MethodTask 클래스에서 changeAlphabet 메소드 호출 (target)데이터 입력하고 나온 값
		System.out.println("바뀐 결과: " + target + "-->" + res);	// 바뀐결과: target --> res
		
		// 4. 배열의 요소를 출력해주는 메소드 만들기
		// {10, 20, 30}
		// {{10, 20}, {30, 40}, {50, 60}}
		// {{10, 20}, {30, 40}, {50, 60}, {70, 80}}
		int[] ar = {10, 20, 30};
		int[][] ar2 = {{10, 20}, {30, 40}, {50, 60}};
		int[][] ar3 = {{10, 20}, {30, 40}, {50, 60}, {70, 80}};
		MethodTask.printAr(ar);	
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