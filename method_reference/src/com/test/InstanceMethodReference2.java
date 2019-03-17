package com.test;

public class InstanceMethodReference2 {
	public void saySomething() {
		System.out.println("Hello, this is non-static method.");
	}

	public static void main(String[] args) {
		InstanceMethodReference2 i = new InstanceMethodReference2();
		Greeting ge = i::saySomething;
		ge.msg();
	}
}
