package com.test;

import java.util.function.Function;
import java.util.ArrayList;
import java.util.List;

public class EmpFunction {

	public static void main(String[] args) {
		Function<Student, String> fun = s -> {
			String grade = "";
			if (s.marks >= 80)
				grade = "Distinction";
			else if (s.marks >= 60)
				grade = "First Class";
			else if (s.marks >= 50)
				grade = "Second Class";
			else if (s.marks >= 35)
				grade = "Third Class";
			else
				grade = "Fail";

			return grade;
		};

		List<Student> al = new ArrayList<Student>();
		al.add(new Student("Siva", 75));
		al.add(new Student("Anudeep", 90));
		al.add(new Student("Ramesh", 55));
		al.add(new Student("Venu", 30));
		al.add(new Student("Basu", 69));
		al.add(new Student("Deepak", 45));
		al.add(new Student("Ravi", 35));
		for (Student st : al) {
			System.out.println(st.name + " " + st.marks + " " + fun.apply(st));
		}
	}

}
