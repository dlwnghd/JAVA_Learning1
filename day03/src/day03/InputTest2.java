package day03;

import java.util.Scanner;	// java.util�̶����Ű������ Scanner��� Ŭ������ �ҷ���

public class InputTest2 {
	public static void main(String[] args) {
		// ����ڿ��� ���̸� �Է� �ް�, ����� ���̴� 00���Դϴ� ����ϱ�
		Scanner scan = new Scanner(System.in);	// Scanner�� scan���� ����Ѵٰ� ��ǻ�Ϳ��� �˷���
		System.out.print("���̸� �Է� �Ͻÿ� : ");	// ��¹�
		int age = scan.nextInt();	// �ܼ�â�� �Է��� ���� int(������)���� �޾ƿ�
		System.out.printf("����� ���̴� %d���Դϴ�.\n",age);		// �޾ƿ� ���� %d��ġ�� �����
		
		System.out.print("�������� �Է� �Ͻÿ� : ");	// ��¹�
		double pi = scan.nextDouble();	// �ܼ�â�� �Է��� ���� double(�Ǽ���)Ÿ������ pi��� ������ ������
		
		System.out.printf("�������� %.2f�Դϴ�.",pi);	// �޾ƿ� ���� %.2f��ġ�� ����� 
	}
}