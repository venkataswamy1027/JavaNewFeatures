package com.test;

public class LambdaHelloWorld {
	public static void main(String[] args) {
		HelloWorld helloWorld = (String name) -> {
			return "Hello " + name;
		};
		System.out.println(helloWorld.hello("Siva"));
	}
}
