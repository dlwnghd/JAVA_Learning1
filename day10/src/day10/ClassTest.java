package day10;

public class ClassTest {
	public static void show(Student s) {	// show��� �޼ҵ忡 StudentŸ���� s���� �޾ƿ�
		System.out.println("---�л�����---");
		System.out.println("�̸� : " + s.name);
		System.out.println("���� : " + s.kor);
		System.out.println("���� : " + s.eng);
	}
	
	
	public static void main(String[] args) {
		String name = "����ȫ";
		// kim : ��ü, �ν��Ͻ� Ȥ�� ����������� �ϱ⵵ ��
		// new : �޸𸮿� �Ҵ�����ִ� ������
		// Student() : ����� ��ġ�� �˷��ش�, ������
		Student kim = new Student();	// ��üȭ
		Student park = new Student();	// ��üȭ
		
		
		// StudentŸ�� kim(��ü/�ν��Ͻ�)���� name, kor, eng�� ����
		kim.name = "��ö��";	// ���������� : kim(��ü) �ȿ��ִ� name�� "��ö��"�� �Է�
		kim.kor = 90;	//	���������� : kim(��ü) �ȿ��ִ� kor�� 90�� �Է�
		kim.eng = 80;	//	���������� : kim(��ü) �ȿ��ִ� eng�� 80�� �Է�
		
		
		park.name = "�ڿ���";	// ���������� : kim(��ü) �ȿ��ִ� name�� "��ö��"�� �Է�
		park.kor = 100;	//	���������� : kim(��ü) �ȿ��ִ� kor�� 90�� �Է�
		park.eng = 70;	//	���������� : kim(��ü) �ȿ��ִ� eng�� 80�� �Է�
		
		System.out.println("[Ŭ�����ȿ� �޼ҵ�� ���]");
		kim.introduce();
		park.introduce();
		System.out.println();
		
		ClassTest.show(park);
		ClassTest.show(kim);
		
//		System.out.println("--- �л�����---");
//		System.out.println("�̸� : "+kim.name);	// kim(��ü) �ȿ��ִ� name ���
//		System.out.println("���� : "+kim.kor);		// kim(��ü) �ȿ��ִ� kor ���
//		System.out.println("���� : "+kim.eng);	// kim(��ü) �ȿ��ִ� eng ���
//		
//		System.out.println("--- �л�����---");
//		System.out.println("�̸� : "+park.name);	// park(��ü) �ȿ��ִ� name ���
//		System.out.println("���� : "+park.kor);		// park(��ü) �ȿ��ִ� kor ���
//		System.out.println("���� : "+park.eng);		// park(��ü) �ȿ��ִ� eng ���
	}
}


class Student{	// �츮���� �ڷ���(type)�� �������
	String name;		// ���, ��� ����, �ν��Ͻ� ����(�ν��Ͻ� ���� �޶���)
	int kor;				// ���, ��� ����, �ν��Ͻ� ����(�ν��Ͻ� ���� �޶���)
	int eng;				// ���, ��� ����, �ν��Ͻ� ����(�ν��Ͻ� ���� �޶���)
	
	public void introduce( ) {	// ���, ��� �Լ� == �޼ҵ�
		System.out.println("---�л��������---");
		System.out.println("�̸� : " + this.name);	// this() : ���� �����ߴ��� �˰� ����
		System.out.println("���� : " + this.kor);
		System.out.println("���� : " + this.eng);
	}
}
















