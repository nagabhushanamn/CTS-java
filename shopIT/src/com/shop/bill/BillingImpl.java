package com.shop.bill;

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
 *  why these issues ?
 *  
 *   dependent itself creating it's own dependency.
 *   
 *  soln :
 *  
 *   dont create , do lookup
 *   
 *  Limitation on Lookup:
 *  
 *   location tight-coupling
 *   
 *  best soln :
 *  
 *   donct create , dont lookup , get/inject by 'some-one'   ( IOC )
 *   
 *   IOC -> Inversion of control
 *  
 * 
 */

public class BillingImpl {

	// private PriceMatrixImpl_v1 priceMatrix;

	public double getTotalPrice(String[] cart) {

		double total = 0.0;
		// priceMatrix = new PriceMatrixImpl_v1();

		for (int i = 0; i < cart.length; i++) {
			// total += priceMatrix.getPrice(cart[i]);
		}

		return total;

	}

}
