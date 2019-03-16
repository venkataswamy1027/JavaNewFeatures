package com.test;

public class HelloFunctionalInterface implements Hello {

	@Override
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		HelloFunctionalInterface fie = new HelloFunctionalInterface();
		fie.say("Hello Siva");
	}
}
