//Write a program that prints a fibonaci series 

package com.wbl.prac;

import java.util.Scanner;

public class fibbonacci {
	public int number ;
	int a =0 ;
	int f = 0, g = 1;
	public void fibbonacci()
	{
	Scanner in = new Scanner(System.in);
			System.out.println("enter the number");
		a = in.nextInt();	
		
	 for (int i = 0; i < a;i++)
	 {  

         f = f + g;
         g = f - g;
         System.out.println (+f);
        
		
	 }
	 
	}

	
}


