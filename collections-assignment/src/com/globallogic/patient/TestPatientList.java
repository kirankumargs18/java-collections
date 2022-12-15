package com.globallogic.patient;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TestPatientList {

	public static void main(String[] args) {

		// create 3 objects and add to patient list
		Patient patient1 = new Patient(101, "Naveen", 54);
		Patient patient2 = new Patient(102, "Shravan", 45);
		Patient patient3 = new Patient(103, "Kiran", 40);

		List<Patient> patientList = new ArrayList<>();
		patientList.add(patient1);
		patientList.add(patient2);
		patientList.add(patient3);

		// sorting based on name
		System.out.println("=============================Sorting based on Name===================================\n");
		patientList.stream().sorted(Comparator.comparing(Patient::getName)).forEach(System.out::println);

		// sorting based on age
		System.out.println("\n=============================Sorting based on Age===================================\n");
		List<Patient> patients = patientList.stream().sorted(Comparator.comparing(Patient::getAge))
				.collect(Collectors.toList());
		Iterator<Patient> itr = patients.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// adding all patients to tree set
		System.out.println("======================add all patients to TreeSet and display=========================\n");
		TreeSet<Patient> patientSet = new TreeSet<Patient>(patientList);
		patientSet.forEach(System.out::println);

		// getting patient age by giving name
		System.out.println("\n====================Get Patient Age by Name = Kiran=============================\n");
		int age = getPatientAge("Kiran", patientSet);
		if (age != -1) {
			System.out.println("Patient's age : " + age);
		} else {
			System.out.println("Patient with Name : Kiran not found");
		}

	}

	/*
	 * To get patient age by giving name and patient set
	 */
	private static int getPatientAge(String name, TreeSet<Patient> patientSet) {

		for (Patient patient : patientSet) {
			if (patient.getName().equalsIgnoreCase(name)) {
				return patient.getAge();
			}
		}
		return -1;
	}

}
