package in.tnsif.looping;

import java.util.Scanner;

public class ForLoopProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Total number to be Print");
		int n=s.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.println(i);
		}
		for(int i=0;i<=n;i++)
		{
			System.out.print(i+" ");
		}

	}

}
