package in.tnsif.firstpackage;

public class Base {
	int vardefault=10;
	public String varpublic="Prabal";
	private int varprivate=2323;
	protected int varprotected=2323;
	
	void methoddefault()
	{
		System.out.println("Default access method  "+vardefault);
	}
	public void methodpublic()
	{
		System.out.println("public access method  "+varpublic);
	}
	private void methodprivate()
	{
		System.out.println("public access method  "+varprivate);
	}
	protected void methodprotected()
	{
		System.out.println("public access method  "+varprotected);
	}

}
