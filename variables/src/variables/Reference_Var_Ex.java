package variables;

/*
 *  syntax to create reference var
 *  
 *  
 *  Type refVar;
 *  
 *  
 *  Type
 *  
 *     --> class-name
 *     --> interface-name
 *     --> enum
 *     --> annotation
 *     
 *     
 * 
 */

class Mobile {
	String model;
}

class Person {
	//
	Mobile mobile = null; // reference var
}

public class Reference_Var_Ex {
	public static void main(String[] args) {

		Person person = new Person();

		Mobile mobile = new Mobile();
		mobile.model = "new Model";

		person.mobile = mobile;

	}
}
