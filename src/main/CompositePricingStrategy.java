package main;

import java.util.ArrayList;

public class CompositePricingStrategy implements IPricingStrategy {
	
	private ArrayList<IPricingStrategy> strategies = new ArrayList<IPricingStrategy>();
	
	public void addPricingStrategy(IPricingStrategy strategy){
		this.strategies.add(strategy);
	}

	@Override
	public double getTotal() {
		
		double min = Integer.MAX_VALUE;
		for(IPricingStrategy s : strategies){
			if(s.getTotal() < min){
				min = s.getTotal();
			}
		}
		
		return min;
	}

}
