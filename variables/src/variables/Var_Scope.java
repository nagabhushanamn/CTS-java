package variables;

/*
 *  Java-Memory
 *  
 *  Thread --> stack
 *  
 *  
 *  HEAP
 * 
 */

class NewPerson {

	String name;

	static int count = 0; // class scope

	// int count = 0; // instance/object var ( Object scope )

	public void sayHello() {
		// int count = 0; // local var ( local scope )
		count++;
		System.out.println(this.name + "--> Hello " + count);
	}
}

public class Var_Scope {

	public static void main(String[] args) {

		NewPerson person1 = new NewPerson();
		person1.name = "Nag";
		NewPerson person2 = new NewPerson();
		person2.name = "Riya";

		person1.sayHello();

		person2.sayHello();
		person2.sayHello();

	}

}
