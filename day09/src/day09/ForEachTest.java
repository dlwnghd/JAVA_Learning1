package day09;

public class ForEachTest {
	public static void main(String[] args) {
		String[] fruits = {"���", "����", "������", "����"};		// String�迭 fruits�� {}���� �� �Է�
		for(int i = 0; i < fruits.length; i++) {		// int�� i�� 0; i�� fruits������ ���� �̸�����; i++
			System.out.println(fruits[i]);		// fuits[i]�� ���
		}
		// ���� �����ϰų� ������ ��, �ε�����ȣ�� �ʿ��Ҷ� �Ϲ� for���� ����ϸ� ���ϴ�
		fruits[0] = "�ٳ���";		// fruits[0]�� "�ٳ���" �Է�
		
		System.out.println("----------------------------------------");
		// fruits��� �迭 ���� ��Ҹ� name�̶�� ������ �޾ƿ´�
		for(String name : fruits) {		// StringŸ�� name���� : fruits���� ���ʴ�� �Է�
			System.out.println(name);	// name ���
		}
		
		int[] nums = {10,20,30};		// int�迭 nums�� {}���� �� �Է�
		for(int num : nums) {		// intŸ�� num���� : nums���� ���ʴ�� �Է�
			System.out.println(num);		// num ��� + �ٹٲ�
		}
	}
}