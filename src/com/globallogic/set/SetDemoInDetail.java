package com.globallogic.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemoInDetail {

	public static void main(String[] args) {

		/*
		 * HashSet
		 * 
		 * It doesn't maintain insertion order. It allows null value.
		 */
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("one");
		hashSet.add("two");
		hashSet.add("three");
		hashSet.add("four");
		hashSet.add("five");
		hashSet.add(null);

		System.out.println("HashSet : " + hashSet);

		/*
		 * LinkedHashSet
		 * 
		 * It maintains insertion order. It allows null value
		 */
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(null);
		linkedHashSet.add("one");
		linkedHashSet.add("two");
		linkedHashSet.add("three");
		linkedHashSet.add("four");
		linkedHashSet.add("five");

		System.out.println(linkedHashSet);

		/*
		 * TreeSet
		 * 
		 * It sorts the elements in ascending by default. It does not allow null value.
		 */
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("one");
		treeSet.add("two");
		treeSet.add("three");
		treeSet.add("four");
		treeSet.add("five");
		
		System.out.println(treeSet);

	}

}
