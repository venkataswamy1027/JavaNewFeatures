package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringComparator {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Raju");
		names.add("Siva");
		names.add("Anu");
		names.add("Chandu");
		names.add("Gopi");
		System.out.println("before sort printing elements");
		System.out.println(names);
		Comparator<String> c = (s1, s2) -> {
			System.out.println(s1 + " -> " + s2);
			if (s1.length() > s2.length())
				return 1;
			else if (s1.length() < s2.length())
				return -1;
			else
				return 0;
		};
		List<String> namesSort = names.stream().sorted(c).collect(Collectors.toList());
		System.out.println("after sort printing elements");
		System.out.println(namesSort);
	}
}
