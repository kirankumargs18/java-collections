package com.globallogic.duplicatepatient;

import java.util.LinkedHashSet;
import java.util.Set;

import com.globallogic.patient.Patient;

public class TestPatientSet {

	public static void main(String[] args) {

		// create 3 objects of patient and add to linked hash set
		Patient patient1 = new Patient(101, "Naveen", 54);
		Patient patient2 = new Patient(102, "Shravan", 45);
		Patient patient3 = new Patient(103, "Naveen", 54);

		Set<Patient> patientSet = new LinkedHashSet<>();
		patientSet.add(patient1);
		patientSet.add(patient2);
		patientSet.add(patient3);

		// display size of the set
		System.out.println("Size of the Set : " + patientSet.size());

		// display the set
		System.out.println("\n===========================patient set=======================");
		patientSet.forEach(System.out::println);
	}

}
