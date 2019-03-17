package com.test;

public class DemoTest {
	public static void display() {
		System.out.println("Hi, i am static method of a class DemoTest");
	}

	public static void main(String args[]) {
		Demo d = DemoTest::display;
		d.show();
	}
}
