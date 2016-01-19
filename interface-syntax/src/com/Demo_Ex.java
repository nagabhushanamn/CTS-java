package com;

interface I1 {
	public final static int VAR = 100;

	public abstract void m1();

	void m2();
}

interface I2 {
	void m3();
}

interface I3 extends I1, I2 {
	void m4();
}

class C1 implements I3 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub

	}

}

// --------------------------------------

interface I4 {
	void m();
}

interface I5 {
	void m();

	void m2();
}

class MyClass implements I4, I5 {

	@Override
	public void m() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

}

// -----------------------------------------

interface I6 {
	void m1();

	void m2();
}

abstract class A implements I6 {
	public void m1() {
	}
	// public void m2(){}
}

// -----------------------------------------

// JDK 1.8 -> Interface enhancements

interface OldInterface {

	public abstract void m();

	// public abstract void newM();

	public default void newM() {
		System.out.println("some-logic");
	}

	public static void staM() {
		System.out.println("Interface static method....");
	}

}

interface OtherInterface {
	public default void newM() {
		System.out.println("some-logic");
	}
}

class SomeClass implements OldInterface {

	@Override
	public void m() {

	}

	public void newM() {
		OldInterface.super.newM();
		System.out.println("some-new-logic");
	}

}

class OtherClass implements OldInterface, OtherInterface {

	@Override
	public void m() {

	}

	@Override
	public void newM() {
		// TODO Auto-generated method stub
		OtherInterface.super.newM();
	}

}

public class Demo_Ex {

	public static void main(String[] args) {

		SomeClass some = new SomeClass();
		some.newM();

		OtherClass other = new OtherClass();
		other.newM();

	}

}
