package day09;

public class MethodTest {
	public static void printName(String name, int cnt) {		// PrintName이라는 메소드 생성 (String값 name, int값 cnt)를 받으면 동작
		for (int i = 0; i < cnt; i++) {		// i는 0; i가 cnt미만 동안; i++
			System.out.println(name);	// name 출력
//			return; 메소드는 return을 만나면 즉시 종료된다
		}
	}
	
	public static void Invent() {		// Invent라는 메소드 생성
		System.out.println("프로그램 개발중");		// "프로그램 개발중" 출력 + 줄바꿈
	}
	
	public static void main(String[] args) {
		// 클래스명.메소드명();	Integer.parseInt();
		MethodTest.printName("이주홍1",5);	// MethodTest클래스에서 printName이라는 메소드 호출 ("이주홍1", 5)데이터 입력
		MethodTest.Invent();		// MethodTest클래스에서 Invent라는 메소드 호출
		MethodTest.printName("이주홍2",2);	// MethodTest클래스에서 printName이라는 메소드 호출 ("이주홍2", 2)데이터 입력
		MethodTest.Invent();		// MethodTest클래스에서 Invent라는 메소드 호출
		MethodTest.printName("이주홍3",3);	// MethodTest클래스에서 printName이라는 메소드 호출 ("이주홍3", 3)데이터 입력
	}
}