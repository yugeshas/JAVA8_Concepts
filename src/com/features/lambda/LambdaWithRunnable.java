package com.features.lambda;

public class LambdaWithRunnable {

	public static void main(String[] args) {
	
		Runnable print = () -> System.out.println(Thread.currentThread().getName()+" is running!"); 
		
		print.run(); 
		
		Thread th = new Thread(print); 
		th.setName("New");
		th.start();
	
	}
	
/******************************OUTPUT******************************
main is running!
New is running!
*****************************************************************/

}
