package day03;

//java.util ��Ű�� �ȿ��ִ� Scanner��� Ŭ���� ����Ѵٰ� ��ǻ�Ϳ��� �˷���
import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		// ��üȭ�� ����Ű ctrl + m
		// System.out.println();	//�ý��� Ŭ���� �ȿ� ������
		// next() ��� �Է¸޼ҵ尡 ������, Scanner Ŭ���� �ȿ� ������� �ִ�
		
		Scanner sc = new Scanner(System.in);
		// Scanner��� Ŭ������ sc��� �θ� ���̴�.
		// �ܼ�â���� �Է�, ������ sc�� �Ǿ��ִ³� �ٲپ �������
		// String str = "�ȳ�";
		
		System.out.print("�̸��� �Է����ּ���. >> ");	// ��¹�
		
		// ����ڰ� �ܼ�â���� �Է��� ���� String(���ڿ�)Ÿ������ �޾ƿ�
		// �Է��� ���� StringŸ������ name�̶�� ������ ������
		// ���� Ȥ�� ���ͷ� �����Ͽ� String Ÿ������ �޾ƿ´�.
		// String name = sc.next();
		
		// nextLine : ����ڰ� �Է��� ���� ��ä�� StringŸ������ �޾ƿ´�.
		// Enter�θ� ���ڸ� ������
		String name = sc.nextLine();
		
		System.out.printf("%s�� ȯ���մϴ�.",name);	//���� name�� ������ ���� %s ��ġ�� �����
		
	}
}