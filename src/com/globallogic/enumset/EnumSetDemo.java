package com.kirangs.enumset;

import java.util.EnumSet;

public class EnumSetDemo {

	public static void main(String[] args) {

		EnumSet<DaysOfWeek> set1, set2, set3, set4;

		set1 = EnumSet.allOf(DaysOfWeek.class);

		set2 = EnumSet.of(DaysOfWeek.MONDAY, DaysOfWeek.TUESDAY, DaysOfWeek.WEDNESSDAY, DaysOfWeek.THURSDAY,
				DaysOfWeek.FRIDAY);

		set3 = EnumSet.complementOf(set2);

		set4 = EnumSet.range(DaysOfWeek.MONDAY, DaysOfWeek.SUNDAY);

		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		System.out.println(set4);

	}

}
