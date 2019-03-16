package com.test;

public class MultipleInterfaceTest implements A, B {
	public void m1() {
		A.super.m1();
		B.super.m1();
		System.out.println(" m1 method of MultipleInterfaceTest");
	}

	public static void main(String[] args) {
		MultipleInterfaceTest mt = new MultipleInterfaceTest();
		mt.m1();
	}
}
