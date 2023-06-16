package in.tnsif.application;


import in.tnsif.framework.CurrentAcc;
import in.tnsif.framework.SavingAcc;
import in.tnsif.framework.BankFactory;
public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc s = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return s;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc c = new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return c;
	}

	
	
	
}