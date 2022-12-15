package com.globallogic.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTask {

	private static void mergeAndSort(ArrayList<String> teamA, ArrayList<String> teamB) {

		// merging
		for (String player : teamB) {
			if (!teamA.contains(player)) {
				teamA.add(player);
			} else {
				continue;
			}
		}

		// sorting
		Collections.sort(teamA);

		// display
		System.out.println("Team after merging teamA and teamB in sorted order : " + teamA);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> teamA = new ArrayList<String>();

		teamA.add("virat");
		teamA.add("rohit");
		teamA.add("surya");
		teamA.add("shreyas");
		teamA.add("pant");

		ArrayList<String> teamB = new ArrayList<String>();

		teamB.add("pant");
		teamB.add("dhavan");
		teamB.add("siraj");
		teamB.add("samson");
		teamB.add("surya");

		System.out.println("Team A : " + teamA);

		System.out.println("Team B : " + teamB);

		mergeAndSort(teamA, teamB);
		
		

	}

}
