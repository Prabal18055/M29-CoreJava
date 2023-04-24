package in.tnsif.methodoverloading;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		MethodOverLoadingExample m=new MethodOverLoadingExample();
				System.out.println(m.multiplication(4.22f, 4.35f));
				System.out.println(m.multiplication(4.22f, 35));
				System.out.println(m.multiplication(22, 4.35f));
				System.out.println(m.multiplication(42, 35));
				System.out.println(m.print("prabal"));
				System.out.println(m.print("pra","bal"));
				
	}

}
