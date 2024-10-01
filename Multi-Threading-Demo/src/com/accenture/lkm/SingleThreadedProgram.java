package com.accenture.lkm;

import java.util.Scanner;

public class SingleThreadedProgram {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x=0;
		System.out.println("inside main");
		for(int i=1;i<=5;i++)
		{
			System.out.println("enter some value");
			x=sc.nextInt();
			System.out.println(i+" Thread Name:  "+Thread.currentThread().getName()+" "+Thread.currentThread().getId());
		}
		System.out.println();
		A ob=new A();
		ob.doSomeThing();
		System.out.println("end of program ");
	}

}
