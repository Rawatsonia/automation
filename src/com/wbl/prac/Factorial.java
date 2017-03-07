package com.wbl.prac;

import java.util.Scanner;

public class Factorial {
	public int n;
	public int F;
	  public int fact(int n)
	   {
			Scanner in = new Scanner(System.in);
			System.out.println("enter the number");
			 n = in.nextInt();
	       int output;
	       if(n==1){
	         return 1;
	       }
	       
	       output = fact(n-1)* n;
	       return output;
	   }
	

	public void NonRecursion()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		 n = in.nextInt();
		
		int F = 1;
		
		
			for( int i  = 1 ; i  <= n ; i++ )
		
            F = F*i;
            System.out.println("factorial is "+F);
		
		
		}
		
			
	}



