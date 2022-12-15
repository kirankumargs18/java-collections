package com.globallogic.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListDemo {

	private static void arrayListDemo() {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter array size : ");
		int size = input.nextInt();
		int[] numberArray = new int[size];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < size; i++) {
			numberArray[i] = input.nextInt();
		}

		ArrayList<Integer> arrayList = new ArrayList<>();
		


		for (Integer i : numberArray) {
			if (!arrayList.contains(i)) {
				arrayList.add(i);
			} else {
				continue;
			}
		}

		System.out.print("Array without duplicate elements : " + arrayList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListDemo.arrayListDemo();

	}
}