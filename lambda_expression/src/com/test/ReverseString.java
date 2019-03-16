package com.test;

public class ReverseString {

	public static void main(String[] args) {
		StringOperation sop = (str) -> {
			String rev = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				rev = rev + str.charAt(i);
			}
			return rev;
		};
		String result = sop.stringFunction("java");
		System.out.println(result);
	}

}
