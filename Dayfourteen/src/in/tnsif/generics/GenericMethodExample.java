package in.tnsif.generics;

class GenericMethod
{
	public <E> void print(E[] arr1)
	{
		for(E itr:arr1)
		{
			System.out.println(itr+" ");
		}
		System.out.println();
	}
}

public class GenericMethodExample {

	public static void main(String[] args) {
		GenericMethod g=new GenericMethod();
		Integer[] arr1= {11,22,33};
		Character[] arr2= {'f','p','r'};
		System.out.println("Integer");
		g.print(arr1);
		System.out.println("Character");
		g.print(arr2);
	}
}
