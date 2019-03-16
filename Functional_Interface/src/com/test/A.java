package com.test;

public interface A {
	default void doIt() {
		System.out.println("Do it now");
	}
}
