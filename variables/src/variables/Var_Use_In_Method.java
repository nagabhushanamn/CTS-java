package variables;

class Xyz {

	static int staVar = 1;
	int insVar = 2;

	static void staMethod(Xyz xyz) {
		System.out.println(staVar);
		// System.out.println(insVar);
		System.out.println(xyz.insVar);
	}

	void insMethod() {
		System.out.println(staVar); // common var
		System.out.println(this.insVar); // instance var
	}

}

public class Var_Use_In_Method {

	public static void main(String[] args) {

		Xyz.staMethod(new Xyz());

		Xyz xyz = new Xyz();
		xyz.insMethod();

	}

}
