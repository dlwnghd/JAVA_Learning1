package day10;

import java.util.Scanner;

public class MethodTask {
	
	public static void printName(String name, int cnt) {	// printName�̶�� �̸��� �޼ҵ� ���� (String�� name, int�� cnt)�� �޾ƿ�
		for (int i = 0; i < cnt; i++) {		// int�� i�� 0; i�� cnt�̸�����; i++
			System.out.println(name);	// name ���
		}		
	}
	
	public static boolean isCapital(char ch) {	// boolean������ ���� ������, isCapital�̶�� �̸��� �޼ҵ� ���� (char�� ch)�� �޾ƿ�
		if(ch >= 'a' && ch <= 'z') {	// ch�� a �̻� z ���� �� ��
			return false;	// false ������ ��ȯ, �ҹ��� + �޼ҵ幮 Ż��
		}	// return���� ���� �޼ҵ尡 �ٷ� ����Ǳ� ������ else ���� ����
		return true;	// true ������ ��ȯ, �빮��	+ �޼ҵ幮 Ż��
	}
	
	// �޼ҵ� �ȿ��� �ٸ� �޼ҵ� Ȱ���ϱ�
	public static char changeAlphabet(char ch) {	// char������ ���� ������, changeAlphabet�̶�� �̸��� �޼ҵ� ���� (char ch)�� �޾ƿ�
		if(MethodTask.isCapital(ch)) {	// MethodTaskŬ������ isCapital�� ch���� �־��ְ� isCapital�� ���� ��ȯ ���� �޾ƿ� true(�빮��)��� if�� ����
			 return(char)(ch + 32);	// (ch + 32)�� �Ϲ������� char������ �ٲپ� ������
		}else {	// isCapital�κ��� ���� ��ȯ���� true���� ���̶��
			return (char)(ch - 32);	// (ch - 32)�� �Ϲ������� char������ �ٲپ� ������
		}
	}
	
	public static void printAr(int[] array) {		// printAr�̶�� �̸��� �޼ҵ� ���� (int�迭 array)�� �޾ƿ�
		System.out.print("{");		// "{" ���
		for (int i = 0; i < array.length; i++) {	//	i�� 0; i�� array�� ������ ���� �̸�����; i++
			if (i == array.length - 1) {	// i�� (array�� ������ ���� -1)�� ���ٸ�
				System.out.print(array[i]);	// array[i]�� ���
				break;		// for�� ����(Ż��)
			}
			System.out.print(array[i] + ", ");	// "array[i]," ��� 
		}
		System.out.println("}");	// "}" ���
	}
	
	public static void main(String[] args) {
		// �ǹ������� main���� ����ڷκ��� ���� �Է¹��� �� �ֵ����ϴ� ��찡 ����
		// ex) �̴ϼ��� ����� ���� �ִµ� �̴ϼ��� �����̶�� ����ڰ� ���ϴ� ���� ���� ���� ����
		// ������ �̴ϼ��� ��û�Ͽ� ����ڰ� ���ϴ� �̴ϼ��� ���� �� �ִ� ���� ����ڰ� ���ϴ� ��
		// ��ó�� �޼ҵ�� ����� �ϵ� main���κ��� �Է°��� �޴� ���� ���ٰ� ������(�� ����)
		// ���� �ڵ忡 ������ ����
		
		// 1. ����ڿ��� �̸��� �ݺ� Ƚ���� �Է� �޾Ƽ�
		// ����ڰ� �Է��� �̸��� �ش� �ݺ� Ƚ����ŭ ����ϴ� �޼ҵ�
		Scanner sc = new Scanner(System.in);	// Scanner ����
		System.out.print("�̸� �Է� >> ");	// ����ڷ� ���� �̸� �Է� ����
		String name = sc.next();		// �Է��� �� String�� name�� ����
		System.out.print("�ݺ� Ƚ�� >> ");	// ����ڷ� ���� �ݺ� Ƚ�� �Է� ����
		int cnt = sc.nextInt();	// �Է��� �� int�� cnt�� ����
		
		MethodTask.printName(name, cnt);	//MethodTaskŬ�������� printName�̶�� �޼ҵ� ȣ�� (name, cnt)������ �Է�
		
		// 2. target�̶�� ������ ����ִ� ���� �빮������ �ҹ������� �Ǻ��ϴ� �޼ҵ�
		// ����� (��, target���� �ҹ��� Ȥ�� �빮�� ���� ���ڸ� �� �� �ִ�)
		char target = 'a'; // �ٸ� ���ڰ� ���� �۵� �ȵǰ� �����
		
		// �ǹ����� ����ڰ� ���ϴ� ���ڸ� ����ϰ� �ʹٰ� �ϴ� ��찡 ���� ���� �ִ�
		// �� ���� �޼ҵ� �Ⱥ��ٴ� main���� ����� �� �ֵ��� �ϴ� ���� ����.
		if (MethodTask.isCapital(target)) {	// MethodTaskŬ�������� isCapital�̶�� �޼ҵ� ȣ�� (target)������ �Է��ϰ� ���� ���� true���
			System.out.println("�����մϴ�!! �빮��!!!");	// "�����մϴ�!! �빮��!!!" ���
		}else {	// ���� ���� true�� �ƴ϶��
			System.out.println("�̤� �ҹ���");	// "�̤� �ҹ���" ���
		}
		
		// 3. target�̶�� ������ ����ִ� ���� �빮�ڶ�� �ҹ��ڷ�,
		// �ҹ��ڶ�� �빮�ڷ� �ٲپ� ����ϴ� �޼ҵ� �����
		// (��, target���� �ҹ��� Ȥ�� �빮�� ���� ���ڸ� �� �� �ִ�)
		char res = MethodTask.changeAlphabet(target);	// char�� res�� MethodTask Ŭ�������� changeAlphabet �޼ҵ� ȣ�� (target)������ �Է��ϰ� ���� ��
		System.out.println("�ٲ� ���: " + target + "-->" + res);	// �ٲ���: target --> res
		
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