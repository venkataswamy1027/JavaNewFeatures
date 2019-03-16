package com.test;

public class AnonymousClassDemo {
	Greeting g = new Greeting() {
		public String msg() {
			return "welcome to java";
		}
	};

	public static void main(String[] args) {
		AnonymousClassDemo acd = new AnonymousClassDemo();
		String strMsg = acd.g.msg();
		System.out.println(strMsg);
	}

}
