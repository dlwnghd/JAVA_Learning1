package day09;

public class Calc {		// Calc��� �޼ҵ� ����
	public static int add(int num1, int num2) {	// �޼ҵ�� : add�� int������ num1, num2�� �޾ƿ��� ����
		return num1 + num2;		// �޼ҵ� ����� ����� ������ �ǵ����ش�
	}
	
	public static void main(String[] args) {
		int num = Calc.add(80, 20);		// int�� num�� CalcŬ������ add�޼ҵ带 ���(80, 20)�� ���� ���� int�� num�� �Է�
		System.out.println(num);		// num���
		System.out.println(Calc.add(20, 50) / 2);	// CalcŬ�������� add�޼ҵ带 ���(50, 50)�� �ް� ���� ���� / 2 �Ͽ� ���
	}
}