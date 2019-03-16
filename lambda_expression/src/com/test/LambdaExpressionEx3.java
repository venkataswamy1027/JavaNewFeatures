package com.test;

public class LambdaExpressionEx3 {
	public static void main(String[] args) {
		Hello h = (String s) -> System.out.println(s);
		h.msg("How are you.");
	}
}
