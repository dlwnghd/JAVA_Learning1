package homework;

import java.util.Scanner;

public class JAVA_01_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����ڿ��� ���� �Է� �޾�, �ش� ���� ������ ���� ����϶�
		// ��, 2���� 28�� ���� �ִٰ� ����, switch�� ���
		
		System.out.print("���� �Է� >> ");				// ����ڿ��� �Է��ؾ��ϴ� ���� �䱸 ����
		int month = sc.nextInt();									// �Է°��� month��� �̸��� int(����)������ ����
		
		switch (month) {													// month���� ���� switch�� ����
		case 1,3,5,7,8,10,12:											// 1,3,5,7,8,10,12�� ���� ���
			System.out.println("31��");						// "31��" ���
			break;																// case�� Ż���� ���� break�� ���
		case 2:																	// 2�� ���� ���
			System.out.println("28��");						//"28��" ���
			break;																// case�� Ż���� ���� break�� ���
		case 4,6,9,11:														// 4,6,9,11�� ���� ���
			System.out.println("30��");						// "30��" ���
			break;																// case�� Ż���� ���� break�� ���
		default:																	// ���� case�� ������ ���� ���
			System.out.println("������ 12�������� �ֽ��ϴ�.");		// "������ 12�������� �ֽ��ϴ�."�� ���
//			break;																// case�� Ż���� ���� break�� ���
		}
		

		// ����ڿ��� ���� ������ �Է� �޾�
		// ���������� 90�� �̻��̶�� A
		// 80���̻� 90�̸� B
		// 70���̻� 80�̸� C
		// 70�̸� F
		
		System.out.print("���� ���� �Է� >> ");		// ����ڿ��� �Է��ؾ��ϴ� ���� �䱸 ����
		int kor = sc.nextInt();										// �Է°��� kor��� �̸��� int(����)������ ����
		
//		// if��
//		if (kor >= 90) {								// kor���� 90�̻��� ���
//			System.out.println("A");			// "A"�� ���
//		}
//		if (kor >= 80 && kor < 90) {		// kor���� 80���̻� 90�̸��� ���
//			System.out.println("B");			// "B"�� ���
//		}
//		if (kor >= 70 && kor < 80) {		// kor���� 70���̻� 80�̸��� ���
//			System.out.println("C");			// "C"�� ���
//		}
//		if(kor < 70){										// kor���� 70�̸��� ���
//			System.out.println("F");			// "F"�� ���
//		}
		
//		// if�� + else if��
//		if (kor >= 90) {								// kor���� 90�̻��� ���
//			System.out.println("A");			// "A"�� ���
//		}else if (kor >= 80) {						// kor���� 80���̻� 90�̸��� ���
//			System.out.println("B");			// "B"�� ���
//		}else if (kor >= 70) {						// kor���� 70���̻� 80�̸��� ���
//			System.out.println("C");			// "C"�� ���
//		}else if(kor < 70){							// kor���� 70�̸��� ���
//			System.out.println("F");			// "F"�� ���
//		}
		
		// if�� + else if�� + else��
				if (kor >= 90) {						// kor���� 90�̻��� ���
					System.out.println("A");	// "A"�� ���
				}else if (kor >= 80) {				// kor���� 80���̻� 90�̸��� ���
					System.out.println("B");	// "B"�� ���
				}else if (kor >= 70) {				// kor���� 70���̻� 80�̸��� ���
					System.out.println("C");	// "C"�� ���
				}else{											// �� ���� ������
					System.out.println("F");	// "F"�� ��� 
				}
		
//		//switch��
//		// ������ case���� ������ ��� ����� �ִ��� �𸣱� ������
//		// �ڵ��� �������� �ʹ� �������ٰ� ������
//		switch(kor) {																// kor���� ���� switch�� ����
//		case 100,99,98,97,96,95,94,93,92,91,90:		// kor ���� 100,99,98,97,96,95,94,93,92,91,90�� ���
//			System.out.println("A");									// "A"�� ���
//		break;																		// case�� Ż���� ���� break�� ���
//		case 89,88,87,86,85,84,83,82,81,80:				// kor ���� 89,88,87,86,85,84,83,82,81,80�� ���
//			System.out.println("B");									// "B"�� ���
//		break;																		// case�� Ż���� ���� break�� ���
//		case 79,78,77,76,75,74,73,72,71,70:				// kor ����79,78,77,76,75,74,73,72,71,70�� ���
//			System.out.println("C");									// "C"�� ���
//		break;																		// case�� Ż���� ���� break�� ���
//		default:																		// ���� case�� ������ ���� ���
//			System.out.println("�׿�");								// "�׿�."�� ���
////			break;																	// case�� Ż���� ���� break�� ���
//		}
		
		
	}
}
