package day05;
import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
		// ����ڿ��� ��������, ��������, ���������� �Է� �޾�
		// ����� 90�� �̻��̶�� A
		// 80�̻� 90�̸� B
		// 70�̻� 80�̸� C
		// 70�̸� F
		
		//���� �Է� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �Է� >> ");
		int kor = sc.nextInt();
		System.out.print("�������� �Է� >> ");
		int eng = sc.nextInt();
		System.out.print("�������� �Է� >> ");
		int math = sc.nextInt();
		
		// ��հ� ��� ����
		int avg = (kor + eng + math) / 3;
		
		// ���ǹ� �� ��� ����
		String res;
		if (avg >= 90) {
			res = "A";
		}else if (avg >= 80 /*&& avg < 90*/) {
			res = "B";
		}else if (avg >= 70 /*&& avg < 80*/) {
			res = "C";
		}else /* if (avg < 70) */ {
			res = "F";
		}
		System.out.println(res);
		
		//�� ����ֱ��
		System.out.println();
		
		char target = 'a';
		// target�� ����ִ� ���� �ҹ��ڶ�� �ҹ����Դϴ�
		// �빮�ڶ�� �빮���Դϴ�
		// �׿��� ���ڶ�� �׿� �Դϴ� ����ϱ�
		
		//���ǹ�, �Ϲ��� ��ȯ �� ��� ����
		String about;
		if (target >= 'a' && target <= 'z' ) {
			about = "�ҹ���";
		}else if (target >= 'A' && target <= 'Z') {
			about = "�빮��";
		}else {
			about = "�� �� ";
		}
		System.out.println(about + "�Դϴ�");
		
		
		
		// target�� ����ִ� ���� �ҹ��ڶ�� �빮�ڷ�,
		// �빮�ڶ�� �ҹ��ڷ�, �� �ܶ�� �״�� ����ϱ�
		if (target >= 'a' && target <= 'z') {
			System.out.println((char)(target - 32));
		}else if (target >= 'A' && target <= 'Z') {
			System.out.println((char)(target + 32));
		}else {
			System.out.println(target);
		}
	}

}