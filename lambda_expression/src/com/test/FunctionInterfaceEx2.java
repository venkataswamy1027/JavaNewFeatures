package com.test;

import java.util.function.Function;

public class FunctionInterfaceEx2 {
	public static String show(String message) {
		return "Hello " + message;
	}

	public static void main(String[] args) {
		// Function interface referring to a method
		Function<String, String> fun = FunctionInterfaceEx2::show;
		// Calling Function interface method
		System.out.println(fun.apply("Peter"));
		System.out.println(fun.apply("Hari"));
	}
}
