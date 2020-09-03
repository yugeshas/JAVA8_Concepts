package com.features.lambda;
import java.util.ArrayList; 
import java.util.List; 
import com.features.interfaces.Print;

public class IteratingElementsUsingLambda {

	public static void main(String[] args) {
		
		Print print = (a) -> {System.out.println(a);}; 
		
		List<String> words = new ArrayList<>(); 
		
		words.add("Today"); 
		words.add("is"); 
		words.add("good"); 
		words.add("weather"); 
		words.add("day"); 
		
		words.forEach((word) -> print.print(word));
		
		print.print("\nUsing method references");
		words.forEach(System.out::println);

	}

}

/******************************OUTPUT******************************
Today
is
good
weather
day

Using method references
Today
is
good
weather
day
*****************************************************************/