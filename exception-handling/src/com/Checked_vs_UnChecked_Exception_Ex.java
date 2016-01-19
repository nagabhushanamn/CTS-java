package com;

import java.io.IOException;

class Module1 {

	public void m1() throws Exception {
		System.out.println("m1()");

	}

}

class Module2 {

	public void m2() {
		Module1 module1 = new Module1();

		// module1.m1();

		System.out.println("m2()");
	}

}

public class Checked_vs_UnChecked_Exception_Ex {

	public static void main(String[] args) {

		Module2 module2 = new Module2();
		module2.m2();

	}

}
