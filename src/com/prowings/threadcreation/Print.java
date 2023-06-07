package com.prowings.threadcreation;

public class Print {

	public void printMsg(String msg) {
		
		System.out.println("before aaaaaaaaa" + Thread.currentThread().getName() );
		System.out.println("before aaaaaaaaa" + Thread.currentThread().getName() );
		System.out.println("before aaaaaaaaa" + Thread.currentThread().getName() );
		System.out.println("before aaaaaaaaa" + Thread.currentThread().getName() );
		System.out.println("before aaaaaaaaa" + Thread.currentThread().getName() );
		
		synchronized (this) {
			
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + "  :  " + msg);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			
		}
		
		
		System.out.println("after aaaaaaaaa" + Thread.currentThread().getName() );
		System.out.println("after aaaaaaaaa" + Thread.currentThread().getName() );
		System.out.println("after aaaaaaaaa" + Thread.currentThread().getName() );
		System.out.println("after aaaaaaaaa" + Thread.currentThread().getName() );
		System.out.println("after aaaaaaaaa" + Thread.currentThread().getName() );


	}

}
