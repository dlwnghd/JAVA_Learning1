package day02;

public class VariableTest {
	public static void main(String[] args) {
		int num;										// num이라는 이름의 변수 선언(저장공간 생성)
		num = 10;									// num에 10이라는 정수를 줌(변수의 초기화)
		System.out.println(num);		// num에 들어있는 변수를 출력
		num = 5;										// num에 5라는 정수를 줌(변수의 초기화)
		System.out.println(num);		// num에 들어있는 변수를 출력
		System.out.println("num");	// ""안에 있는 문자를 출력 위와는 다름
		
		// 복사 붙여넣기 단축키 : ctral + alt + 위/아래화살표
		String name;								// name이라는 이름의 변수 선언(저장공간 생성)
		name = "이주홍";						//name에 "이주홍"이라는 문자형을 줌(변수의 초기화)
		System.out.println(name);		// name에 들어있는 문자형을 출력
		System.out.println(name);		// name에 들어있는 문자형을 출력
		System.out.println(name);		// name에 들어있는 문자형을 출력
		System.out.println(name);		// name에 들어있는 문자형을 출력
		System.out.println(name);		// name에 들어있는 문자형을 출력
		System.out.println(name);		// name에 들어있는 문자형을 출력
		System.out.println(name);		// name에 들어있는 문자형을 출력
		System.out.println(name);		// name에 들어있는 문자형을 출력
		System.out.println(name);		// name에 들어있는 문자형을 출력
		System.out.println(name);		// name에 들어있는 문자형을 출력
		
		// 변수의 선언과 초기화를 동시에 하는 방법↓
		double pi = 3.14;
//		double pi = 3.14; 같은 이름의 변수는 선언할 수 없다
		System.out.println(pi);

		pi = 10.5;
		int 숫자;
		숫자 = 10;
		System.out.println(숫자);
//		pi = "이주홍";	타입을 맞추어 넣어줘야한다
		System.out.println(pi);
		
	}
}