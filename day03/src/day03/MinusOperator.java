package day03;

public class MinusOperator {
	
	public static void main(String[] args) {
		System.out.println("[������(operator)]");
		System.out.println("--- int - ? ---");
		System.out.println(10 - 5);	// int - int --> int
		System.out.println(10 - 3.0);	// int - double--> double
		System.out.println(10 - 'b');	// int - char --> int 
		// ��(�ƽ�Ű�ڵ�ǥ�� ���� char�� 10������ �ٲپ� ���)
//		System.out.println(10 - "����ȫ");	// String�� ���� �Ұ���, �����߻�
		
		System.out.println("");
		System.out.println("--- double - ? ---");
		System.out.println(10.5-2);	// double - int --> double
		System.out.println(10.5-0.5);	// double - double --> double
		System.out.println(10.5-'a');	// double - char --> double
//		System.out.println(10.5-"����ȫ");	// String�� ���� �Ұ���, �����߻�
		
		System.out.println("");
		System.out.println("--- char - ? ---");
		System.out.println('a'-2);	// char - int --> int
		System.out.println('a'-0.5);	// char - double --> double
		System.out.println('a'-'a');	// char - char --> int
//		System.out.println('a'-"����ȫ");	// String�� ���� �Ұ���, �����߻�
		
		System.out.println("");
		System.out.println("--- String - ? ---");
		System.out.println("��ü �Ұ���");
//		System.out.println("����ȫ"-2);	// String�� ���� �Ұ���, �����߻�
//		System.out.println("����ȫ"-0.5);		// String�� ���� �Ұ���, �����߻�
//		System.out.println("����ȫ"-'a');	// String�� ���� �Ұ���, �����߻�
//		System.out.println("����ȫ"-"����ȫ");	// String�� ���� �Ұ���, �����߻�
		
		System.out.println("");
	}
}