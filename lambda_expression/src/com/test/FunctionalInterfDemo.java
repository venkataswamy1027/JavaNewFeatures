package com.test;

public class FunctionalInterfDemo {

	public static void main(String[] args) {
		FunctionalInterf fi = n -> n * n;
		System.out.println(fi.findSquare(4));
	}

}
