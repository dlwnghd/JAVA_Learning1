package day03;

public class PlusOperator {
	public static void main(String[] args) {
		System.out.println("[������(operator)]");
		System.out.println("--- int + ? ---");
		System.out.println(10 + 10);	// int + int --> int
		System.out.println(10 + 3.0);	// int + double--> double
		System.out.println(10 + 'b');	// int + char --> int 
		// ��(�ƽ�Ű�ڵ�ǥ�� ���� char�� 10������ �ٲپ� ���)
		System.out.println(10 + "����ȫ");	// int + String --> String, ����
		
		System.out.println("");
		System.out.println("--- double + ? ---");
		System.out.println(10.5+2);	// double + int --> double
		System.out.println(10.5+0.5);	// double + double --> double
		System.out.println(10.5+'a');	// double + char --> double
		System.out.println(10.5+"����ȫ");	// double + String --> String, ����
		
		System.out.println("");
		System.out.println("--- char + ? ---");
		System.out.println('a'+2);	// char + int --> int
		System.out.println('a'+0.5);	// char + double --> double
		System.out.println('a'+'a');	// char + char --> int
		System.out.println('a'+"����ȫ");	// char + String --> String, ����
		
		System.out.println("");
		System.out.println("--- String + ? ---");
		System.out.println("����ȫ"+2);	// String + int --> String, ����
		System.out.println("����ȫ"+0.5);	// String + double --> String, ����
		System.out.println("����ȫ"+'a');	// String + char --> String, ����
		System.out.println("����ȫ"+"����ȫ");	// String + String --> String, ����
		
		System.out.println("");
		System.out.println("+�����ڰ� ������ ���Ǿ��� ���");	//������� ������ ��
		System.out.println(10 + "20" + 90 + 'a');	// String 102090a
		
		System.out.println(10 + 'a' + "" + "A");	// �ڡڡڡڡ�String 107A
		
		String day = "10";
		System.out.println(10 + day + 1);	// String 10101
	}

}