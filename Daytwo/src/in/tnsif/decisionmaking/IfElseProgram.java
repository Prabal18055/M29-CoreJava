package in.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Age");
		int age=s.nextInt();
		if (age>18) 
		{
			System.out.println("You Can Donate Blood");
		}
		else
		 {
			System.out.println("You Cann't Donate Blood");
		}}
}