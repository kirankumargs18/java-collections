package com.globallogic.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {

			List<Integer> marksList = new ArrayList<>();

			// Reading marks from user
			System.out.println("Enter number of Students : ");
			int numberOfStudents = input.nextInt();

			System.out.println("Enter " + numberOfStudents + " marks seperated by space : ");
			for (int i = 0; i < numberOfStudents; i++) {
				int marks = input.nextInt();
				marksList.add(marks);
			}

			// Highest marks scored by the student
			System.out.print("\nHighest marks scored by the student : " + highestMarks(marksList));

			// Average of all marks
			System.out.print("\nStudents average marks : " + averageOfMarks(marksList));

			// Marks scored by third student
			System.out.print("\nMarks scored by third student : " + marksScoredByThirdStudent(marksList));

			// Sort and display marks using iterator
			System.out.println("\nSort and Display marks : ");
			sortAndDisplayUsingIterator(marksList);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	/*
	 * To calculate highest marks scored by student
	 */
	private static int highestMarks(List<Integer> marksList) {

		return Collections.max(marksList);
	}

	/*
	 * To calculate average of all marks scored by students
	 */
	private static double averageOfMarks(List<Integer> marksList) {

		int sum = 0;

		for (Integer marks : marksList) {
			sum += marks;
		}

		return (sum / marksList.size());
	}

	/*
	 * To calculate marks scored by third student
	 */
	private static int marksScoredByThirdStudent(List<Integer> marksList) {

		return marksList.get(2);
	}

	/*
	 * To sort marks and display using iterator
	 */
	private static void sortAndDisplayUsingIterator(List<Integer> marksList) {

		Collections.sort(marksList);

		Iterator<Integer> intIterator = marksList.iterator();
		int i = 1;
		while (intIterator.hasNext()) {
			System.out.println(i + "-" + intIterator.next());
			i++;
		}

	}

}
