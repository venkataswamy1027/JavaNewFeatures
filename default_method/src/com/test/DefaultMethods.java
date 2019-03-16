package com.test;

public class DefaultMethods implements Message {
	// implementing abstract method
	@Override
	public void sayMore(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		DefaultMethods dm = new DefaultMethods();
		dm.say(); // calling default method
		dm.sayMore("Work is worship"); // calling abstract method

	}
}
