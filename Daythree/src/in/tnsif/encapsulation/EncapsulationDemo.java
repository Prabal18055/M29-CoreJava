package in.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		HDFCBank b=new HDFCBank();
		b.setCardno(566373773);
		b.setType("Debit Card");
        b.setCvv(564);
        b.setPin(8467);
        System.out.println(b.getCardno());
        System.out.println(b.getType());
        System.out.println(b.getCvv());
        System.out.println(b.getPin());
	}

}
