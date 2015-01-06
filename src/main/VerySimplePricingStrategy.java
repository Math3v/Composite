package main;

public class VerySimplePricingStrategy implements IPricingStrategy {
	
	private double total;
	
	public VerySimplePricingStrategy(double total){
		this.total = total;
	}

	@Override
	public double getTotal() {

		return total;
	}

}
