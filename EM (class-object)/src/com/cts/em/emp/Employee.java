// package dec
package com.cts.em.emp;

// import statement(s)
import java.lang.*;

// public class
public class Employee {

	// variables

	// a. class variables
	public final static String COMP_NAME = "CTS";
	public static String trName = null;

	// b. obj or instance variables
	public int id;
	public String name;

	// constructor(s)
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// methods

	// a. class methods
	public static void doTraining() {
		System.out.println("Employee::doTraining");
	}

	// b. obj or instance method

	public void doListenAndWork() {
		System.out.println(this.name + "::doListen+doWork");
	}

	// Inner class

}

// default class(s)
class Abc {

}
