package com.wbl.prac;

import java.util.Scanner;

public class prime {
	
	public void PrimeNumber()
	{
		int P = 0;
		Scanner in = new Scanner(System.in );
		System.out.println("enter the number ");
		int n = in.nextInt();
		
		    for(int i=1;i<=n;i++) 
		    {
		        if(n%i==0)
		            P++;
		    }
		    if (P==2 )
		    {
		    	System.out.println("this is a prime number");
		    	
		    }
		    else 
		    {
		    	System.out.println("This is not a prime number ");
		    }
		
		}
	
}
