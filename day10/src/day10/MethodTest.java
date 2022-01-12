package day10;

public class MethodTest {
	// 메소드 오버로딩
	// 메소드 명은 같으나 매개변수 갯수 혹은 타입이 다른경우
	// 만약 오버로딩이 없을경우 add1, add2,... 무한히 늘어날 것이다 --> 코드가 더러워짐

	// 미리보기 보는 방법
	// ex) parseInt(String s) int - Integer
	//			메소드명(매개변수타입 매개변수명) 리턴타입 - 메소드가 위치하고 있는 클래스명

	public static void add(int a, int b) { // add라는 이름의 메소드 생성 (int a값, int b값)을 받아옴
		System.out.println(a + b); // a+b값 출력 (int값으로 나옴)
	}
//	 컴퓨터 입장에서는 int명은 상관없기 때문에 위의 메소드와 같기 때문에 무엇을 실행해야할지 선택하지 못해 오류 발생
//	public static void add(int num1, int num2) {	// add라는 이름의 메소드 생성 (int num1값, int num2값)을 받아옴
//		System.out.println(num1+ num2);	// num1+ num2값 출력 (int값으로 나옴)
//	}
	
//	리턴 타입이 바뀌어도 메소드의 동작 방식에서 원하는 int같이 똑같기 때문에 무엇을 실행해야할지 선택하지 못해 오류 발생
//	public static int add(int a, int b) { // add라는 이름의 메소드 생성 (int a값, int b값)을 받아옴
//		return 100;
//	}

	public static void add(double a, int b) { // add라는 이름의 메소드 생성 (double a값, int b값)을 받아옴
		System.out.println(a + b); // a+b값 출력 (double값으로 나옴)
	}

	public static void add(int a, int b, int c) { // add라는 이름의 메소드 생성 (double a값, int b값, int c값)을 받아옴
		System.out.println(a + b + c); // a+b+c값 출력 (int값으로 나옴)
	}

	public static void main(String[] args) {
		MethodTest.add(10.5, 1); // MethodTest클래스에서 add라는 메소드에 (10.5, 1)데이터 입력
		MethodTest.add(10, 20); // MethodTest클래스에서 add라는 메소드에 (10, 20)데이터 입력
		MethodTest.add(10, 20, 30); // MethodTest클래스에서 add라는 메소드에 (10, 20, 30)데이터 입력
	}
}
