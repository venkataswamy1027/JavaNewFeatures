package com.test;

public class LambdaExpressionEx5 {
	public static void main(String[] args) {
		Sub s = (n1, n2) -> (n1 - n2);
		System.out.println(s.minus(10, 5));
	}
}
