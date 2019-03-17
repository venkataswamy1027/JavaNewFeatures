package com.test;

import java.util.ArrayList;
import java.util.List;

public class StreamCount {
	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(75);
		marks.add(48);
		marks.add(30);
		marks.add(55);
		marks.add(34);
		System.out.println("all marks");
		System.out.println(marks);
		long failedStudents = marks.stream().filter(i -> i < 35).count();
		System.out.println("no.of failed students");
		System.out.println(failedStudents);
	}
}
