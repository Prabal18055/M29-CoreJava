package in.tnsif.classandobject;

public class Customer {

	private int customerid;
	private String customername;
	private String customercity;
	public int getCustomerid() 
	{
		return customerid;
	}
	public void setCustomerid(int customerid)
	{
		this.customerid = customerid;
	}
	public String getCustomername() 
	{
		return customername;
	}
	public void setCustomername(String customername)
	{
		this.customername = customername;
	}
	public String getCustomercity() 
	{
		return customercity;
	}
	public void setCustomercity(String customercity) 
	{
		this.customercity = customercity;
	}
	public Customer() {
		super();
		
	}
	public Customer(int customerid, String customername, String customercity) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.customercity = customercity;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", customercity="
				+ customercity + "]";
	}

	}
