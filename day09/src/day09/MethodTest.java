package day09;

public class MethodTest {
	public static void printName(String name, int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.println(name);
//			return; �޼ҵ�� return�� ������ ��� ����ȴ�
		}
	}
	
	public static void Invent() {
		System.out.println("���α׷� ������");
	}
	
	public static void main(String[] args) {
		// Ŭ������.�޼ҵ��();	Integer.parseInt();
		MethodTest.printName("����ȫ1",5);
		MethodTest.Invent();
		MethodTest.printName("����ȫ2",2);
		MethodTest.Invent();
		MethodTest.printName("����ȫ3",3);
		
	}
}