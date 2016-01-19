package com;

/*
 *  Reference TypeCasting
 *  
 *  implicit
 *  
 *  Human  --> LivingThing
 *  
 *  explicit
 *  
 *  LivingThing --> Human (if LivingThing is Human )
 * 
 */

class V {

}

class C extends V {

}

class B extends V {

}

public class Reference_TypeCasting {

	public static void main(String[] args) {

		// C c=new C();
		// B b=new B();

		// V v=new C(); // impicit
		// v=new B();

		V v = new B();

		if (v instanceof C) {
			C c = (C) v; // explicit
			System.out.println("Happy Casting");
		} else {
			System.out.println("cannot cast..");
		}
	}

}
