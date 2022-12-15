package com.globallogic.collection;

public class Employee {

	public int id;
	public String name;
	public String department;
	public int salary;
	public int age;

	public Employee(int id, String name, String department, int salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + ", age="
				+ age + "]";
	}

}
