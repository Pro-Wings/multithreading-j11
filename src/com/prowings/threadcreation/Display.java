package com.prowings.threadcreation;

public class Display {
	
	 public static synchronized void print(String message)
	{
		 
		 System.out.println(Thread.currentThread().getName()+"   before....");
		 System.out.println(Thread.currentThread().getName()+"   before....");
		 System.out.println(Thread.currentThread().getName()+"   before....");
		 System.out.println(Thread.currentThread().getName()+"   before....");
		 System.out.println(Thread.currentThread().getName()+"   before....");
		 System.out.println(Thread.currentThread().getName()+"   before....");
		 System.out.println(Thread.currentThread().getName()+"   before....");
		
//		synchronized (this) {
			System.out.print("["+message);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("]");
//		}
		 System.out.println(Thread.currentThread().getName()+"   after....");
		 System.out.println(Thread.currentThread().getName()+"   after....");
		 System.out.println(Thread.currentThread().getName()+"   after....");
		 System.out.println(Thread.currentThread().getName()+"   after....");
		 System.out.println(Thread.currentThread().getName()+"   after....");
		 System.out.println(Thread.currentThread().getName()+"   after....");
		 System.out.println(Thread.currentThread().getName()+"   after....");
		
	}

}
