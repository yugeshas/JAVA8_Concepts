package com.features.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWithLambda {

	public static void main(String[] args) {
		Comparator<String> compString = (a, b) -> a.compareTo(b); 
		
		List<String> words = new ArrayList<>(); 
		words.add("Today"); 
		words.add("is"); 
		words.add("good"); 
		words.add("weather"); 
		words.add("day"); 
		
		Collections.sort(words, compString);
		
		words.forEach((word) -> System.out.println(word));

	}

}

/******************************OUTPUT******************************
Today
day
good
is
weather
*****************************************************************/