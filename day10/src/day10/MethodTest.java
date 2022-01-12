package day10;

public class MethodTest {
	// 메소드 오버로딩 
	// 메소드 명은 같으나 매개변수 갯수 혹은 타입이 다른경우
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void add(double a, int b) {
		System.out.println(a+b);
	}
	
	public static void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		MethodTest.add(10.5, 1);
		MethodTest.add(10, 20);
		MethodTest.add(10,20,30);
	}
}
