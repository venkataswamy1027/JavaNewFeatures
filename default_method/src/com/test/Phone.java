package com.test;

public interface Phone {
	void call();

	default void message() {
		System.out.println("message sent");
	}
}
