package day06;

import java.util.Scanner;

public class ForTest {
	public static void main(String[] args) {
//		// �ʱ��; ���ǽ�; ������;
//		// i = 0���� �����ؼ�; i�� 3�̸��� ���� �ݺ�; �� Ƚ������ i�� 1�� ������
//		// �� �� ù��° i�� ó���� �� 0�̴�.
//		// ���������δ� i�� 0����, i�� ������ �̸�,
//		// �Ŀ� 0�� ����ϴ� ���� �� ���ϴ� �ͼ������� ���� ���� �� ����
//		for (int i = 0; i < 3; i++) {
//			System.out.println(i + "����ȫ");
//		}
//		System.out.println("for�� �ٱ� ����");

//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("i �Է� >> ");
//		
//		for (int i = sc.nextInt(); i < 10; i++) {
//			System.out.println(i + "����ȫ");
//		}
//		System.out.println("for�� �ٱ� ����");	

		// 0 1 2 3 4 5 6 7 8 9 ���
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}

		// 1 2 3 4 5 6 7 8 9 10 ���
//		int num = 1;
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + " ");
//			num = num++;
		}
		

	}
}