package in.tnsif.operatordemo;

public class BitwiseOperatorDemo {

	public static void main(String[] args) 
	{
		int result1= 10 & 7;
		System.out.println(result1);
		int result2= 10 | 7;
		System.out.println(result2);
		int result3= 10 ^ 7;
		System.out.println(result3);
		int result4= 6 << 2;// left shift first number to be shifted how many time(second number) (a*2^b)
		System.out.println(result4);
		int result5= 6 >> 2;// right shift first number to be shifted how many time(second number) (a/2^b)
		System.out.println(result5);

	}

}
