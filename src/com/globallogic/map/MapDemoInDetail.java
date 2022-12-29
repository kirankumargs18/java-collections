package com.globallogic.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemoInDetail {

	public static void main(String[] args) {

		/*
		 * HashMap
		 * 
		 * It does not maintain insertion order of key value pairs.HashMap allows one
		 * null key and multiple null values.
		 * by default keys will be sorted
		 */
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("one", "1");
		hashMap.put("two", "2");
		hashMap.put("three", "3");
		hashMap.put("four", "4");
		hashMap.put(null, "null value");
		hashMap.put(null, null); // overrides null key

		System.out.println(hashMap);

		/*
		 * LinkedHashMap
		 * 
		 * It maintains insertion order. It allows one null key and multiple null
		 * values.
		 */
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("one", "1");
		linkedHashMap.put("two", "2");
		linkedHashMap.put("three", "3");
		linkedHashMap.put("four", "4");
		linkedHashMap.put(null, "null value");
		linkedHashMap.put(null, null);

		System.out.println(linkedHashMap);

		/*
		 * TreeMap
		 * 
		 * It maintains insertion order. It does not allow null key but allows null
		 * values. It sorts key in ascending order.
		 */
		TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("one", "1");
		treeMap.put("two", "2");
		treeMap.put("three", "3");
		treeMap.put("four", "4");
		treeMap.put("null value", null);

		System.out.println(treeMap);

	}

}
