package com.test;

public class Functional_InterfaceDemo implements B {

	@Override
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		Functional_InterfaceDemo fie = new Functional_InterfaceDemo();
		fie.say("Hello Venkat");
		fie.doIt();
	}
}
