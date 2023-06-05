package com.prowings.threadcreation;

class Thread1 extends Thread
{
	public void m1()
	{

		for(int i=0; i<10; i++)
		{
			System.out.println(i);
		}

	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		m1();
	}
}
class Thread2 extends Thread
{
	public void m2()
	{
		for(int i=10; i<20; i++)
		{
			System.out.println(i);
		}
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		m2();
	}
}

public class TestMultipleThreadsMultipleTask {
	
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.setName("T1");
		t2.setName("T2");
		
		t2.start();
		t1.start();
		
	}

}
