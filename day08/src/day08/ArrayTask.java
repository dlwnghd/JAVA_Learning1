package day08;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
		int[] ar = { 10, 20, 30, 40, 50 };
		// �ش� �迭�� �ܼ�â�� {10, 20, 30, 40, 50}
		// ���� ����ϱ�
		System.out.print("{");	// { ���
		for (int i = 0; i < ar.length; i++) {		// int�� i�� 0����; i�� ar�����ͱ��� �̸�����; i++
			if (i == (ar.length) - 1) {		// i�� ((ar�����ͱ���)-1)�� �����ϸ�
				System.out.print(ar[i]);	// ar[i] ���
			} else {		// i�� ar�����ͱ��̿� �������� �ʴٸ�
				System.out.print(ar[i] + ", ");		// "ar[i], "�� ���
			}
		}
		System.out.println("}");		// } ���

		// �ش� �迭���� ¦�� �ε�����ȣ�� �ش��ϴ� ������ ��� 100���� �����Ͽ�
		// {100, 20, 100, 40, 100}
		// ����ϱ�
		for (int i = 0; i < ar.length; i++) {		// int�� i�� 0����; i�� ar�����ͱ��� �̸�����; i++
			if (i % 2 == 0) {		// i % 2�� 0�̶��
				ar[i] = 100;		// ar[i]�� 100
			}
		}

		System.out.print("{");		// { ���
		for (int i = 0; i < ar.length; i++) {		// int�� i�� 0����; i�� ar�����ͱ��� �̸�����; i++
			if (i == (ar.length) - 1) {		// i�� ((ar�����ͱ���)-1)�� �����ϸ�
				System.out.print(ar[i]);	// ar[i] ���
			} else {		// i�� ((ar�����ͱ���)-1)�� �������� �ʴٸ�
				System.out.print(ar[i] + ", ");		// "ar[i], "�� ���
			}
		}
		System.out.println("}");		// } ���

		// ����ڰ� �Է��� ���� 5���� �迭�� �־��� �� ����ϱ�
		// �����Է� >> 10
		// �����Է� >> 36
		// �����Է� >> 98
		// �����Է� >> 5
		// �����Է� >> 17
		// {10, 36, 98, 5, 17}
		// ����ϱ�
		Scanner sc = new Scanner(System.in);		// Scanner Ŭ���� ȣ��
		int[] numbers = new int[5];		// int �迭�� numbers��� �̸��� ���γ��� ������ int�� 5�� ��������

		for (int i = 0; i < numbers.length; i++) {		// int�� i�� 0�̰�; i�� numbers�����ͱ��� �̸�����; i++
			System.out.print("���� �Է� >>");		// �����Է� ���
			numbers[i] = sc.nextInt();		// numbers[i]�� ����� �Է°� �־���
		}

		System.out.print("{");		// { ���
		for (int i = 0; i < numbers.length; i++) {		// int�� i�� 0����; i�� numbers�����ͱ��� �̸�����; i++
			if (i == (numbers.length) - 1) {		// i�� ((numbers�����ͱ���)-1)�� �����ϸ�
				System.out.print(numbers[i]);		// numbers[i]���
			} else {
				System.out.print(numbers[i] + ", ");		// "numbers[i], "���
			}
		}
		System.out.println("}");		// } ���

		// ����ڰ� �Է��� �迭���� �ִ��� ����ϱ�
		// �ִ� : 98
		int max = numbers[0];		// int�� max�� numbers�迭�� 0��°�̴�.
		for (int i = 1; i < numbers.length; i++) {		// int�� i�� 0����; i�� numbers�����ͱ��� �̸�����; i++
			if (max < numbers[i]) {		// max�� numbers[i]���� �۴ٸ�
				max = numbers[i];		// max�� numbers[i]�̴�.
			}
		}
		System.out.println("�ִ� : " + max);		// �ִ� ���

//		// ��Ǯ��
//		// ��¥ ��û�ϴ�
//		for (int i = 0; i < numbers.length; i++) {
//			if(numbers[0]>=numbers[i]) {
//				System.out.println("�ִ�"+numbers[0]);
//			}else if(numbers[1]>=numbers[i]) {
//				System.out.println("�ִ�"+numbers[1]);
//			}else if(numbers[2]>=numbers[i]) {
//				System.out.println("�ִ�"+numbers[2]);
//			}else if(numbers[3]>=numbers[i]) {
//				System.out.println("�ִ�"+numbers[3]);
//			}else {
//				System.out.println("�ִ�"+numbers[4]);
//			}
//		}

		// ����ڰ� �Է��� �迭���� �ּڰ� ����ϱ�
		// �ּڰ� : 5
		int min = numbers[0];		// int�� min�� numbers[0]�̴�.
		for (int i = 1; i < numbers.length; i++) {		// int�� i�� 0����; i�� numbers�����ͱ��� �̸�����; i++
			if (min > numbers[i]) {		// min�� numbers[i]���� ũ�ٸ�
				min = numbers[i];		// min�� numbers[i]�̴�.
			}
		}
		System.out.println("�ּڰ� : " + min);		// �ִ� ���

		// ����ڿ��� ����, ����, ���� ������ �Է� �޾Ƽ�
		// ��� ����ϱ�(�迭 ���)
		int[] scores = new int[3];		// int �迭�� scores��� �̸��� ���γ��� ������ int�� 3�� ��������
		String[] subjects = {"����","����","����"};		// String�迭�� subject��� �̸����� {"����"," ����", "����"}�� �־����
		
		for (int i = 0; i < scores.length; i++) {		// int�� i�� 0����; i�� scores�����ͱ��� �̸�����; i++
			System.out.print(subjects[i] + "���� >> ");		// ����ڷκ��� ���� �Է� �ޱ�
			scores[i] = sc.nextInt();		// ������� �Է°� �����͸� scores[i]�� ����
		}
		
		int total = 0;		//int�� total�� 0
		for (int i = 0; i < scores.length; i++) {			// int�� i�� 0����; i�� scores�����ͱ��� �̸�����; i++
			total += scores[i];		// total = total + scores[i]
		}
		System.out.println("��� : " + total / subjects.length);		// ��� ���

		// ���� �� ����
		// ����ڿ��� ������� �Է� �ް�
		// ����ڿ��� �� ���� ������ �Է� �޾Ƽ�
		// ��� ����ϱ�(�迭 ���)
		int count = 0;		// int�� count�� 0
				
		System.out.println("�Է��� ���� �� >> ");		// ����ڷκ��� �Է��� ���� ���� �Է� ����
		count = sc.nextInt();		// count�� ����ڰ� �Է��� ������ �Է�
		
		String[] subject = new String[count];		// String �迭�� subject��� �̸��� ���γ��� ������ String���� count�� ��������
		int[] score = new int[count];		// int �迭�� score��� �̸��� ���γ��� ������ int���� count�� ��������
		
		for (int i = 0; i < count; i++) {		//  int�� i�� 0����; i�� count �̸�����; i++
			System.out.print("����� �Է� >>");		// ����ڷκ��� ����� �Է� ����
			subject[i] = sc.next();		// ������� �Է°��� subject[i]�� �Է�
		}
		
		for (int i = 0; i < score.length; i++) {		//  int�� i�� 0����; i�� count �̸�����; i++
			System.out.print(subject[i] + "���� >> ");// ����ڷκ��� ���� ���� �Է� ����
			score[i] = sc.nextInt();// ������� �Է°��� score[i]�� �Է�
		}
		
		int Total = 0;		// int�� Total�� 0
		for (int i = 0; i < score.length; i++) {		//  int�� i�� 0����; i�� score�����ͱ��� �̸�����; i++
			Total += score[i];		// Total = Total + score[i]
		}
		System.out.println("��� : " + Total / subject.length);		// ��� ���
	}
}