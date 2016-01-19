package com;

import com.emp.Employee;

public class App {

	public static void main(String[] args) {

		Employee employee = new Employee();
		// employee.id = 101;
		// employee.name = "Nag";
		// employee.salary = 1000.00;
		// employee.bonus = employee.salary * 0.2;

		employee.setId(101);
		employee.setName("Nag");
		employee.setSalary(1000.00);

		// ------------------------------------

		// un-expected init..
		// employee.salary = 0;
		employee.setSalary(0);

		employee.setSalary(2000.00);

		// -------------------------------------

		System.out.println(employee);

	}

}
