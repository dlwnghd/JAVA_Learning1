package day08;

public class ArrayTest {
	public static void main(String[] args) {
		
		// int �迭�� ar�̶�� �̸����� �ȿ� {10,20,30,...4,6}�� �ξ��
		int[] ar = { 10, 20, 30, 5, 6, 8, 9, 4, 5, 6, 1, 2, 4, 5, 7, 0, 5, 1, 6, 8, 4, 6 };

//		System.out.println(ar);
//		[I@626b2d4a
//		��迭�� intŸ���� �����ϴ� ���� �˰� �ִ�

//		System.out.println(ar[0]);	// �迭 ar�� 0��° ���
//		System.out.println(ar[1]);	// �迭 ar�� 1��° ���
//		System.out.println(ar[2]);	// �迭 ar�� 2��° ���
//		System.out.println(ar[3]); 	// ���� �߻�, �迭 �ε��� ������ ���
		System.out.println("ar.length : " + ar.length); // ar.length ���� ���

		// �迭 �ȿ� ������ ��ȯ
		ar[1] = 1000; // �迭 ar�� 1��°�� 1000�� �־��ּ���

		for (int i = 0; i < ar.length; i++) { // i�� 0����; i�� ar�� �����ͱ��� �̸�����; i++
			System.out.println("ar[" + i + "] :" + ar[i]); // ar[i]���
		}
	}
}