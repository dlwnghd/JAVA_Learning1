package day09;

public class MethodTest {
	public static void printName(String name, int cnt) {		// PrintName�̶�� �޼ҵ� ���� (String�� name, int�� cnt)�� ������ ����
		for (int i = 0; i < cnt; i++) {		// i�� 0; i�� cnt�̸� ����; i++
			System.out.println(name);	// name ���
//			return; �޼ҵ�� return�� ������ ��� ����ȴ�
		}
	}
	
	public static void Invent() {		// Invent��� �޼ҵ� ����
		System.out.println("���α׷� ������");		// "���α׷� ������" ��� + �ٹٲ�
	}
	
	public static void main(String[] args) {
		// Ŭ������.�޼ҵ��();	Integer.parseInt();
		MethodTest.printName("����ȫ1",5);	// MethodTestŬ�������� printName�̶�� �޼ҵ� ȣ�� ("����ȫ1", 5)������ �Է�
		MethodTest.Invent();		// MethodTestŬ�������� Invent��� �޼ҵ� ȣ��
		MethodTest.printName("����ȫ2",2);	// MethodTestŬ�������� printName�̶�� �޼ҵ� ȣ�� ("����ȫ2", 2)������ �Է�
		MethodTest.Invent();		// MethodTestŬ�������� Invent��� �޼ҵ� ȣ��
		MethodTest.printName("����ȫ3",3);	// MethodTestŬ�������� printName�̶�� �޼ҵ� ȣ�� ("����ȫ3", 3)������ �Է�
	}
}