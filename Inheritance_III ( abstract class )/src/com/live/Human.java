package com.live;

/*
 *  Overriding
 *  -----------
 *  
 *  re-implementing base-class's method in sub-class with different-logic.
 *  
 *  
 *  coding rules
 *  
 *  Must be same
 *  
 *  --> method-name
 *  &
 *  --> type & order & number of arguments
 *  &
 *  --> return-type
 *  
 *  May different
 *  
 *  --> access specifier ( condn : shud not reduce visibilty )
 * 
 */

public abstract class Human extends LivingThing {

	public void learn() {
		System.out.println("Human::learn()");
	}

	// @Override
	// public void work() {
	// // super.work();
	// System.out.println("Human::work()");
	// }

}
