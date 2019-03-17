package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(15);
		al.add(8);
		al.add(13);
		al.add(5);
		al.add(10);
		System.out.println("before sort printing elements");
		System.out.println(al);
		List<Integer> sortedList = al.stream().sorted().collect(Collectors.toList());
		System.out.println("after sort printing elements");
		System.out.println(sortedList);
	}
}
