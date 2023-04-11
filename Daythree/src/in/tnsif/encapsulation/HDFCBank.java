package in.tnsif.encapsulation;

public class HDFCBank {
	private int cardno;
	private String type;
	private int cvv;
	private int pin;
	public int getCardno() {
		return cardno;
	}
	public void setCardno(int cardno) {
		this.cardno = cardno;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "HDFCBank [cardno=" + cardno + ", type=" + type + ", cvv=" + cvv + ", pin=" + pin + "]";
	}
	
}
