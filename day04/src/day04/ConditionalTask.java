package day04;

import java.util.Scanner;

public class ConditionalTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// target�� ����ִ� ���ڰ� �ҹ��ڶ�� �ҹ����Դϴ� ����ϰ�,
		// �ƴ϶�� �ҹ��ڰ� �ƴմϴ� ����ϱ�
		char target = 'a';
		System.out.println((int)target > 96 && (int)target < 123 ? "�ҹ����Դϴ�" : "�ҹ��ڰ� �ƴմϴ�");
		
		// ����ڿ��� �� ������ �Է� ���� ��
		// �� �� �� ū ���� ����ϱ�
		// �� �� �� ū ���� 50�Դϴ�
		// �����Է� >>> 20
		// �����Է� >>> 100
		// �� �� �� ū ���� 100�Դϴ�.
		System.out.println("����1�� �Է��Ͻÿ� >> ");
		int num1 = sc.nextInt();
		System.out.println("����2�� �Է��Ͻÿ� >> ");
		int num2 = sc.nextInt();
		int res = (num1 > num2 ? num1 : num2);
		System.out.println( "�� �� �� ū ����" + res + "�Դϴ�.");
		
		
		// ����ڿ��� �� ������ �Է� �޾�
		//�� ���� ��(ū�� - ������)0�̻��� ���� ����ϱ�
		// �����Է� >>> 20
		// �����Է� >>> 100
		// �� ���� ���� 80�Դϴ�
		System.out.println("����1�� �Է��Ͻÿ� >> ");
		int num3 = sc.nextInt();
		System.out.println("����2�� �Է��Ͻÿ� >> ");
		int num4 = sc.nextInt();
		
		System.out.println("�� ������ ����" +(num3 > num4 ? num3-num4 : num4-num3)+"�Դϴ�.");
		
		// ����ڿ��� ���̸� �Է� �޾Ƽ�
		// ���̰� 10�̻� 30���϶�� 1500�� �Դϴ�, �ƴ϶�� �����Դϴ� ����ϱ�
		System.out.println("���̸� �Է��Ͻÿ� >> ");
		int age = sc.nextInt();
		
		System.out.println(age >= 10 && age <= 30 ? "1500�� �Դϴ�." : "�����Դϴ�.");
		
		// 8�� �̻�, 110cm �̻��� ����� ž���� �� �ִ� ���̱ⱸ�� �ִ�
		// ���̿� Ű�� �Է� �޾Ƽ� ž�°��� ���θ� ����Ͽ���
		
		System.out.println("���̸� �Է��Ͻÿ� >> ");
		int age1 = sc.nextInt();
		System.out.println("Ű�� �Է��Ͻÿ�(cm) >> ");
		int height = sc.nextInt();
		
		System.out.println(age1 >= 8 && height >= 110 ? "����" : "�Ұ���");
		
		// �� �ڽ��� 20���� ����� ����
		// ����� ������ �Է� �޾� �ʿ��� ������ ������ ����϶�
		// 56 --> 3�ڽ�, 60 --> 3�ڽ�
		System.out.println("����� ������ �Է��Ͻÿ� >> ");
		int ramen = sc.nextInt();
		
		System.out.println((ramen % 30 > 0 ? ramen/20+1 : ramen/20)+ "�ڽ�");
		
	}

}
