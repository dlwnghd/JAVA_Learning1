package day03;

public class Casting {
	public static void main(String[] args) {
		// ����� ����ȯ
		System.out.println("����� ����ȯ");
		System.out.println((int)3.14);	// 3.14 --> 3
		System.out.println((double)3);
		System.out.println((char)97);
		
		// String --> int
		// parseInt(), Integer��� Ŭ���� �ȿ� ������� �ִ�
		int num = Integer.parseInt("100");
		
		//String --> double
		// parseDouble(), Double�̶�� Ŭ���� �ȿ� ������� �ִ�
		double d = Double.parseDouble("3.14");
		
		// �Ϲ��� ����ȯ
		System.out.println(10 * 1.0);	//�Ϲ���
		System.out.println('a' * 1);	//�Ϲ���
		System.out.println((double)'a');	//�����
		
		// int --> String		double --> String
		String test = 10 + "";
		
	}
}