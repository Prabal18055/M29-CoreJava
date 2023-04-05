package in.tnsif.operatordemo;

import java.util.Scanner;

public class ArithmaticOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		System.out.println("Enter a number");
		int y=sc.nextInt();
		System.out.println("Addition two number "+(x+y));
		System.out.println("subtraction two number "+(x-y));
		System.out.println("Division two number "+(x/y));
		System.out.println("Modulus two number "+(x%y));
	}

}
