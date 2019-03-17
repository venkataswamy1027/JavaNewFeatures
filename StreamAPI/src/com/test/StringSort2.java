package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringSort2 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Raju");
		names.add("Siva");
		names.add("Anu");
		names.add("Chandu");
		names.add("Gopi");
		System.out.println("before sort printing elements");
		System.out.println(names);
		List<String> namesSort = names.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println("after sort printing elements");
		System.out.println(namesSort);
	}

}
