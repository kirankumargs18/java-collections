package com.kirangs.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();

		studentList.addAll(Arrays.asList(new Student(1, "Kiran", "Bangalore"), new Student(2, "Nandish", "Kolar"),
				new Student(3, "Bhaya", "Mulbagal")));

		studentList.forEach(System.out::println);

		System.out.println("After sorting by Roll No : ");

		Collections.sort(studentList, new SortByRollNo());

		studentList.forEach(System.out::println);

		System.out.println("After sorting by Name : ");

		Collections.sort(studentList, new SortByName());
		studentList.forEach(System.out::println);

	}

}
