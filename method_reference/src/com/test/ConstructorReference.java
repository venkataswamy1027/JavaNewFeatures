package com.test;

public class ConstructorReference {

	public static void main(String[] args) {
		Welcome w = Hello::new;
		w.display("welcome to java");
	}
}
