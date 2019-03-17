package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterEx2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("anu", "siva", "basu");
		List<String> result = list.stream().filter(name -> !"siva".equals(name)).collect(Collectors.toList());
		result.forEach(System.out::println);
	}
}
