package main;

import java.util.ArrayList;

public class Main {
	
	public static final double TOTAL = 100.0;
	
	public static void main(String args[]){
		ArrayList<IPricingStrategy> strategies = new ArrayList<IPricingStrategy>();
		
		IPricingStrategy simple  = new SimplePricingStrategy(TOTAL);
		IPricingStrategy vsimple = new VerySimplePricingStrategy(TOTAL);
		CompositePricingStrategy complex = new CompositePricingStrategy();
		
		complex.addPricingStrategy(simple);
		complex.addPricingStrategy(vsimple);
		
		strategies.add(simple);
		strategies.add(vsimple);
		strategies.add(complex);
		
		for(IPricingStrategy s : strategies){
			double total = s.getTotal();
			System.out.println("Total: " + total);
		}
	}

}
