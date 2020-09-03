package com.features.lambda;
import com.features.interfaces.StringOperations;
import com.features.interfaces.Print;

public class LambdaUsingInterfaceForStrings{
	
	static Print print = (a) -> { System.out.println(a);}; 
	
	//return is optional 
	StringOperations concat = (a, b) -> { print.print(a+" "+b); };
	
	StringOperations compare = (a, b) -> { print.print("Given strings are " + (a.equals(b) ?  "same!" :  "different!")); };
	
	StringOperations subString = (a, b) -> print.print("String " +a+" is "+(b.contains(a) ? "a" : "not a")+ " substring of string "+b); 
	
	private static void operate(String a, String  b, StringOperations stringOperations){
		stringOperations.operations(a, b);
	}
	
	public static void main(String args[]){
		
		LambdaUsingInterfaceForStrings obj = new LambdaUsingInterfaceForStrings(); 
		
		String a = "Hello", b = "World!"; 
		operate(a, b, obj.concat); 
		operate(a, b, obj.compare);
		
		a = "ab"; b = "abcde"; 
		operate(a, b, obj.subString); 
		
			
	}

}

/******************************OUTPUT******************************
Access lambda functions through class methods 
8
6
Access lambda functions by declaring it as static variables
48
1		
*****************************************************************/