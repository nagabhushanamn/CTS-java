package variables;

public class Primitive_Var_Ex {

	public static void main(String[] args) {

		/*
		 * range : -2^n-1 to 0,2^n-1 -1
		 * 
		 * e.g byte - 8bit
		 * 
		 * -128 to 127
		 * 
		 */

		byte byteVar = 12;
		short shortVar = 1212;
		int intVar = 121212;
		long longVar = 12121211212L;

		double doubleVar = 12.12;
		float floatVar = 12.12F;

		// char charVar = 'A';
		// char charVar2 = 65;
		// char charVar3 = '\u0041';
		// System.out.println(charVar3);

		boolean b = true;

		// -----------------------

		int v = 0020;    // 0*8^3+0*8^2+2*8^1+0*8^0 = 16
		System.out.println(v);

		
		//int ii=08;
		
		// -------------------------

		long lakh = 100_000;

		// --------------------

		int binary = 0b0011;
		System.out.println(binary);

	}

}
