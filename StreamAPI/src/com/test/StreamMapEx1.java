package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapEx1 {
	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(5);
		marks.add(8);
		marks.add(13);
		marks.add(16);
		marks.add(10);
		System.out.println("before printing elements");
		System.out.println(marks);
		List<Integer> updatedmarks = marks.stream().map(i -> i + 2).collect(Collectors.toList());
		System.out.println("after printing elements");
		System.out.println(updatedmarks);
	}
}
