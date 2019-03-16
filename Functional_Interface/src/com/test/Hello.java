package com.test;

@FunctionalInterface
public interface Hello {
	// abstract method
	void say(String msg);

	// it can contain any number of Object class methods.
	int hashCode();

	String toString();

	boolean equals(Object obj);
}
