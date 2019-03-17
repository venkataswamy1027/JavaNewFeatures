package com.test;

public class StaticMethodReference {
	public static void say() {
		System.out.println("Hello, this is static method.");
	}

	public static void main(String[] args) {
		// Referring static method
		Message msg = StaticMethodReference::say;
		// Calling interface method
		msg.say();
	}
}
