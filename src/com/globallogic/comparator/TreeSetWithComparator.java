package com.kirangs.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class sortInDesc implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		return o2 - o1;
	}

}

public class TreeSetWithComparator {

	public static void main(String[] args) {

		// by default treeSet sorts elements in ascending order
//		Set<Integer> treeSet = new TreeSet<>(new sortInDesc());

//		Set<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//
//				return o2 - o1;
//			}
//		});

		Set<Integer> treeSet = new TreeSet<>((o1, o2) -> o2 - o1);

		treeSet.addAll(Arrays.asList(6, 5, 4, 3, 2, 1));

		System.out.println(treeSet);

	}

}
