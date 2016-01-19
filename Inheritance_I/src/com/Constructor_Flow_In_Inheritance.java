package com;

class A {

	private int pri;

	public A(int arg1) {
		super();
		System.out.println("Im A");
		this.pri = arg1;
	}

	public int getPri() {
		return pri;
	}

}

class B extends A {
	public B(int v) {
		super(v);
		System.out.println("Im B");
	}
}

class C extends B {
	public C(int v) {
		super(v);
		System.out.println("Im C");
	}
}

public class Constructor_Flow_In_Inheritance {

	public static void main(String[] args) {
		C c = new C(123);

		System.out.println(c.getPri());
	}

}
