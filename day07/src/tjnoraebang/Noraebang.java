package tjnoraebang;

import java.util.Random;
import java.util.Scanner;

public class Noraebang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int choice = 0; // ���θ޴����� ����ڰ� �Է��� ��ȣ
		int songCnt = 0; // ���� �θ� �� �ִ� �뷡�� ��
		int songTotalCnt = 0; // ��ü �θ� �� �ִ� �뷡�� ��

		String introMsg = "�١ڡ١ڡ١ھ������ �뷡���Դϴ١١ڡ١ڡ١�";
		String mainMenu = "1. �ݾ��Է��ϱ�\n" + "2.�뷡�θ���\n" + "3.���ἱ���ϱ�\n" + "4.���뷡�Ƿº���\n" + "5.������";

		String bevMenu = "���Ḧ �������ּ���\n" + "1.���̴�\n" + "2. �ݶ�\n" + "3. ȯŸ\n" + "4. Ŀ��";

		int bev = 0; // �� ���� �� �ִ� ���� ��
		int p_bev = 0; // ���� ���� �� �ִ� ���� ��
		int bevChoiced = 0; // ���� ���� ��

		int scoreTotal = 0; // �θ� �뷡���� �� ��
		int sang = 0; // �θ� �뷡�� ��

		System.out.println(introMsg); // ȯ���մϴ� �޼��� ������

		while (true) {
			System.out.println(mainMenu);	// ����ڷ� ���� �޴� ���� ����
			choice = sc.nextInt();		// ����ڰ� �Է��� ���� choice��� ������ ����
			if (choice == 5) { // ������
				System.out.println("������ �� ������~");
				break;		// �ý��� ����
			} else if (choice == 1) { // �ݾ��Է��ϱ�
				// ����ڿ��� �ݾ��� �Է¹޾Ƽ�
				// �θ� �� �ִ� �뷡 ����� �ܵ� ����ϱ�
				System.out.print("�ݾ� �Է� >> ");		// ����ڿ��� �ݾ� �Է� ����
				int money = sc.nextInt();		// ����ڰ� �Է��� ���� money��� ������ ����

				// money�� 300 �̸��� ����ִٸ� �߸��Է��߽��ϴ� ��� �� ���� �޴��� �̵��ϱ�
				if (money < 300) {		// �Է��� ���� 300�̸��� ���
					System.out.println("�߸��Է��߽��ϴ�\n");		// ����ڿ��� �߸��Է��ߴٴ� �޼��� ���
					continue;		// ���� �޴��� ���ư��� ���� continue ���
				}
				songCnt = songCnt + (money / 300); // ���� �� �� ���
				songTotalCnt = songTotalCnt + (money/300);	// �� �� �� ���
				int rest = money % 300; // �ܵ� ���� �� ���
				System.out.println("�θ� �� �ִ� �뷡  : " + songCnt); // ����ڿ��� �θ� �� �ִ� �뷡 �� ���
				
				if (rest != 0) { // �ܵ��� 0�� �ƴ϶��
					System.out.println("�ܵ�  " + rest + "���� ��ȯ�Ǿ����ϴ�!");		// �ܵ� ��ȯ �޼���
				}

			} else if (choice == 2) { // �뷡�θ���
				if (songCnt < 1) {		// �θ� �� �ִ� ���� ���� 1���� �۴ٸ�
					System.out.println("�ݾ��� ���� ������ּ���\n");	// ����ڿ��� �ݾ��� �־�޶�� �䱸 �޼��� ���
					continue;		// ���� �޴��� ���ư��� ���� continue ���
				}
				songCnt--;	// �뷡�� �ҷ��⿡ ���� �θ� �� �ִ� �뷡 �� ����
				int score = r.nextInt(100) + 1;		// �뷡������ 1~100�� ������ ���� ���

				System.out.println("����� ������ " + score + "��");		// �뷡 ������ ���
				if (score == 100) {		// �뷡������ 100���̶��
					songCnt++;		// ���� �θ� �� �ִ� �뷡�� ���� +1����
					System.out.println("�Ϳ� �����ص� �ǰھ��~");	// Ī�� �޼���
//					System.out.println("�θ� �� �ִ� �뷡 : " + songCnt); // �ݺ��Ǳ⿡ ���������� �̵���Ŵ
				} else if (score >= 80) {	// �뷡������ 80�� �̻��̶��
					System.out.println("����մϴ�.");	// Ī�� �޼���
//					System.out.println("�θ� �� �ִ� �뷡 : " + songCnt);
				} else if (score >= 50) {		// �뷡������ 50�� �̻��̶��
					System.out.println("������ �� ���� ����� ���� �ſ���~");		// ���� �޼���
//					System.out.println("�θ� �� �ִ� �뷡 : " + songCnt);
				} else {		// 50�� �̸��� �������
					if (songCnt >= 1) {	// ���� �θ� �� �ִ� �� ���� 1�̻��̶��
						songCnt--;	// ���� �θ� �� �ִ� �� �� -1
					}
					System.out.println("�뷡 �� ���� �����մϴ�");		// ���� �޼���
				}
				System.out.println("�θ� �� �ִ� �뷡 : " + songCnt);	// ���� �θ� �� �ִ� �뷡 �� ���
				scoreTotal = scoreTotal + score;		// �θ� �뷡 ���� �ջ�
				System.out.println("���� ���� : " + scoreTotal);	// ���� �θ� �������� ����
				sang++;	// �θ� �� �� +1
				System.out.println("�θ� �� �� : " + sang);	// �θ� �� �� ���
			} else if (choice == 3) { // ���ἱ���ϱ�
				bev = songTotalCnt/3;		// �� ���� �� �ִ� ���� �� ���
				p_bev = bev - bevChoiced;	// ���� ���� �� �ִ� ���� �� ���
				System.out.println(songTotalCnt);
				System.out.println("bev = "+ bev);
				System.out.println("bevChoiced = "+bevChoiced);
				System.out.println("p_bev = " +p_bev);
				if (p_bev < 1) { // ���� ���� �� �ִ� ������� 1���� ���ٸ�
					System.out.println("���񽺸� ���� ����� " +(3-(songTotalCnt%3)) +"�� �����մϴ�\n");	// ���񽺸� ���� ��� ���� ���
					continue;	// ���θ޴��� ���ư��� ���� continue ���
				} else {		// �� ���� �� �ִ� ���� ���� 1 �̻��̶��
					System.out.println("���Ǽ� �ִ� ����� " + p_bev + "���Դϴ�");	// ���� ���� �� �ִ� ���� �� ���
					System.out.println(bevMenu);		// ����ڷκ��� ���� ���� ����
					int bevNum = sc.nextInt();		// ������ ���� ��ȣ ���

					if (bevNum >= 5 || bevNum < 1) {	// ���� ��ȣ�� �߸� �Է� ���� ���
						System.out.println("�߸� �Է��Ͽ����ϴ�");	// ���� �޼��� ���
					} else {		// ���� ��ȣ�� �� �Է��Ͽ��ٸ�
						bevChoiced++;		// ������ ���� �� +1
						if (bevNum == 1) {		// 1�� ���� ��
							System.out.println("���̴� �Դϴ�");	// ���̴� ���
							System.out.println("bevChoiced = "+bevChoiced);
						} else if (bevNum == 2) {	// 2�� ���� ��
							System.out.println("�ݶ� �Դϴ�");		// �ݶ� ���
						} else if (bevNum == 3) {	// 3�� ���� ��
							System.out.println("ȯŸ �Դϴ�");		// ȯŸ ���
						} else if (bevNum == 4) {	// 4�� ���� ��
							System.out.println("Ŀ�� �Դϴ�");		// Ŀ�� ���
						}
					}
				}
			} else if (choice == 4) { // ���뷡�Ƿº���
				// ���ݱ��� �θ� �뷡 ���� ���� / ���ݱ��� �θ� �뷡 ����
				// �Ҽ��� �Ʒ� �� �ڸ����� ����ϱ�
				if (sang < 1) {		// ���� �θ� �뷡 ���� 1�̸��̶��
					System.out.println("�θ� �뷡�� �����ϴ�.");		// �θ� �뷡�� ���ٴ� �޼��� ���
				} else {		// �θ� �뷡 ���� 1 �̻��̶��
					System.out.println("�뷡�� ��� ������ " + (scoreTotal / sang) + "�Դϴ�");	// �뷡 ��� ���� ���
				}
			} else { // ����ڰ� ���� �޴��� ���� ��ȣ�� �Է����� ���
				System.out.println("�߸� �Է��߽��ϴ�.");
			} // if�� �ݴ� �߰�ȣ
			System.out.println();
		} // while�� �ݴ� �߰�ȣ
	}
}