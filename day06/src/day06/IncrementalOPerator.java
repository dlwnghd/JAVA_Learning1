package day06;

public class IncrementalOPerator {
	public static void main(String[] args) {
		// �������� �������� ���� : �켱����
		int num = 10;
//		++num; // num = num + 1;
//		System.out.println(++num);	// ������� ����� ����� --> ������, ���
		System.out.println(num++);	// ����Ŀ� ����� ����� --> ���, ������
		System.out.println(num);
		
		int a = 10;
		int b = a++;		// a = a + 1�� ���� �Ǿ��� ������ a�� 11�̴�.
		System.out.println(a);
		System.out.println(b);		
	}

}
