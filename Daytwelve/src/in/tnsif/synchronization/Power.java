package in.tnsif.synchronization;

public class Power {
	
	synchronized void printPower(int num)
	{
		int x=1;
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+num+"^"+"Value :"+num*x);
			x=num*x;
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

}
