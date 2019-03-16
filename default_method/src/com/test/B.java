package com.test;

public interface B {
	default void m1() {
		System.out.println(" m1 method of B");
	}
}
