package com.test;

public class GenericInterfaceDemo {

	public static void main(String[] args) {
		// calculate factorial
		GenericInterface<Integer> ge1 = (n) -> {
			int result = 1;
			while (n > 0) {
				result = result * n;
				n = n - 1;
			}
			return result;
		};
		int fact = ge1.compute(5);
		System.out.println(fact);

		//find reverse of given string
		GenericInterface<String> ge2 = (str) -> {
			String rev = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				rev = rev + str.charAt(i);
			}
			return rev;
		};
		String revString = ge2.compute("java");
		System.out.println(revString);
	}
}
