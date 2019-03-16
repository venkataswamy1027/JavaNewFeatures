package com.test;

public class LambdaExpressionEx2 {
	public static void main(String[] args) {
		Greeting g = () -> {
			return "Hello Venkat";
		};
		String msg = g.msg();
		System.out.println(msg);
	}
}
