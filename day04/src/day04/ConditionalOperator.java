package day04;

import java.util.Scanner;

public class ConditionalOperator {
	public static void main(String[] args) {
		System.out.println(true ? "�ȳ�" : 10);
		System.out.println(false ? "�ȳ�" : 10);
		// ����ڿ��� ���̸� �Է¹ް�, �����̶�� �����Դϴ� ���, �̼����ڶ�� �̼����� �Դϴ� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̸� �Է��Ͻÿ� >> ");
		int age = sc.nextInt();
		
		System.out.println(age > 19 ? "�����Դϴ�" : "�̼������Դϴ�");
		
		
		
	}
}
