package day09;

public class Calc {
	public static int add(int num1, int num2) {	// �޼ҵ�� : add�� int������ num1, num2�� �޾ƿ��� ����
		return num1 + num2;		// �޼ҵ� ����� ����� ������ �ǵ����ش�
	}
	
	public static void main(String[] args) {
		int num = Calc.add(80, 20);		// int�� num�� CalcŬ������ add�޼ҵ带 ���(num1, num2�� ����)
		System.out.println(num);
		System.out.println(Calc.add(20, 50) / 2);
	}
}