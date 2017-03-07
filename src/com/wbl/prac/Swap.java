// Write a program that swaps 2 given numbers.

package com.wbl.prac;

public class Swap {
	public int a ;
	public int b ;
	
	public void WithoutTemp()
	{
	 	a = a+ b; 
		b = a- b;
		a = a-b;
		System.out.println("Value of a and b after swaping is"+a +" " +b);
	}
	
	public void WithTemp()
	{
		int temp = a ;
		a = b; 
		b= temp ; 
		System.out.println(" after swap " +a +" " +b);
		
	}

}
