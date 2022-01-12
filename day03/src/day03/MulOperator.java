package day03;

public class MulOperator {
	public static void main(String[] args) {
		System.out.println(10 * 10);	// int * int --> int
		System.out.println(10 * 10.0);	// int * double --> double
		System.out.println(10 * 'a');	// int * char --> int
		System.out.println("StringÀº °ö¼Á ºÒ°¡´É");
		
		System.out.println(10.0 * 10);	// double * int --> double
		System.out.println(10.0 * 10.0);	// double * double --> double
		System.out.println(10.0 * 'a');	// double * char --> double
		
		System.out.println('a' * 'a');	// char * char --> int
	}

}
