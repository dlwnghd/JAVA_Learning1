package day06;

import java.util.Iterator;
import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. ����ڿ��� �̸��� �ݺ�Ƚ���� �Է¹޾Ƽ�
		// �ش� Ƚ����ŭ �Է¹��� �̸��� ����϶�
//		System.out.print("�̸� �Է� >> ");					// ����ڷκ��� �̸� �Է��� ����
//		String name = sc.next();									// name�̶�� ������ StringŸ������ �Է� ���� ����
//		System.out.print("�ݺ� Ƚ�� �Է� >> ");			// ����ڷκ��� �ݺ� Ƚ�� �Է��� ����
//		int cnt = sc.nextInt();										// cnt��� ������ intŸ������ �Է� ���� ����
//		
//		for (int i = 0; i < cnt; i++) {		// i�� 0����; i�� cnt�̸��� ����; i�� ���� �߰�
//			System.out.println(name);
//		}

//		// 2. 10 9 8 7 6 5 4 3 2 1 ����ϱ�
//		// �����ǥ �ۼ��غ���
//		for(int i = 10; i > 0; i--) {
//			System.out.print(i + " ");
//		}

//		int num = 10;
//		for(int i = 0; i < 10; i++) {
//			System.out.print(num + " ");
//			num = num - 1;
//		}

//		System.out.println();
//		// 3. 1���� 100���� ���� �� ¦���� ���η� ����ϱ�
//		String res = "";
//		for (int i = 1; i < 100; i++) {
//			if (i % 2 == 0) {
//				res += i + " ";
//				res = res + i + " ";					// res��� String ���� 2 4 6 8 10 ... 96 98������ res�� ���� ���� ��
//				System.out.print(i + " ");
//			}
//		}
//		
//		res = "";
//		for (int i = 1; i < 100; i++) {
//			if (i % 2 == 1) {
//				continue; // ��� ���� �ݺ����� �̵�(�Ʒ��� �̵��ϴ� ���� �ƴ� ����ü�� �̵�)
////				System.out.println("�ȳ�"); dead code
//			}
//			res += i + " ";
//		}
//		System.out.println(res); // �������� res �ϳ��� ���

		// 4. 1���� 10���� ���� ���ϱ�
//		int total = 0;
//		for(int i = 1; i <=10; i++) {
//			total +=  i;		// total = total + i;
//		}
//		System.out.println(total);

		// 4-1. 1���� ����ڰ� �Է��� ������ ���� ���ϱ�
//		int total = 0;
//		System.out.println("����� ���� ���ұ��? >> ");
//		int num = sc.nextInt();
//		for(int i = 1; i <=num; i++) {
//			total +=  i;		// total = total + i;
//		}
//		System.out.println(total);
		
		
		// 5. ������ 3�� ����ϱ�
		// --- -3��----
		// 3 * 1 = 3
		// 3 * 2 = 6
		// 3 * 3 = 9
		// ...
		// 3 * 9 = 27
		int num = 0;
		System.out.println("----3��----");
		for(int i = 1; i < 10; i++) {
			num = 3 * i;
		System.out.println("3 * " + i + " = " + num);	
		}
		
//		for(int i = 0; i < 9; i++) {
//		System.out.println("3 * " + (i+1) + " = " + (i+1);	
//		}
		

	}

}