package in.tnsif.client;
import in.tnsif.application.GSNormalAcc;
import in .tnsif.application.GSPrimeAcc;
import in.tnsif.application.GSShopFactory;
import in.tnsif.framework.ShopFactory;
import in.tnsif.framework.NormalAcc;
import in.tnsif.framework.PrimeAcc;

public class GoShoppingApplicationClient {
	public static void main(String args[]) {
		ShopFactory s = new GSShopFactory();
		PrimeAcc p = new GSPrimeAcc(5760,"PRABAL NAIR",570,true);
		NormalAcc n = new GSNormalAcc(2370,"AGNI NAIR",270,60);
		System.out.println("Prime Acoount");
		p.bookProduct(p.getCharges());
		System.out.println("Normal Account");
		n.bookProduct(n.getCharges());
		System.out.println(p);
		System.out.println(n);
	}
}