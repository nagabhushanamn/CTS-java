package com;

class Employee {
	public void doWork() {
		System.out.println("Employee work");
	}
}

public class Try_Catch_Syntax {

	public static void main(String[] args) {

		System.out.println("A");

		try {
			System.out.println("B");
			int ari = 1 / 1;
			int[] nums = { 10, 20 };
			System.out.println(nums[1]);
			Employee employee = null;
			employee.doWork();
			System.out.println("C");
		}
		// catch (ArithmeticException ae) {
		// System.out.println("Ex:-" + ae.getMessage());
		// } catch (ArrayIndexOutOfBoundsException aioobe) {
		// System.out.println("Ex-" + aioobe.getMessage());
		// }
		// JDK 1.7
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Ex-" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Ex-" + e.getMessage());
		}

		System.out.println("E");
	}

}
