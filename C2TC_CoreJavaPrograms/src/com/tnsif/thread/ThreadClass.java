package com.tnsif.thread;

public class ThreadClass implements Runnable {
	
	public int low;
	public int high;
	public String msg;
	
	public ThreadClass(int low, int high, String msg) {
		super();
		this.low = low;
		this.high = high;
		this.msg = msg;
		Thread thread = new Thread(this, "Child Thread!");
		thread.start();
	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = low; i <= high; i++ ) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(msg + i);
		}
		
	}

}
