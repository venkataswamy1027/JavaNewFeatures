package com.test;

public class FunctionalInterfaceEx implements Message {
	@Override
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceEx fie = new FunctionalInterfaceEx();
		fie.say("Hello Venkat");
	}

}
