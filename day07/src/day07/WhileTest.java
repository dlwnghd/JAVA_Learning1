package day07;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
//		for (int i = 0; i < 3; i++) {
//			System.out.println("for�� ���� ����");
//		}
//		System.out.println("for�� �ٱ� ����");
//
//		int i = 0;
//		while (i < 3) {
//			System.out.println("while�� ���� ����");
//			i++;
//		} // ������ ������ ���ǽ� �ٽ� ���
//		System.out.println("while�� �ٱ� ����"); // while����

		Scanner sc = new Scanner(System.in);

//		while�� ���ѹݺ��� �� �� ȿ����
//		while (true) {
//			System.out.print("1. �ֹ��ϱ� 2. �����ϱ� >> "); // ����ڷκ��� �޴� �Է� ����
//			int choice = sc.nextInt(); // ����ڷκ��� �Է¹��� ���� choice�� ����
//			if (choice == 3) {
//				break; // break�� ������ ��� �ݺ����� Ż���Ѵ�
//			}
//		}
		
		int choice = 0;
		
		do {
			System.out.println("1. �ֹ��ϱ� 2. �����ϱ� 0. ������>> ");
			choice = sc.nextInt();
		} while (choice != 0);
		
		
		// �����Ⱑ 3�̶�� ������ ������ 0���� �ٲ۴ٸ� choice�� �ʱⰪ�� 0�̱� ������ ������ �߻���
		// ���� choice���� �ٸ� ������ �ٲٴ��� �������� �������� ������ �Ҷ� �� �ٸ� ���� �ߴ����� ���� �� �� �ִ� �ڵ尡 �Ǿ����
//		while (choice != 0) {
//			System.out.print("1. �ֹ��ϱ� 2. �����ϱ� 0. ������>> "); // ����ڷκ��� �޴� �Է� ����
//			choice = sc.nextInt(); // ����ڷκ��� �Է¹��� ���� choice�� ����
//		}
	}
}