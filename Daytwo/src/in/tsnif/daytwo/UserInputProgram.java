package in.tsnif.daytwo;

import java.util.Scanner;

public class UserInputProgram {

	public static void main(String[] args) {
		System.out.println("Enter your salary ");
		Scanner s=new Scanner(System.in);
		float salary=s.nextFloat();
		System.out.println("salary is "+salary);
		System.out.println("Enter your name ");
		String name=s.next();
		System.out.println("Name is "+name);
		s.nextLine();
		System.out.println("Enter your name ");
		String name1=s.nextLine();
		System.out.println("Name is "+name1);
		System.out.println("Enter your Character ");
		char ch=s.next().charAt(0);
		System.out.println("charcter is  "+ ch);
		s.close();
	}

}
