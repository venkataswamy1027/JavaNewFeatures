package com.test;

public class InstanceMethodReference1 {
	public void saySomething() {
		System.out.println("Hello, this is non-static method.");
	}

	public static void main(String[] args) {
		Greeting ge = new InstanceMethodReference1()::saySomething;
		ge.msg();
	}
}
