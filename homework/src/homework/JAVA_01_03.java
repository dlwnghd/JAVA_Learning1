package homework;
import java.util.Scanner;

public class JAVA_01_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. �뷡 �� ��� 300���� ���γ뷡�濡��
		����ڿ��� �ݾ�(int)�� �Է¹޾Ƽ� �θ� �� �ִ� �뷡�� �ܵ��� ����϶�
		int money;
		int song = money / 300; // �� ��
		int rest = money % 300; // �ܵ�
		*/
		
		int cost = 500;	// 1�� �� ����
		System.out.printf("1. �뷡 �� ��� %d���� ���γ뷡�濡��\n"
				+ "����ڿ��� �ݾ�(int)�� �Է¹޾Ƽ� �θ� �� �ִ� �뷡�� �ܵ��� ����϶�\n",cost);
		System.out.print("�ݾ��� �Է����ּ���(��(won) : ");	// ��¹�
		int money = sc.nextInt();	// �ݾ� �Է�
		int song = money / cost;	 // �� ��
		int rest = money % cost;	// �ܵ�
		
		System.out.printf("�θ� �� �ִ� �뷡 �� : %d��\n", song);
		System.out.printf("�ܵ� : %d��\n\n", rest);
		
		/*
		// 2. 10~99������ ����(int Ȥ�� String���ٵ�...)�� �Է¹޾� �����ڸ��� �����ڸ��� ���� ����϶�
		99
		99 % 10 --> 9 // (�����ڸ� ���)
		99 / 10 --> 9 // (�����ڸ� ���)
		�����ڸ� : 9
		�����ڸ� : 9
		*/
		System.out.println("2. 10~99������ ����(int Ȥ�� String���ٵ�...)�� �Է¹޾� �����ڸ��� �����ڸ��� ���� ����϶�");
		System.out.println("--- int Ǯ�� ---");
		System.out.print("10~99�� ���ڸ� �Է����ּ��� : ");	// ��¹�
		int num = sc.nextInt();
		int ones = num  / 10;	// ex) 15 / 10 --> 1
		int tenth = num % 10;	// ex) 15 % 10 --> 5
		
		System.out.printf("�����ڸ� : %d\n", ones);
		System.out.printf("�����ڸ� : %d\n\n", tenth);
		
		/*
		3.����ڿ��� ����, ��������(int)�� �Է¹޾Ƽ� ���(double)�� ����϶�
		int korean, math;
		double ave = (double)((��������+��������)/2); // ��հ�
		*/
		System.out.println("3.����ڿ��� ����, ��������(int)�� �Է¹޾Ƽ� ���(double)�� ����϶�");
		System.out.print("���� ������ �Է����ּ��� : ");
		int korean = sc.nextInt();
		System.out.print("���� ������ �Է����ּ��� : ");
		int english = sc.nextInt();
		double ave = (double)(korean + english)/2;
		
		System.out.printf("��� : %.1f\n\n", ave);
		
		/*
		4.char target = 'a';  //�Է��� ���鿡 ���� ���� �빮�ڷ� ��ȯ
		// target�� ��� a�� �빮�� A�� �ٲپ� ����϶�
		(�ƽ�Ű�ڵ� ����) 32�� ���̰� ��
		target���� ����ڷ� ���� �ܼ�â���� �Է� �ް�*/
		System.out.println("4.char target = 'a';  //�Է��� ���鿡 ���� ���� �빮�ڷ� ��ȯ\n"
				+ "target�� ��� a�� �빮�� A�� �ٲپ� ����϶�\n");
		
//		System.out.println("---�⺻ ����---");
//		sc.nextLine();
		char target = 'a';
		
//		System.out.println("---�Է� ���� String���� �Է� �޾��� ���---");
//		sc.nextLine();
//		System.out.print("���ĺ� �ҹ��� �ϳ��� �Է����ּ���(ex) c ) : ");
//		String target = sc.next();
//		int target_num = Integer.parseInt(target);	// ������ ��ȯ
//		target_num = target_num-32;
//		char target_num_big = (char)target_num;	// ������ ��ȯ
//		System.out.printf("�Է��� ���ĺ� : %c\n", target);
//		System.out.printf("�빮�� ���ĺ� : %c\n", target_num_big);
		
//		System.out.println("---�Է� ���� char�� �Է� �޾��� ���---");
//		sc.nextLine();
//		System.out.print("���ĺ� �ҹ��� �ϳ��� �Է����ּ���(ex) c ) : ");
//		char target = sc.next().charAt(0);	// ���ͳݿ��� char�Է� �޴¹���� ã�Ƽ� Ǭ ���
		
//		System.out.println("---�Ϲ��� ��ȯ---");
//		int target_num = target - 32;	// char - int --> int, �Ϲ��� ��ȯ
		
		System.out.println("---������ ��ȯ + �Ϲ��� ��ȯ---");
		int target_num = (int)target -32;	// char(�ҹ���) -> int - 32,	������ ��ȯ + �Ϲ��� ��ȯ
		
		char target_num_big = (char)target_num; // int -> char(�빮��),	������ ��ȯ
		System.out.printf("�Է��� ���ĺ� : %c\n", target);
		System.out.printf("�빮�� ���ĺ� : %c\n", target_num_big);
	}
}