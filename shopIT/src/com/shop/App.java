package com.shop;

import com.shop.bill.BillingImpl;

public class App {

	public static void main(String[] args) {

		// Init
		BillingImpl billComp = new BillingImpl();

		// Use
		String[] cart = { "24324", "46456" };
		double total = billComp.getTotalPrice(cart);

		System.out.println("Total : " + total);

		// Destroy

	}

}
