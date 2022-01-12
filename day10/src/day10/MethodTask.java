package day10;

import java.util.Scanner;

public class MethodTask {
	
	public static void printName(String name, int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.println(name);
		}		
	}
	
	public static boolean isCapital(char ch) {
		if(ch >= 'a' && ch <= 'z') {
			return false;	// �ҹ��� + �޼ҵ幮 Ż��
		}
		return true;	// �빮��	+ �޼ҵ幮 Ż��
	}
	
	public static char changeAlphabet(char ch) {
		if(MethodTask.isCapital(ch)) {
			 return(char)(ch + 32);
		}else {
			return (char)(ch - 32);
		}
	}
	
	public static void printAr(int[] array) {
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i]);
				break;
			}
			System.out.print(array[i] + ", ");
		}
		System.out.println("}");
	}
	
	public static void main(String[] args) {
		// 1. ����ڿ��� �̸��� �ݺ� Ƚ���� �Է� �޾Ƽ�
		// ����ڰ� �Է��� �̸��� �ش� �ݺ� Ƚ����ŭ ����ϴ� �޼ҵ�
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�̸� �Է� >> ");
//		String name = sc.next();		
//		System.out.print("�ݺ� Ƚ�� >> ");
//		int cnt = sc.nextInt();
//		
//		MethodTask.printName(name, cnt);
		
		// 2. target�̶�� ������ ����ִ� ���� �빮������ �ҹ������� �Ǻ��ϴ� �޼ҵ�
		// ����� (��, target���� �ҹ��� Ȥ�� �빮�� ���� ���ڸ� �� �� �ִ�)
		char target = 'a'; // �ٸ� ���ڰ� ���� �۵� �ȵǰ� �����
		
		// �ǹ����� ����ڰ� ���ϴ� ���ڸ� ����ϰ� �ʹٰ� �ϴ� ��찡 ���� ���� �ִ�
		// �� ���� �޼ҵ� �Ⱥ��ٴ� main���� ����� �� �ֵ��� �ϴ� ���� ����.
		if (MethodTask.isCapital(target)) {
			System.out.println("�����մϴ�!! �빮��!!!");
		}else {
			System.out.println("�̤� �ҹ���");
		}
		
		// 3. target�̶�� ������ ����ִ� ���� �빮�ڶ�� �ҹ��ڷ�,
		// �ҹ��ڶ�� �빮�ڷ� �ٲپ� ����ϴ� �޼ҵ� �����
		// (��, target���� �ҹ��� Ȥ�� �빮�� ���� ���ڸ� �� �� �ִ�)
		char res = MethodTask.changeAlphabet(target);
		System.out.println("�ٲ� ���: " + target + "-->" + res);
		
		
		
		
		
		// 4. �迭�� ��Ҹ� ������ִ� �޼ҵ� �����
		// {10, 20, 30}
		// {{10, 20}, {30, 40}, {50, 60}}
		// {{10, 20}, {30, 40}, {50, 60}, {70, 80}}
		int[] ar = {10, 20, 30};
		int[][] ar2 = {{10, 20}, {30, 40}, {50, 60}};
		int[][] ar3 = {{10, 20}, {30, 40}, {50, 60}, {70, 80}};
		MethodTask.printAr(ar);
		
	}

	// ���� �ذ��� ���� ���ͳݿ��� �ۿ� �� ������ �ƽ��Ե� ������ ������ ���ߴ� �Ƹ� ���� ���� �ڵ忡 ���� ���ص��� �����ϱ� ������ ���̴�.
//	public static void main(String[] args){
//		int[][] lengthTest1 = new int[7][3];
//		System.out.println( lengthTest1.length ); // 7 
//		String lengthTest2 = "lengthSizeTest"; 
//		System.out.println( lengthTest2.length() ); // 14 
//		ArrayList<Object> sizeTest = new ArrayList<Object>();
//		System.out.println( sizeTest .size() ); // 0 }
//	}
}