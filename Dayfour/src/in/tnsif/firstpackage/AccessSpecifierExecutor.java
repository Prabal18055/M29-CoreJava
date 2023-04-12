package in.tnsif.firstpackage;

public class AccessSpecifierExecutor {

	public static void main(String[] args) {
		Base b=new Base();
		b.methoddefault();
		b.methodprotected();
		b.methodpublic();
		
		System.out.println(b instanceof Base);

	}

}
