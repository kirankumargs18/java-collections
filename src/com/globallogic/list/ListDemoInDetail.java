package com.globallogic.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemoInDetail {

	public static void main(String[] args) {

		/*
		 * ArrayList
		 * 
		 * ArrayList internally uses a dynamic array to store the elements. Manipulation
		 * with ArrayList is slow because it internally uses an array.ArrayList is
		 * better for storing and accessing data. Generally, when an ArrayList is
		 * initialized, a default capacity of 10 is assigned to the ArrayList.
		 */
		ArrayList<Integer> numberArrayList = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			numberArrayList.add(i);
		}

		System.out.println(numberArrayList);

		/*
		 * LinkedList
		 * 
		 * LinkedList internally uses a doubly linked list to store the elements.
		 * Manipulation with LinkedList is faster than ArrayList because it uses a
		 * doubly linked list.LinkedList is better for manipulating data.There is no
		 * case of default capacity in a LinkedList.
		 */

		LinkedList<Integer> numberLinkedList = new LinkedList<>();

		numberLinkedList.add(10);
		numberLinkedList.addFirst(20);
		numberLinkedList.addLast(40);
		numberLinkedList.add(0, 50);

		System.out.println(numberLinkedList);

		/*
		 * NOTE :
		 * 
		 * When the rate of addition or removal rate is more than the read scenarios,
		 * then go for the LinkedList. On the other hand, when the frequency of the read
		 * scenarios is more than the addition or removal rate, then ArrayList takes
		 * precedence over LinkedList.
		 */

	}

}
