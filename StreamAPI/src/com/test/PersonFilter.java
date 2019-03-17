package com.test;

import java.util.Arrays;
import java.util.List;

public class PersonFilter {
	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("raju", 30), new Person("jack", 20), new Person("deva", 40));
		Person result = persons.stream().filter(x -> "jack".equals(x.name)).findAny().orElse(null);
		System.out.println(result);
	}
}
