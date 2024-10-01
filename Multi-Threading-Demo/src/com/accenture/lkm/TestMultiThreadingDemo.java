package com.accenture.lkm;
class OneThread extends Thread
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
class TwoThread extends Thread
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
public class TestMultiThreadingDemo 
{

	public static void main(String[] args) 
	{
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		OneThread t1=new OneThread(); //new state
		TwoThread t2=new TwoThread();
		TwoThread t3=new TwoThread();
		
		t1.start();//invoking start method - now it becomes runnable -- will invoke run()
		t2.start();
		//t2.start();//runtime exception --- IllegalThreadStateException
		t3.start();
		System.out.println("End of program");
	}

}
