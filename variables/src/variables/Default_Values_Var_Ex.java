package variables;

/*
 *  In java , by default both static and instance var has -default-values' when didnt initilize
 *  
 *  type
 *  
 *  integral  --> 0
 *  real      --> 0.0
 *  char      --> \u0000
 *  boolean   --> false
 *  
 *  reference  --> null
 *  
 *  
 *  local var must be init before we use.
 *  
 */

class Abc {
	static int staVar;
	int insVar;

	void m() {
		int localVar;
//		System.out.println(localVar);
	}
}

public class Default_Values_Var_Ex {
	public static void main(String[] args) {

		System.out.println(Abc.staVar);

		Abc abc = new Abc();
		System.out.println(abc.insVar);

	}

}
