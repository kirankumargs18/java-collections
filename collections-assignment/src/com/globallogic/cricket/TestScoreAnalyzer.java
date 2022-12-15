package com.globallogic.cricket;

import java.util.LinkedList;
import java.util.Scanner;

public class TestScoreAnalyzer {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {

			LinkedList<Integer> scoreCard = new LinkedList<>();
			ScoreAnalyzer analyzer = new ScoreAnalyzer(scoreCard);

			// Reading input
			System.out.println("Enter scores of all players seperated by space (enter -1 for who didn't bat): ");
			for (int i = 0; i < 10; i++) {

				int runs = input.nextInt();
				analyzer.addRunsToList(runs);
			}
			System.out.println(scoreCard);

			// Runs scored by all players
			System.out.println("Runs scored by all players : ");
			for (int i = 0; i < scoreCard.size(); i++) {
				if (scoreCard.get(i) != -1) {
					System.out.println((i + 1) + "-" + scoreCard.get(i));
				}
			}

			// Run Rate of the team
			System.out.println("Run Rate : " + analyzer.calcRunRate());

			// Display lowest runs scored
			System.out.println("Lowest runs scored by a player : " + analyzer.getLowestRuns());

			// count number of players batted
			System.out.println(
					"Number of players who did batting : " + scoreCard.stream().filter(score -> score != -1).count());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
