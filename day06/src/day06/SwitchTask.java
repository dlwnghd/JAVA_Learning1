package day06;
import java.util.Scanner;

import java.util.Scanner;

public class SwitchTask {
	public static void main(String[] args) {
		// ����ڿ��� ���� �Է� �޾Ƽ� �ش� ���� ������ �� ����ϱ�
		// 2�� 28�ϱ����� ����
		Scanner sc = new Scanner(System.in);
		
//		// [ ��Ǯ�� ]
//		System.out.print("���� �Է� >> ");				// ����ڿ��� �Է��ؾ��ϴ� ���� �䱸 ����
//		int month = sc.nextInt();									// �Է°��� month��� �̸��� int(����)������ ����
//		
//		switch (month) {													// month���� ���� switch�� ����
//		case 1,3,5,7,8,10,12:											// 1,3,5,7,8,10,12�� ���� ���
//			System.out.println("31��");						// "31��" ���
//			break;																// case�� Ż���� ���� break�� ���
//		case 2:																	// 2�� ���� ���
//			System.out.println("28��");						//"28��" ���
//			break;																// case�� Ż���� ���� break�� ���
//		case 4,6,9,11:														// 4,6,9,11�� ���� ���
//			System.out.println("30��");						// "30��" ���
//			break;																// case�� Ż���� ���� break�� ���
//		default:																	// ���� case�� ������ ���� ���
//			System.out.println("������ 12�������� �ֽ��ϴ�.");		// "������ 12�������� �ֽ��ϴ�."�� ���
////			break;																// case�� Ż���� ���� break�� ���
//		}

		// [������ Ǯ��]
		// [Ǯ��3]
		// 1.8���������� ����� �� �ִ� ���
//		System.out.print("�� �Է� >>");
//		int month = sc.nextInt();
//		
//		switch(month) {
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//			System.out.println("31��");
//			break;
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//			System.out.println("30��");
//			break;
//		case 2:
//			System.out.println("28��");
//			break;
//		default:
//			System.out.println("�������� �ʴ� ���Դϴ�");
//		}
		
		
		//[Ǯ��2]
//		// ȸ�翡�� JAVA 1.8������ ����ϰ� �ִٸ� �������� ����
//		// �Ʒ� ����� 11���������� ����� �����ϴ�.
//		System.out.print("�� �Է� >>");
//		int month = sc.nextInt();
//		
//		switch (month) {													// month���� ���� switch�� ����
//		case 1,3,5,7,8,10,12:											// 1,3,5,7,8,10,12�� ���� ���
//			System.out.println("31��");						// "31��" ���
//			break;																// case�� Ż���� ���� break�� ���
//		case 2:																	// 2�� ���� ���
//			System.out.println("28��");						//"28��" ���
//			break;																// case�� Ż���� ���� break�� ���
//		case 4,6,9,11:														// 4,6,9,11�� ���� ���
//			System.out.println("30��");						// "30��" ���
//			break;																// case�� Ż���� ���� break�� ���
//		default:																	// ���� case�� ������ ���� ���
//			System.out.println("������ 12�������� �ֽ��ϴ�.");		// "������ 12�������� �ֽ��ϴ�."�� ���
////			break;																// case�� Ż���� ���� break�� ���
//		}
		
		//[Ǯ��]1
//		System.out.print("�� �Է� >>");
//		int month = sc.nextInt();
//		
//		switch(month) {
//		case 1:
//			System.out.println("31��");
//		case 2:
//			System.out.println("28��");
//		case 3:
//			System.out.println("31��");
//		case 4:
//			System.out.println("30��");
//		case 5:
//			System.out.println("31��");
//		case 6:
//			System.out.println("30��");
//		case 7:
//			System.out.println("31��");
//		case 8:
//			System.out.println("31��");
//		case 9:
//			System.out.println("31��");
//		case 10:
//			System.out.println("31��");
//		case 11:
//			System.out.println("31��");
//		case 12:
//			System.out.println("31��");
//		}
		
		// ����ڿ��� ���� ������ �Է� �޾�
		// ���������� 90�� �̻��̶�� A
		// 80���̻� 90�̸� B
		// 70���̻� 80�̸� C
		// 70�̸� F
		
		// [������ Ǯ��]
		// ���� ���ʿ��� ����� ����
		System.out.print("���� ���� �Է� >> ");		// ����ڿ��� �Է��ؾ��ϴ� ���� �䱸 ����
		int kor = sc.nextInt();										// �Է°��� kor��� �̸��� int(����)������ ����
		
		switch(kor/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
//			break;
		}
		
//		// [ ��Ǯ�� ]
		// if�� + else if�� + else��
		
//		System.out.print("���� ���� �Է� >> ");		// ����ڿ��� �Է��ؾ��ϴ� ���� �䱸 ����
//		int kor = sc.nextInt();										// �Է°��� kor��� �̸��� int(����)������ ����
//		
//		if (kor >= 90) {						// kor���� 90�̻��� ���
//			System.out.println("A");	// "A"�� ���
//		}else if (kor >= 80) {				// kor���� 80���̻� 90�̸��� ���
//			System.out.println("B");	// "B"�� ���
//		}else if (kor >= 70) {				// kor���� 70���̻� 80�̸��� ���
//			System.out.println("C");	// "C"�� ���
//		}else{											// �� ���� ������
//			System.out.println("F");	// "F"�� ��� 
//		}
	}
}