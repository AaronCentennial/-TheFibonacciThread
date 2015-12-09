package com.centennialcollege.comp228_lesson13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// DRIVER CLASS
public class Program {

	public static void main(String[] args) {
		String input =InputHelper.getStringInput("Please enter the number of fibonaccis you want?: ");
		int v =Integer.parseInt(input);

		MyRunnable myRunnable1 = new MyRunnable(v);
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		executor.execute(myRunnable1);

		for (int i = 0; i < 10; i++) {
			System.err.println("["+i+"] I'm in the Main");
		}

		
		executor.shutdown();

	}

}
