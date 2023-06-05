package in.tnsif.multiplethread;

public class MyRunnableThread implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Thread in running State");
	}

	public static void main(String[] args) {
		
		MyRunnableThread m=new MyRunnableThread();
		m.run();
		

	}


}
