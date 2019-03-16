package com.test;

public class LambdaExpressionEx1 {
	public static void main(String[] args) {
		Message m = () -> System.out.println("Hi Venkat");
		m.say();
	}
}
