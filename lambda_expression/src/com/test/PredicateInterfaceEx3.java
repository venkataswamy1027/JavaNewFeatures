package com.test;

import java.util.function.Predicate;

public class PredicateInterfaceEx3 {

	public static void main(String[] args) {
		String names[] = { "anu", "Venkatesh", "Bhaskar", "raju", "Shankar" };
		Predicate<String> pr = s -> s.length() > 4;
		for (String str : names) {
			if (pr.test(str)) {
				System.out.println(str);
			}
		}
	}
}
