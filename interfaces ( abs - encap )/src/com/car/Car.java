package com.car;

//import com.wheel.MRFWhee
import com.wheel.Wheel;

/*
 *  design issues
 *  
 *  -> tight-coupling
 *  
 *  
 *   OO principle
 *   
 *   " closed for modification but open for extension "
 * 
 * 
 *   Soln : use Interface
 * 
 */

public class Car {

	// private MRFWheel wheel;

	// public void setWheel(MRFWheel wheel) {
	// this.wheel = wheel;
	// }

	private Wheel wheel;

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void move() {
		wheel.rotate();
		System.out.println("Car moving >>>");
	}

}
