package day06;

import java.util.Scanner;

public class NestedForTest {
	public static void main(String[] args) {
		// ���� for�� ��� ����
//		for (int i = 0; i < 3; i++) {	// i�� 0; i�� 3�̸��� ���� �ݺ�; i�� �ݺ��Ҷ����� 1�� �߰�
//			for (int j = 0; j < 2; j++) {	// j�� 0; j�� 2�̸��� ���� �ݺ�; j�� �ݺ��Ҷ����� 1�� �߰�
//				System.out.println("i : " + i + " j : " + j);
//			}
//		}

		/* �Ʒ� ���
		 * 	*****
		 * 	*****
		 * 	*****
		 * 	***** 
		 * 	***** 
		 * */
		
		// 1��° for���� ��
		// 2��° for���� ������ �����ϸ� �ϱ� ����
		
//		��ü������ ���� 
//		1. "*"�� �ټ��� ����ϰ�
//		2. "����" �Է�
//		���� 5�� �ݺ��Ͽ� �ϼ�
		
//		1. j�� 5�̸��̸� 2������ �Ŀ� �ٽ� ���۽� j++ �ƴϸ� for�� Ż��
//		2. i�� 5�̸���� 3������ �Ŀ� �ٽ� ���۽� i++ �ƴϸ� for�� Ż��
//		3. "*"�� ��� �� 2������
//		4. "����" �Է� �� 1������
		
//		for(int j = 0; j <5; j++) {	// j�� 0; j�� 5�̸��� ���� �ݺ�; j�� �ݺ��Ҷ����� 1�� �߰�(j => 0,1,2,3,4)
//			for(int i = 0; i <5; i++) {	// i�� 0; i�� 5�̸��� ���� �ݺ�; i�� �ݺ��Ҷ����� 1�� �߰�( i =>0,1,2,3,4)
//				System.out.print("*");	// "*" ���
//			}
//			System.out.println();		// �� ����
//		}
		
		
//		[������ ����]
		// 1��
		/*
		 * 	*
		 * 	**
		 * 	***
		 * 	****
		 * *****
		 * 
		 * */
		
//		��ü������ ���� 
//		1. i�� 5�̸��̸� 2������ �Ŀ� �ٽ� ���۽� i++ �ƴϸ� for�� Ż��
//		2. j�� i���϶�� 3������ �Ŀ� �ٽ� ���۽� j++ �ƴϸ� for�� Ż��
//		3. "*"�� ��� �� 2������
//		4. "����" �Է� �� 1������
//		for(int i =0; i <5; i++) {		// i�� 0; i�� 5�̸�����; i = i+1; (i => 0,1,2,3,4)
//			for(int j = 0; j <= i; j++) {	// j�� 0; j�� i������ ����; j = j + 1; (j => 0,1,2,3,4 ���� i���� Ŭ �� ����)
//				System.out.print("*");	// "*"���
//			}
//			System.out.println();	// ���� �ٷ� �̵�
//		}
		
		
		// 2��
		/*
		 *       *
		 *      **
		 *    ***
		 *  ****
		 * *****
		 * */
		
//		��ü������ ���� 
//		1. num ����
//		2. i�� 0�̸��̸� 3������ �Ŀ� �ٽ� ���۽� i-- �ƴϸ� for�� Ż��
//		3. j�� i-1�̸���� 4������ �Ŀ� �ٽ� ���۽� j++ �ƴϸ� for�� Ż��
//		4. " "�� ��� �� 3������
//		5. "*" �Է�, num�� 1�� ������ �� 2������
		
//		int num = 1;	// int num�� 1�� ����
//		for(int i =5; i >0; i--) {		// i�� 5; i�� 0�ʰ����� �ݺ�; i = i-1;
//			for(int j = 0; j < i-1; j++) {	// j�� 0; j�� (i-1)�̸����� �ݺ�; j = j + 1;
//				System.out.print(" ");	// "*"���
//			}
//			for(int j = 0; j < num; j++) {		// j�� 0; j�� num�̸����� �ݺ�; j = j + 1;
//				System.out.print("*");		// "*" ���
//			}
//			System.out.println();	// Enter �� �ٲ�
//			num++;		// num = num + 1
//		}
		
		// 3��
		// ������ 2�ܺ��� 9�ܱ��� ���
		
//		��ü������ ���� 
//		1. num ����
//		2. i�� 10�̸��̸� 3������ �Ŀ� �ٽ� ���۽� i++ �ƴϸ� for�� Ż��
//		3. "----i��----" ��� �� 4������
//		4. j�� 10�̸���� 5������ �Ŀ� �ٽ� ���۽� j++ �ƴϸ� for�� Ż��
//		5. num = i * j ��� ��  "i * j = num" ���°� �������� ��� �� 4������
		
//		int num = 0;		// int num�� 0���� ����
//		for(int i=1; i <10; i++) {			// i�� 1; i�� 10�̸����� �ݺ�; i = i+1;
//			System.out.println("----"+i+"��----");			// i�� ���缭 ������� ���
//			for(int j = 1; j < 10; j++) {		// j�� 1; j�� 10�̸����� �ݺ�; j = j + 1;
//				num = i * j;		// num�� i * j
//				System.out.println(i + " * " + j + " = " + num);		// "i * j = num" ���°� �������� ���	
//			}
//		}
		
		// ���� �� ����
		// ������� �Է� ���� ���� �� ����ϱ�
		// ex) 5
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
		
//		Scanner sc = new Scanner(System.in);		// ����� �Է°��� �ޱ� ���� Scanner �ҷ�����
//		System.out.print("'*'�� �ݺ� Ƚ���� �Է����ּ���.");		// ����ڷ� ���� �ݺ�Ƚ�� ����
//		int num = sc.nextInt();		// num�� ������� �Է°��� int�� ����
//		for (int i = 0; i < num; i++) { // i�� 0; i�� 6�̸�����; i = i+1;		// i�� 0; i�� num�̸����� �ݺ�; i = i+1;
//			for (int j = 0; j <= i; j++) { // j�� 0; j�� i�̸�����; j = j + 1;		// j�� 0; j�� i���ϵ��� �ݺ�; j = j + 1;
//				System.out.print("*"); // "*"���			// "*"���
//			}
//			System.out.println(); // ���� �ٷ� �̵�
//		}
	}

}