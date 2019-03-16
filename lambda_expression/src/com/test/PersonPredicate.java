package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PersonPredicate {

	public static void main(String[] args) {
		List<Person> al = new ArrayList<Person>();
		al.add(new Person("Banu", 25));
		al.add(new Person("Siva", 15));
		al.add(new Person("Raju", 35));
		al.add(new Person("Ravi", 17));
		al.add(new Person("Anu", 25));
		al.add(new Person("Gopi", 12));
		Predicate<Person> pr = s -> s.age > 17;
		for (Person st : al) {
			if (pr.test(st)) {
				System.out.println(st.name + " " + st.age);
			}
		}
	}

}
