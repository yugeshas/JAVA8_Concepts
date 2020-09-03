package com.features.lambda;

import java.util.Comparator;

class Employee{
	
	private String name; 
	private int age;
	
	Employee(String name, int age){
		this.name = name; 
		this.age = age; 
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	} 
	
	
}

public class LambdaWithPreDefinedFunctionalInterface {

	
	public static void main(String args[]){
		
		Comparator<Integer> compInteger = (a, b) -> (a==b) ? 0 : (a>b)? 1: -1; 
		Comparator<String> compString = (a, b) -> a.compareTo(b); 
		
		Comparator<Employee> compEmpByAge = (a, b) -> a.getAge() - b.getAge(); 
		Comparator<Employee> compEmpByName = (a, b) -> a.getName().compareTo(b.getName()); 
		
		int a = 6, b = 4; 
		System.out.println(compInteger.compare(a, b));
		
		String s1 = "Tomorrow", s2 = "Today"; 
		System.out.println(compString.compare(s1, s2));
		
		Employee emp1 = new Employee("John", 21); 
		Employee emp2 = new Employee("Jully", 18); 
		System.out.println(compEmpByAge.compare(emp1, emp2));
		System.out.println(compEmpByName.compare(emp1, emp2));
		
	}
	
}

/******************************OUTPUT******************************
1
9
3
-6
*****************************************************************/