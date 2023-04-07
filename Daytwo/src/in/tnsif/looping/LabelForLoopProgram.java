package in.tnsif.looping;

public class LabelForLoopProgram {

	public static void main(String[] args) {
		outer:
			for(int i=1;i<=5;i++)
			{
				System.out.println();
				inner:
					for(int j=1;j<=5;j++)
					{
						if(j==3)
							continue;
						System.out.print(j+" ");
						
						
					}
			}

	}

}
