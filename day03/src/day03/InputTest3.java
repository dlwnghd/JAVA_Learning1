package day03;

import java.util.Scanner;

public class InputTest3 {
	public static void main(String[] args) {
		// ����ڿ��� ���� �ϰ� ������ �Է� �޾Ƽ�
		// 00�� 00�� 0����
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� >> ");
		int month = sc.nextInt();	// ����ڰ� �Է��� (int)���� ������ + Enter�� ���ۿ� ��������
		
		System.out.print("�� �Է� >> ");
		int dd = sc.nextInt();	// ����ڰ� �Է��� (int)���� ������ + Enter�� ���ۿ� ��������
		
		sc.nextLine();	// ���ۿ� �ִ� Enter�� ������ ����
		System.out.print("���� �Է� >> ");
		String day = sc.nextLine();	// Enter�� ������ �޾ƿ�, ����ڰ� �Է��� (String)���� ������ + Enter�� ���ۿ� ��������
		
		System.out.printf("%d�� %d�� %s����\n", month, dd, day);
	}
}