package com.globallogic.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	/*
	 * Sorts employee list based on age
	 * 
	 */
	private static void sortUsingAge(ArrayList<Employee> employeeList) {

		for (int i = 0; i < employeeList.size(); i++) {
			for (int j = 1; j < employeeList.size(); j++) {

				if (employeeList.get(j - 1).age > employeeList.get(j).age) {

					Collections.swap(employeeList, j - 1, j);
				}

			}
		}

		System.out.println("Employees sorted based on Age : ");
		printArrayList(employeeList);

	}

	/*
	 * Sorts employees based on name
	 * 
	 */
	private static void sortUsingName(ArrayList<Employee> employeeList) {

		for (int i = 0; i < employeeList.size(); i++) {
			for (int j = 1; j < employeeList.size(); j++) {

				if (employeeList.get(j - 1).name.charAt(0) > employeeList.get(j).name.charAt(0)) {

					Collections.swap(employeeList, j - 1, j);
				}

			}
		}

		System.out.println("Employees sorted based on Name : ");
		printArrayList(employeeList);

	}

	/*
	 * Sorts employees based on salary in descending order
	 * 
	 */
	private static void sortUsingSalaryInDesc(ArrayList<Employee> employeeList) {

		for (int i = 0; i < employeeList.size(); i++) {
			for (int j = 1; j < employeeList.size(); j++) {

				if (employeeList.get(j - 1).salary < employeeList.get(j).salary) {

					Collections.swap(employeeList, j - 1, j);
				}

			}
		}

		System.out.println("Employees sorted based on Salary in descending order: ");
		printArrayList(employeeList);

	}

	private static void printArrayList(ArrayList<Employee> employeeList) {
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(112, "Bhayanna", "Engineering", 22000, 22));
		employeeList.add(new Employee(114, "Nandish", "Engineering", 30000, 30));
		employeeList.add(new Employee(111, "Kiran", "Engineering", 21000, 21));
		employeeList.add(new Employee(115, "Ganguly", "Engineering", 27000, 27));
		employeeList.add(new Employee(113, "Shravan", "Engineering", 25000, 25));

		// sort using age field
		sortUsingAge(employeeList);

		// sort using name field
		sortUsingName(employeeList);

		// sort using salary in descending
		sortUsingSalaryInDesc(employeeList);

	}

}
