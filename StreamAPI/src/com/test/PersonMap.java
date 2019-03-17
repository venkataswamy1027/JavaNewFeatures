package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonMap {
	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("raju", 30), new Person("jack", 20), new Person("deva", 40));
		List<String> collect = persons.stream().map(Person::getName).collect(Collectors.toList());

		collect.forEach(System.out::println);
	}

}
