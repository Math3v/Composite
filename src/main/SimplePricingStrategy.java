package main;

public class SimplePricingStrategy implements IPricingStrategy {
	
	private double total;
	
	public SimplePricingStrategy(double total){
		this.total = total;
	}

	@Override
	public double getTotal() {	
		
		return (total * 0.9);
	}

}
