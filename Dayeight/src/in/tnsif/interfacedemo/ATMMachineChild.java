package in.tnsif.interfacedemo;

public class ATMMachineChild implements ATM{

	@Override
	public void withdraw() {
		System.out.println("Withdraw amount: " + amountWithDraw);
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit amount: " + amountDeposit);
		
	}

}