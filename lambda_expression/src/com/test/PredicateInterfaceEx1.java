package com.test;

import java.util.function.Predicate;

public class PredicateInterfaceEx1 {
	public static void main(String[] args) {
		Predicate<Integer> pr = i -> i % 2 == 0;
		System.out.println(pr.test(11));
	}
}
