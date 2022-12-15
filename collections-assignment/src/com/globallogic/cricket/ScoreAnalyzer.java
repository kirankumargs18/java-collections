package com.globallogic.cricket;

import java.util.LinkedList;

public class ScoreAnalyzer {

	private LinkedList<Integer> runsData;

	public ScoreAnalyzer() {
		super();
	}

	public ScoreAnalyzer(LinkedList<Integer> runsData) {
		super();
		this.runsData = runsData;
	}

	/*
	 * To add runs to List
	 */
	public void addRunsToList(int runs) {

		runsData.addLast(runs);
	}

	/*
	 * To calculate run rate of the team
	 */
	public float calcRunRate() {

		int totalRuns = 0;
		for (Integer score : runsData) {
			totalRuns += score;
		}
		return (float) (totalRuns / 50.0);
	}

	/*
	 * To get lowest runs scored by a player
	 */
	public Integer getLowestRuns() {

		return runsData.stream().filter(score -> score != -1).min(Integer::compare).get();
	}

	/*
	 * To display runs scored by all players
	 */
	public void displayRuns() {

		runsData.forEach(System.out::println);
	}

}
