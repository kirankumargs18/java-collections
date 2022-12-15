package com.globallogic.scorecard;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ScoreCard {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {

			Map<String, Integer> scores = new LinkedHashMap<>();

			// Read player's score and store in map
			System.out.println("Enter number of players batted : ");
			int numberOfPlayersBatted = input.nextInt();
			System.out.println("Enter scores in the format player_name player_score : ");

			for (int i = 0; i < numberOfPlayersBatted; i++) {
				String name = input.next();
				int score = input.nextInt();
				scores.put(name, score);
			}

			System.out.println(scores);

			// Players who batted
			System.out.println("Players who batted : ");
			scores.keySet().forEach(System.out::println);

			// Scores by all players
			System.out.println("Scores by players : ");
			scores.entrySet().forEach(System.out::println);

			// Total Score
			int totalRuns = 0;
			for (Integer score : scores.values()) {
				totalRuns += score;
			}
			System.out.println("Total Score : " + totalRuns);

			// Name of the highest scorer
			System.out.print("Name of highest scorer : ");
			for (Entry<String, Integer> entry : scores.entrySet()) {

				if (entry.getValue() == scores.values().stream().max(Integer::compare).get()) {
					System.out.print(entry.getKey());
					break;
				}
			}

			// Runs scored by a player
			System.out.println("\nEnter a player name to get his runs: ");
			String playerName = input.next();
			System.out.print("Runs Scored by " + playerName + " :");
			for (Entry<String, Integer> entry : scores.entrySet()) {

				if (entry.getKey().equalsIgnoreCase(playerName)) {
					System.out.print(entry.getValue());
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
