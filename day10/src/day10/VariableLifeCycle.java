package day10;

public class VariableLifeCycle {
	// ���� �����ϱ� ��ƴٸ� change �޼ҵ忡 �ִ� ��� a�� �ϳ��� A�� �ٲپ� ���� 
	// ������ ���� ��Ұ� ���� ���̴� �� ������ ���������� ���� ������ ���� �ٲ� �� �ִ� ���̴�.
	public static int change(int a) {		// int���� �����ִ� change��� �̸��� �޼ҵ� ���� (int a)���� �޾ƿ�, change() �������� a�� ���� �����
		int num;	// ��������
		
		a += 100;	// a = a + 100, change() �������� a�� ���� �����
		return a;	// ���� �ӿ� ����� ���� ������
	}	// �޼ҵ� ȣ���� ������ �޸𸮿��� ������
	
	// main�ȿ� �ִ� ���������� �����ϴ�
	public static void main(String[] args) {
		int a = 10;		// main() ���� ��������,
		a = VariableLifeCycle.change(a);	// a�� VariableLifeCycleŬ�������� change�޼ҵ忡 (a��)�� �ް� ���� ���� ������ 
		System.out.println(a);	// main() �������� a�� �����
	}
}