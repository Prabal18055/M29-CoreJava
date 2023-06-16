package in.tnsif.application;

import in.tnsif.framework.NormalAcc;
import in.tnsif.framework.PrimeAcc;
import in.tnsif.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc p=new GSPrimeAcc(accNo,accNm,charges,isPrime);
		return p;
	}


	@Override
	public NormalAcc getNewPrimeAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc n=new GSNormalAcc(accNo,accNm,charges,deliveryCharges);
		return n;
	}

}
