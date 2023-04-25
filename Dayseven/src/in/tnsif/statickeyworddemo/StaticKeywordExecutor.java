package in.tnsif.statickeyworddemo;

public class StaticKeywordExecutor {

	public static void main(String[] args) {
		System.out.println(Employee.company);
		Employee a=new Employee(1,"Prabal");
		System.out.println(a);
		
		Employee b=new Employee(2,"Praful");
		System.out.println(b);
		
		Customer c=new Customer();
		System.out.println(c);
		
	}

}
