package day02;

public class PrintTest2 {
	public static void main(String[] args) {
		/*print();
		 * ��ȣ ���� ���� �ܼ�â�� ����Ѵ�
		 * �ٹٲ� X, Enter X*/
		System.out.print("�ȳ��ϼ���");
		System.out.print("�ݰ����ϴ�");
		System.out.println();																			//�ٹٲ�
		System.out.printf("������ %-10d���Դϴ�\n", 31);							//���� ������(%d)
		System.out.printf("�������� %-10.2f�Դϴ�\n", 3.14159265);		//���� ������(%f)
		System.out.printf("���� ������ %-10c�Դϴ�\n",'A');							//���� ������(%c)
		System.out.printf("���� ������ %-10s�Դϴ�\n","����ȫ");				//���� ������(%s)
		
		// ���������ڰ� ������ ������ ���
		// ������ ���߾� ����Ѵ�
		System.out.printf("%c, %d �� %s", 'a', 10, "ddd");
	}
}