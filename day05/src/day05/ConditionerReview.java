package day05;
import java.util.Scanner;

public class ConditionerReview {
	public static void main(String[] args) {
		
		// �� ������ �Է� �޾� �� ������ �� ���ϱ�
		Scanner sc = new Scanner(System.in);
//		System.out.print("���� 1 �Է� >> ");
//		int num1 = sc.nextInt();
//		System.out.print("���� 2 �Է� >> ");
//		int num2 = sc.nextInt();
//		int res = num1 > num2 ? num1 - num2 : num2 - num1;
//		System.out.println("�� ���� ���� " + res + "�Դϴ�");
		
		// ����ڿ��� ���̸� �Է� �޾Ƽ� ���̰� 10�̻� 30�����̸� 1500�� �ƴϸ� ���� ����ϱ�
//		System.out.print("���� �Է� >> ");
//		int age = sc.nextInt();
//		
//		System.out.println(age >= 10 && age <= 30 ? "1500��" : "����");
		
		// 8�� �̻�, 110cm �̻� ���̱ⱸ
//		System.out.print("���� �Է� >> ");
//		int age = sc.nextInt();
//		System.out.print(" Ű �Է� >> ");
//		int height = sc.nextInt();
//		
//		System.out.println(age >= 8 && height >= 110 ? "ž�� ����" : "ž�� �Ұ���");
		
		// 20���� ����� �� �� �ִ� ���ڰ� �� �� �ʿ����� �˷��ִ� ���α׷�
//		System.out.print("����� � �ֳ���? >> ");
//		int ramen = sc.nextInt();
//		int boxCnt = ramen % 20 >0 ? ramen / 20+1 : ramen / 20;
//		
//		System.out.println("�ʿ��� ������ ������ "+ boxCnt + "�� �Դϴ�");
		
		
		// �� ���� �� ū �� ����ϱ�
		// ���� �� ���� ���ٸ� ���ٰ� ����ϱ�
		System.out.print("���� 1 �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("���� 2 �Է� >> ");
		int num2 = sc.nextInt();
		
		String res = num1 > num2 ? num1 + "" : num2 > num1 ? num2 + "" : "����";
		
		System.out.println(res);
	}

}








