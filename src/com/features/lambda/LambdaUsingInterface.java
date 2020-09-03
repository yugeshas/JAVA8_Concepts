package com.features.lambda;
import com.features.interfaces.Calculator;
import com.features.interfaces.Print;

public class LambdaUsingInterface{
	
	//Define all simple calculations 
	Calculator addition = (a, b) -> a + b; 
	
	Calculator subtraction = (a, b) -> a - b; 
	
	static Calculator multiplication = (a, b) -> a * b; 
	
	Calculator division = (a, b) -> a/b;
	
	//Can use {} - {} are optional 
	static Print printAns = (a) -> { System.out.println(a); }; 
	
	//write functions to access lambda methods. 
	private int calculate(int a, int b, Calculator operation) {
	      return operation.operations(a, b);
    }
	
	private void print(Object a, Print printAns){
		printAns.print(a);
	}
	
	public static void main(String args[]){
		
		// To access methods first create object for current class		
		LambdaUsingInterface lui = new LambdaUsingInterface(); 
		
		
		//initialize data 
		int a = 6, b = 2; 
		
		//Lets perform all operations for a and b. print ans.
		System.out.println("Access lambda functions through class methods ");
		int add = lui.calculate(a, b, lui.addition);		
		int sub = lui.calculate(add,  b,  lui.subtraction);
		lui.print(add, printAns);
		lui.print(sub, printAns);
		
		//using static reference 
		System.out.println("Access lambda functions by declaring it as static variables");
		printAns.print(lui.calculate(add, sub, multiplication)); 
		printAns.print(lui.calculate(add, sub, lui.division)); 
			
		
	
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

