package com.shop.bill;

import com.shop.pm.PriceMatrix;

//import com.shop.pm.PriceMatrixImpl_v1;

/*
 *  design and performance issues
 *  -------------------------------
 *  
 *  1. tight-coupling
 *  
 *     Maintenance , cant extend with new features
 *     
 *  2. too many dependencies created and destructed... 
 *  
 *     slow , much memory , too many resources
 *     
 *  3. Unit-Testing not possible     
 *  
 *     bug fix slow , dev slow
 *  
 *  
 *  
 *  
 *  
 *  why these issues ?
 *  
 *   dependent itself creating it's own dependency.
 *   
 *  
 *   
 *  soln :
 *  
 *   dont create , do lookup
 *   
 *   
 *   
 *   
 *  Limitation on Lookup:
 *  
 *   location tight-coupling
 *   
 *   
 *   
 *   
 *  best soln :
 *  
 *   don't create , don't lookup , inject by 'some-one'   ( IOC )
 *   
 *   
 *   
 *   IOC -> Inversion of control
 *   
 *   
 *   how to implement IOC ?
 *   
 *    using 'Dependency Injection' ( DI )
 *    
 *    types of DI
 *    
 *    --> constructor DI
 *    --> setter DI
 *  
 * 
 * 
 * "closed for modification , open for extension
 * 
 * 
 * 
 */

public class BillingImpl {

	private PriceMatrix priceMatrix;

	public BillingImpl(PriceMatrix priceMatrix) {
		super();
		this.priceMatrix = priceMatrix;
	}

	public double getTotalPrice(String[] cart) {

		double total = 0.0;

		for (int i = 0; i < cart.length; i++) {
			total += priceMatrix.getPrice(cart[i]);
		}

		return total;

	}

}
