package in.tnsif.factorydesignpattern;

public class SelectNetworkFactory {
	public Cellularplan getPlan(String planType) {
		if (planType==null) {
			return null;
		}
		if(planType.equalsIgnoreCase("abcNetwork")) {
			return new abcNetwork();
		}
		else if(planType.equalsIgnoreCase("pqrNetwork")) {
			return new pqrNetwork();
		}
		else if(planType.equalsIgnoreCase("xyzNetwork")) {
			return new xyzNetwork();
		}
		return null;
	}

}
