package com.cts.em;

import com.cts.em.academy.Academy;

public class App {

	public static void main(String[] args) {

		//
		System.out.println("start....");

		Academy host = new Academy();
		host.manageEmployees();

		System.out.println("end.....");
	}

}
