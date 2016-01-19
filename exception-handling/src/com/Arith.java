package com;

import java.util.Scanner;

public class Arith {

	public static void main(String[] args) {

		System.out.println("begin");

		Scanner sc = new Scanner(System.in);

		System.out.println("Pls enter num-1");
		int num1 = sc.nextInt();

		System.out.println("Pls enter num-2");
		int num2 = sc.nextInt();

		System.out.println("1.Add");

		System.out.println("2.Sub");

		try {
			System.out.println("3.Div");
			int result = num1 / num2;

		} catch (ArithmeticException ae) {

			// handling

			/*
			 * report to end-user 
			 * log exception 
			 * re-throw exception to another
			 * module re-lease used resources..
			 * 
			 */
			
			System.out.println("Ex-"+ae.getMessage());

		}

		System.out.println("4.Mul");

		System.out.println("happy-end...");

	}

}
