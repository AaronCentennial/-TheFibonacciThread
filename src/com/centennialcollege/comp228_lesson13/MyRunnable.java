package com.centennialcollege.comp228_lesson13;

public class MyRunnable implements Runnable {
	// PRIVATE INSTANCE VARIABLE
	private int _numOfFibs;

	public MyRunnable(int numOfFibs) {
		this._numOfFibs = numOfFibs;
	}

	@Override
	public void run() {
//		Task1();
		for (int i = 0; i < this._numOfFibs; i++) {
			System.out.println(fib(i));
		}
	}

	public static int fib(int n){
		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		else {
			return fib(n - 1) + fib(n - 2);
		}
	}


	private synchronized void Task1() {
		// TASK
/*		for (int index = 0; index < 10; index++) {
			System.out.println("Runnable " + this._name + " Count: " + index);
			try {
				Thread.sleep(1000); // wait for 1000 ms = 1 sec
			} catch (InterruptedException exception) {
				System.err.println("Runnable Interrupted: " + exception);
			}
		}*/
	}

}
