package day07;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
	// nextInt() --> Random�̶�� Ŭ������ ������� ����
		Random r = new Random();
		
		// nextInt(��) --> 0���� �� -1 ������ ������ �������� �����´�
		System.out.println(r.nextInt(100)+1);	// ������ intŸ���� ���� ������
	}
}
