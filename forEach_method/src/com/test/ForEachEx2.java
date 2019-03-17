package com.test;

import java.util.ArrayList;
import java.util.List;

public class ForEachEx2 {

	public static void main(String[] args) {
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hocky");
		gamesList.add("Vollyball");
		gamesList.forEach(System.out::println);
	}

}
