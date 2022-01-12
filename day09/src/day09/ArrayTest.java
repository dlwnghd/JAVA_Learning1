package day09;

public class ArrayTest {
	public static void main(String[] args) {
		int[][] arr = new int [3][2];
		
		int[][] ar = { 
						{ 10, 20 }, 
						{ 100, 200 }, 
						{ 1, 2 }
					};
		System.out.println("ar.length : " + ar.length);
		System.out.println("ar[0].length : " + ar[0].length);
		System.out.println("ar[1].length : " + ar[1].length);
		System.out.println("ar[2].length : " + ar[2].length);

		System.out.println("ar[1][0] : " + ar[1][0]);
		System.out.println("ar[2][1] : " + ar[2][1]);

//		System.out.println("{" + ar[1][0] + ", " + ar[1][1] + "}");
		
		
		for(int[] array : ar) {		// intŸ���� �迭�� array�� : ar�迭 ����
			for(int num : array) {
				System.out.println(num);
			}
		}
		ar[0][1] = 2000;
		
		System.out.println("---------------------------------");
		System.out.print("{");		// "{" ���, ���� �ܺ� �迭�� ���� ���ȣ
		for (int i = 0; i < ar.length; i++) {		// int i�� 0�̰�; i�� ar.length���� �̸�����; i++
			System.out.print("{");		// "{" ���, ���� �迭�� ���� ���ȣ
			for (int j = 0; j < ar[i].length; j++) {		// int j�� 0�̰�; j�� ar[i].length���� �̸�����; j++
				if (j == ar[i].length - 1) {		// j�� ar[i].length - 1�϶�
					System.out.print(ar[i][j]);		// "ar[i][j]"���
				} else { // j�� 1�� �ƴ϶��
					System.out.print(ar[i][j] + ",");		// "ar[i][j],"���
				}
			}
			if(i == ar.length -1) {		// i�� ar.length -1�϶�		
				System.out.print("}");		// "}" ���, ���� ������ �迭�� �ݴ� ���ȣ
			}else {			// i�� 2�� �ƴ϶��	
				System.out.print("}, ");		// "}, " ���, ���� �迭�� �ݴ� ���ȣ
			}
		}
		System.out.print("}");		// "}" ���, ���� �ܺ� �ݴ� ���ȣ
//		System.out.print(ar[0][0]);
//		System.out.print(", ");
//		System.out.print(ar[0][1]);
//		System.out.print("}");
	}
}