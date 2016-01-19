package com.cts.em.academy;

import com.cts.em.emp.Employee;

public class Academy {

	public void manageEmployees() {

		Employee.trName = "Nag";

		// create employees

		Employee e1 = new Employee();
		e1.id = 101;
		e1.name = "Mousumi";

		Employee e2 = new Employee();
		e2.id = 102;
		e2.name = "Rinu";

		// doTraining
		Employee.doTraining();

		// doListen and doWork on employees
		e1.doListenAndWork();
		e2.doListenAndWork();

	}

}
