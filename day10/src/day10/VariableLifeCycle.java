package day10;

public class VariableLifeCycle {
	public static int change(int a) {
		int num;	// ��������
		
		a += 100;	// change() �������� a�� ���� �����
		return a;	// ���� �ӿ� ����� ���� ������
	}	// �޼ҵ� ȣ���� ������ �޸𸮿��� ������
	
	public static void main(String[] args) {
		int a = 10;		// main() ���� ��������,
		a = VariableLifeCycle.change(a);	// a�� ����� ���� ����Ǽ� �Ѿ
		System.out.println(a);	// main() �������� a�� �����
	}
}
