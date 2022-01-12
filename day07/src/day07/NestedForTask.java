package day07;

public class NestedForTask {
	public static void main(String[] args) {
	      /*
	       *  *****
	       *  *****
	       *  *****
	       *  *****
	       *  *****
	       * 
	       * */
			System.out.println("-------------");
			for (int j = 0; j < 5; j++) { // j �� 0; j�� 5�̸��� ���� �ݺ�; j++;
				for (int i = 0; i < 5; i++) { // i�� 0; i�� 5�̸��� ���� �ݺ�; i++;
					System.out.print("*"); // "*"���
				}
				System.out.println(); //
			}
			
	      /*
	       * *
	       * **
	       * ***
	       * ****
	       * *****
	       * 
	       * */
			
//			��ü������ ���� 
//			1. i�� 5�̸��̸� 2������ �Ŀ� �ٽ� ���۽� i++ �ƴϸ� for�� Ż��
//			2. j�� i���϶�� 3������ �Ŀ� �ٽ� ���۽� j++ �ƴϸ� for�� Ż��
//			3. "*"�� ��� �� 2������
//			4. "����" �Է� �� 1������
			
			for (int i = 0; i < 5; i++) { // i�� 0; i�� 5�̸�����; i = i+1; (i => 0,1,2,3,4)
				for (int j = 0; j <= i; j++) { // j�� 0; j�� i������ ����; j = j + 1; (j => 0,1,2,3,4 ���� i���� Ŭ �� ����)
					System.out.print("*"); // "*"���
				}
				System.out.println(); // ���� �ٷ� �̵�
			}
			
	      /*
	       *     *
	       *    **
	       *   ***
	       *  **** 
	       * *****
	       * 
	       * */
			
			// ���� for��
//			for(int i =0; i <5; i++) {		// i�� 5; i�� 0�ʰ����� �ݺ�; i = i-1;
//				for(int j = 0; j < 4-i; j++) {	// j�� 0; j�� (i-1)�̸����� �ݺ�; j = j + 1;
//					System.out.print(" ");	// "*"���
//				}
//				for(int j = 0; j < i+1; j++) {		// j�� 0; j�� i+1�̸����� �ݺ�; j = j + 1;
//					System.out.print("*");		// "*" ���
//				}
//				System.out.println();	// Enter �� �ٲ�
//			}
			
			
			// j
			/*	01234
		       *     *		<--- i ==0		: j 0123 " ", j 4 "*"
		       *    **	<--- i ==1		: j 012 " ", j 34 "*"
		       *   ***	<--- i ==2		: j 01 " ", j 234 "*"
		       *  **** 	<--- i ==3		: j 0 " ", j 1234 "*"
		       * *****	<--- i ==4		: j  " ", j 01234 "*"
		       * 
		       * */
			
			
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (j < 4 - i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
	      
	      // ������ 2�ܺ��� 9�ܱ��� ����ϱ�
			for (int dan = 2; dan <= 9; dan++) {
				System.out.println("----" + dan + "��----");
				for (int i = 0; i < 9; i++) {
					System.out.println(dan + " * " + (i + 1) + dan * (i + 1));
				}
			}
	      
	}
}
