package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSort {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(8);
		al.add(13);
		al.add(16);
		al.add(10);
		System.out.println("before printing elements");
		System.out.println(al);
		List<Integer> data = al.stream().sorted((i1, i2) -> ((i1 < i2) ? 1 : (i1 > i2) ? -1 : 0))
				.collect(Collectors.toList());
		System.out.println("after printing elements");
		System.out.println(data);

	}

}
