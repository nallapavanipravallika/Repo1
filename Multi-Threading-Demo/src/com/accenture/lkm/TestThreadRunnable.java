package com.accenture.lkm;
class ThreadOne implements Runnable 
{

	@Override
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+" Thread Name: "+Thread.currentThread().getName());
		}
	}
	
}
class ThreadTwo implements Runnable
{

	@Override
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+" Thread Name: "+Thread.currentThread().getName());
		}
	}
	
}
public class TestThreadRunnable {

	public static void main(String[] args) 
	{
		Thread t1=new Thread(new ThreadOne(),"Thread One");
		Thread t2=new Thread(new ThreadTwo(),"Thread Two");
		Thread t3=new Thread(new ThreadTwo(),"Thread Three");
		
		t1.start();
		t2.start();
		t3.start();
	
	}

}
