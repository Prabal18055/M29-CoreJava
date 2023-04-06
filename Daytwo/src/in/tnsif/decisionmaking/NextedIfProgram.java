package in.tnsif.decisionmaking;

import java.util.Scanner;

public class NextedIfProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num>0)
		{
			if(num<10)
			{
				System.out.println("It is Single Digit");
			}
			else
			{
				System.out.println("It is not Single Digit");
			}
		}
		

	}

}
