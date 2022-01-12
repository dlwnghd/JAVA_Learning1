package homework;

import java.util.Scanner;

public class JAVA_01_11 {
	public static void name() {
		// 1�� Ǯ��
		Scanner sc = new Scanner (System.in);
		System.out.print("�̸� �Է� >> ");
		String name = sc.next();
		System.out.print("�ݺ� Ƚ�� �Է� >> ");
		int cnt = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			System.out.println(name);
		}
	}
	
	public static void Alphabet(int target) {
		// 1�� Ǯ��
		if (target >= 65 && target <= 90) {
			System.out.println("�빮��");
		} else if(target >= 97 && target <= 122){
			System.out.println("�ҹ���");
		}else {
			System.out.println("���ĺ��� �ƴմϴ�!");
			return;
		}
	}
	
	public static void Alpha_Change(char target) {
		// 1�� Ǯ��
		if (target >= 65 && target <= 90) {
			target += 32;
		} else if(target >= 97 && target <= 122){
			target -= 32;
		}else {
			System.out.println("���ĺ��� �ƴմϴ�!");
			return;
		}
		System.out.println(target);		
	}
	
	public static void Arrary_Out1(int[] ar) {
		System.out.print("{");		// "{" ���, ���� �ܺ� �迭�� ���� ���ȣ
		for (int i = 0; i < ar.length; i++) {		// int i�� 0�̰�; i�� ar.length���� �̸�����; i++
			if(i == ar.length-1) {				
				System.out.print(ar[i]);
			}else {				
				System.out.print(ar[i] + ", ");
			}
		}
		System.out.print("}");		// "{" ���, ���� �ܺ� �迭�� ���� ���ȣ
	}
	
	public static void Arrary_Out2(int[][] ar) {
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
	}
	

	
	public static void main(String[] args) {
		// 1. ����ڿ��� �̸��� �ݺ� Ƚ���� �Է� �޾Ƽ�
		// ����ڰ� �Է��� �̸��� �ش� �ݺ� Ƚ����ŭ ����ϴ� �޼ҵ�
		JAVA_01_11.name();

		// 2. target�̶�� ������ ����ִ� ���� �빮������ �ҹ������� �Ǻ��ϴ� �޼ҵ�
		// �����	(��, target���� �ҹ��� Ȥ�� �빮�� ���� ���ڸ� �� �� �ִ�)
		char target = 'a';	// �ٸ� ���ڰ� ���� �۵� �ȵǰ� �����
		// 65~90 || 97~122������ ���ĺ� �ƽ�Ű�ڵ� ��ȣ
		JAVA_01_11.Alphabet(target);
		
		// 3. target�̶�� ������ ����ִ� ���� �빮�ڶ�� �ҹ��ڷ�,
		// �ҹ��ڶ�� �빮�ڷ� �ٲپ� ����ϴ� �޼ҵ� �����
		// (��, target���� �ҹ��� Ȥ�� �빮�� ���� ���ڸ� �� �� �ִ�)
		JAVA_01_11.Alpha_Change(target);
		
		// 4. �迭�� ��Ҹ� ������ִ� �޼ҵ� �����
		// {10, 20, 30}
		// {{10, 20}, {30, 40}, {50, 60}}
		// {{10, 20}, {30, 40}, {50, 60}, {70, 80}}
		// ���� ������ n�����̶�� ����ؼ� �ڵ带 �������ϴ� �������� ���� ���̴�.
		// �׷��ٸ� ������ ���� ���� ������ִ� �ڵ带 ����� ���� ���� ���� ��
		int[] ar1 = {10, 20, 30};
		int[][] ar2 = {{10, 20}, {30, 40}, {50, 60}};
		int[][] ar3 = {{10, 20}, {30, 40}, {50, 60}, {70, 80}};
//		System.out.println(ar1.length);	// ar1�� �ִ� �������� ���̸� �� �� �ִ�. �ٸ� �迭�� ��� ������ �� ���� ����. �Ŀ�.....
//		System.out.println(ar2.length);
//		System.out.println(ar3.length);
		
		
		JAVA_01_11.Arrary_Out1(ar1);
		System.out.println();
		JAVA_01_11.Arrary_Out2(ar2);
		System.out.println();
		JAVA_01_11.Arrary_Out2(ar3);
	}
}