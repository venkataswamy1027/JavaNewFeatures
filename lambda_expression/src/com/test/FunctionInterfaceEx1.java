package com.test;

import java.util.function.Function;

public class FunctionInterfaceEx1 {
	public static void main(String[] args) {
		Function<Integer, Integer> fun = i -> i * i;
		System.out.println(fun.apply(4));
		System.out.println(fun.apply(3));
		System.out.println(fun.apply(5));
	}
}
