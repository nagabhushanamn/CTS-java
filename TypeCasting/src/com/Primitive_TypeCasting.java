package com;

//TypeCasting

/*
 *  implicit
 *  explicit
 * 
 */


/*
 *     ---------------------------------
 *     | double 64                             |            ^
 *     |-------------------------------        | explicit   | Implicit
 *     |float 32                               |            |
 *     ---------------------------------       V            |
 *     |long 64
 *     ---------------------------------
 *     |int 32
 *     ---------------|-----------------
 *     | short 16     |
 *     -------------- |   char - 16
 *     | byte 8       |
 *     |--------------|-----------------
 * 
 * 
 * 
 */

public class Primitive_TypeCasting {

	public static void main(String[] args) {

		// byte b = 123;
		// short s = b; // implicit
		//
		// b = (byte) s; // explicit
		//
		// System.out.println(b);

		// -----------------------------

		// int i = 456;
		// byte b = (byte)i;
		//
		// System.out.println(b);
		
		//------------------------------
		
		for (int i = 0; i <127; i++) {
			System.out.println(i +" -> "+(char)i);
		}
		

	}

}
