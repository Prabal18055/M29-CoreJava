package in.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseIFElseOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Person 1");
		float a=s.nextFloat();
		System.out.println("Person 2");
		float b=s.nextFloat();
		System.out.println("Person 3");
		float c=s.nextFloat();
		if (a>b  && a>c)
		{
			System.out.println("Person 1 highest");
		}
		else if (b>a  && b>c)
		{
			System.out.println("Person 2 highest");
		}
		else
		{
			System.out.println("Person 3 highest");
		}


	}

}
