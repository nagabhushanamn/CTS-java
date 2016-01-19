package com.emp;

public class Employee {

	private int id;
	private String name;
	private double salary; // read & write
	private double bonus; // read-only

	// set / get

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
			this.bonus = this.salary * 0.2;
		}
	}

	public double getBonus() {
		return bonus;
	}

}
