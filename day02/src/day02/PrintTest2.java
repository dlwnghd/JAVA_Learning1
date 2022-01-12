package day02;

public class PrintTest2 {
	public static void main(String[] args) {
		/*print();
		 * 괄호 안의 값을 콘솔창에 출력한다
		 * 줄바꿈 X, Enter X*/
		System.out.print("안녕하세요");
		System.out.print("반갑습니다");
		System.out.println();																			//줄바꿈
		System.out.printf("오늘은 %-10d일입니다\n", 31);							//형식 지정자(%d)
		System.out.printf("원주율은 %-10.2f입니다\n", 3.14159265);		//형식 지정자(%f)
		System.out.printf("저의 학점은 %-10c입니다\n",'A');							//형식 지정자(%c)
		System.out.printf("저의 학점은 %-10s입니다\n","이주홍");				//형식 지정자(%s)
		
		// 형식지정자가 여러개 쓰였을 경우
		// 순서를 맞추어 사용한다
		System.out.printf("%c, %d 와 %s", 'a', 10, "ddd");
	}
}