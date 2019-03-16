package com.test;

public class GenericIntrfDemo {

	public static void main(String[] args) {
		GenericIntrf<Integer> gi1 = (x) -> System.out.println(x);
		gi1.m1(new Integer(10));

		GenericIntrf<String> gi2 = (str) -> System.out.println(str);
		gi2.m1(new String("hello world"));
	}

}
