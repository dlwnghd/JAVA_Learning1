package day10;

public class MethodTest {
	// �޼ҵ� �����ε�
	// �޼ҵ� ���� ������ �Ű����� ���� Ȥ�� Ÿ���� �ٸ����
	// ���� �����ε��� ������� add1, add2,... ������ �þ ���̴� --> �ڵ尡 ��������

	// �̸����� ���� ���
	// ex) parseInt(String s) int - Integer
	//			�޼ҵ��(�Ű�����Ÿ�� �Ű�������) ����Ÿ�� - �޼ҵ尡 ��ġ�ϰ� �ִ� Ŭ������

	public static void add(int a, int b) { // add��� �̸��� �޼ҵ� ���� (int a��, int b��)�� �޾ƿ�
		System.out.println(a + b); // a+b�� ��� (int������ ����)
	}
//	 ��ǻ�� ���忡���� int���� ������� ������ ���� �޼ҵ�� ���� ������ ������ �����ؾ����� �������� ���� ���� �߻�
//	public static void add(int num1, int num2) {	// add��� �̸��� �޼ҵ� ���� (int num1��, int num2��)�� �޾ƿ�
//		System.out.println(num1+ num2);	// num1+ num2�� ��� (int������ ����)
//	}
	
//	���� Ÿ���� �ٲ� �޼ҵ��� ���� ��Ŀ��� ���ϴ� int���� �Ȱ��� ������ ������ �����ؾ����� �������� ���� ���� �߻�
//	public static int add(int a, int b) { // add��� �̸��� �޼ҵ� ���� (int a��, int b��)�� �޾ƿ�
//		return 100;
//	}

	public static void add(double a, int b) { // add��� �̸��� �޼ҵ� ���� (double a��, int b��)�� �޾ƿ�
		System.out.println(a + b); // a+b�� ��� (double������ ����)
	}

	public static void add(int a, int b, int c) { // add��� �̸��� �޼ҵ� ���� (double a��, int b��, int c��)�� �޾ƿ�
		System.out.println(a + b + c); // a+b+c�� ��� (int������ ����)
	}

	public static void main(String[] args) {
		MethodTest.add(10.5, 1); // MethodTestŬ�������� add��� �޼ҵ忡 (10.5, 1)������ �Է�
		MethodTest.add(10, 20); // MethodTestŬ�������� add��� �޼ҵ忡 (10, 20)������ �Է�
		MethodTest.add(10, 20, 30); // MethodTestŬ�������� add��� �޼ҵ忡 (10, 20, 30)������ �Է�
	}
}
