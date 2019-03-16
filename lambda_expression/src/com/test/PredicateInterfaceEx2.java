package com.test;

import java.util.function.Predicate;

public class PredicateInterfaceEx2 {
	public static Boolean checkAge(int age) {
		if (age > 17)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// Using Predicate interface
		Predicate<Integer> predicate = PredicateInterfaceEx2::checkAge;
		// Calling Predicate method
		boolean result = predicate.test(25);
		System.out.println(result);
	}
}
