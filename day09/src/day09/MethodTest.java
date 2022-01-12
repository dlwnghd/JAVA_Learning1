package day09;

public class MethodTest {
	public static void printName(String name, int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.println(name);
//			return; 메소드는 return을 만나면 즉시 종료된다
		}
	}
	
	public static void Invent() {
		System.out.println("프로그램 개발중");
	}
	
	public static void main(String[] args) {
		// 클래스명.메소드명();	Integer.parseInt();
		MethodTest.printName("이주홍1",5);
		MethodTest.Invent();
		MethodTest.printName("이주홍2",2);
		MethodTest.Invent();
		MethodTest.printName("이주홍3",3);
		
	}
}