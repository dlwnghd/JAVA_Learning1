package day05;
import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//		if(true) {
//			System.out.println("����1");
//			if(true) {
//				System.out.println("����3");
//			}
//			System.out.println("����4");
//		}
//		System.out.println("����2");	
		// ����ڿ��� ������ �Է� �޾Ƽ� ¦����� ¦�� ����ϱ�
		// Ȧ����� Ȧ�� ����ϱ�
		Scanner sc = new Scanner(System.in);
//	System.out.print("������ �Է��� �ּ��� : ");
//	int num1 = sc.nextInt();

		// if��
//	if (num1 % 2 == 0) {
//		System.out.println("¦��");
//	}
//	
//	if ( !(num1 % 2 == 0)) {
//		System.out.println("Ȧ��");
//	}

//	// if + else��
//	if (num1 % 2 == 0) {
//		System.out.println("¦��");
//	}else{
//		System.out.println("Ȧ��");
//	}
//	System.out.println("if�� �ٱ� ����");
//	
//	// ���׿�����
//	System.out.println( num1 % 2 == 0 ? "¦��" : "Ȧ��");

		// �� ���� �� ū �� ����ϱ�
		// ���� �� ���� ���ٸ� ���ٰ� ����ϱ�
		System.out.print("���� 1 �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("���� 2 �Է� >> ");
		int num2 = sc.nextInt();

//		// ���׿�����
//		String res = num1 > num2 ? num1 + "" : num2 > num1 ? num2 + "" : "����";
//		System.out.println(res);
//
//		// if + else
//		if (num1 > num2) {
//			System.out.println(num1);
//		} else {
		System.out.println("���� �� �ٸ� ���� ���� ���ڽ��ϴ�.");
//			if (num2 > num1) {
//				System.out.println(num2);
//			} else {
//				System.out.println("����");
//			}
//		}

		// �鿩���� ���߱� : �巡��(ctrl + a) >> ctrl + shift + f

		// if + else if + else
		if (num1 > num2) {
			System.out.println(num1);
		} else if (num2 > num1) {
			System.out.println(num2);
		} else {
			System.out.println("����");
		}
	}

}