package com.accenture.lkm;

public class A
{
public void doSomeThing()
{
	for(int i=1;i<=5;i++)
	{
		System.out.println(i+" Thread Name:  "+Thread.currentThread().getName()+" "+Thread.currentThread().getId());
	}
}
}
