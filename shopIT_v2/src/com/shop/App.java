package com.shop;

import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

public class App {

	public static void main(String[] args) {

		// Init

		// some-one
		PriceMatrix priceMatrixV1 = new PriceMatrixImpl_v1();
		PriceMatrix priceMatrixV2 = new PriceMatrixImpl_v2();

		BillingImpl billComp = new BillingImpl(priceMatrixV2);

		// Use
		String[] cart = { "24324", "46456" };
		double total = billComp.getTotalPrice(cart);

		System.out.println("Total : " + total);

		// Destroy

	}

}
