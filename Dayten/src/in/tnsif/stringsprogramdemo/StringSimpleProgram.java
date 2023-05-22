package in.tnsif.stringsprogramdemo;

public class StringSimpleProgram {

	public static void main(String[] args) {
		
		//using string literal
		String str1 = "Prabal";
		System.out.println("Using string literal : " + str1);
		
		//using new keyword
		String str2 = new String("Prabal");
		System.out.println("Using new keyword : " + str2);
		
		String str3 = "Prabal";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str3);
		

	}

}