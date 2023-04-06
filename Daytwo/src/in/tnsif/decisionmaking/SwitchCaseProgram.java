package in.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCaseProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Select Song -> ");
		int song=s.nextInt();
		switch (song)
		{
		case 1:
			System.out.println("Hello U");
			break;
		case 2:
			System.out.println("Prabal 1.0");
			break;
		case 3:
			System.out.println("Roll");
			break;
		default:
			System.out.println("Invalid Input");
		}

	}

}
