package day05;
import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >>");
		int n = sc.nextInt();
		
		if(n % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}
		
		if (n % 4 == 0) {
			System.out.println("4의 배수입니다");
		}
		
//		int num = 3;
//		
//		
//		if (num < 50) {
//			System.out.println("50보다 작은 값임");
//		}else if (num == 3) {
//			System.out.println("3입니다");
//		}	
	}

}