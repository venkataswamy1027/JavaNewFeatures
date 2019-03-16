package com.test;

public class LambdaExpressionEx4 {
	public static void main(String[] args) {
		Calculate c = (n1, n2) -> {
			return n1 + n2;
		};
		int result = c.add(10, 20);
		System.out.println("addition :" + result);
	}
}
