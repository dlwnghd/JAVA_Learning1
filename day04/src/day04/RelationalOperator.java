package day04;

import java.util.Scanner;

public class RelationalOperator {
	public static void main(String[] args) {
		System.out.println(10 > 5);			// true
		System.out.println(10 > 100);		// false
		
		System.out.println(10.5 > 10);		// double, int �� ����
		
		System.out.println(100 > 'a');		// int, char �� ���� (�ƽ�Ű �ڵ�� ����ϱ� ������ ����)
		
		System.out.println('a' > 'b');			// char, char �� ����
		
//		System.out.println("�ȳ�" > "�ݰ���");		//���� �߻�
		
		int num = 10;
		System.out.println(10 == num);
		
		String str = "�ȳ�";
		
		// String�� ���� ������ ���� �� equals() �޼ҵ带 ����Ѵ�
		// ���ڿ�1.equals(���ڿ�2);		���ڿ� 1�� ���ڿ� 2�� ���� ���ٸ� true, �ƴϸ� false
		System.out.println(str.equals("�ȳ�"));
		

		// ����ڿ��� ���̵� �Է¹޾�, �ش� ���̵� admin�̶�� true, �ƴϸ� false��
		// ����϶�
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է����ּ��� : ");	// ��¹�
		String id = sc.nextLine();	// ���̵� �Է�
		System.out.println(id.equals("admin"));
	}

}
















