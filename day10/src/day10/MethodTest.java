package day10;

public class MethodTest {
	// �޼ҵ� �����ε� 
	// �޼ҵ� ���� ������ �Ű����� ���� Ȥ�� Ÿ���� �ٸ����
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
