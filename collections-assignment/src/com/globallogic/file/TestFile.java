package com.globallogic.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TestFile {

	public static void main(String[] args) {

		// read statets.txt file and add to set
		try (BufferedReader br = new BufferedReader(
				new FileReader("/home/kiran/Desktop/Stackroute_Training/collections-assignment/states.txt"))) {

			Set<String> statesSet = new LinkedHashSet<>();

			String line;
			while ((line = br.readLine()) != null) {

				statesSet.add(line);
			}

			// number of states
			System.out.println("\nNumber of states : " + statesSet.size());

			// remove Delhi from the set
			statesSet.remove("Delhi");

			// states whose name starts with K
			System.out.println("\nStates names where name starts with K : ");
			statesSet.stream().filter(state -> state.startsWith("K")).forEach(System.out::println);

			// states in sorted order and collecting into new set and printing
			System.out.println("\nStates in sorted order : ");
			statesSet.stream().sorted().collect(Collectors.toSet()).forEach(System.out::println);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
