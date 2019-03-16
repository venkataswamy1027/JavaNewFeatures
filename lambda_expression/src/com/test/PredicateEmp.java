package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEmp {
	public static void main(String[] args) {
		List<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Siva", 2000));
		al.add(new Employee("Anudeep", 4000));
		al.add(new Employee("Ramesh", 2500));
		al.add(new Employee("Venu", 2000));
		al.add(new Employee("Basu", 5500));
		al.add(new Employee("Deepak", 1000));
		al.add(new Employee("Ravi", 1500));
		Predicate<Employee> pr = e -> e.getSalary() > 2000;
		for (Employee emp : al) {
			if (pr.test(emp)) {
				System.out.println(emp.name + " " + emp.salary);
			}

		}
	}
}
