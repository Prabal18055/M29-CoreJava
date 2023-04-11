package in.tnsif.classandobject;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int id;
		System.out.println("Enter ID");
		id=s.nextInt();
		
		s.nextLine();
		String city,name;
		System.out.println("Enter City");
		city=s.next();
		System.out.println("Enter Name");
		name=s.next();
		Customer c=new Customer();
		c.setCustomercity(city);
		c.setCustomerid(id);
		c.setCustomername(name);
		System.out.println(c);
		
		Customer c1=new Customer(id,city,name);
		System.out.println("Enter ID");
		id=s.nextInt();
		s.nextLine();
		System.out.println("Enter City");
		city=s.next();
		System.out.println("Enter Name");
		name=s.next();
		c1.setCustomercity(city);
		c1.setCustomerid(id);
		c1.setCustomername(name);
		System.out.println(c1);
		

	}

}
