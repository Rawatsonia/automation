package com.wbl.prac;

import java.util.Scanner;

public class LinearSearch {

	public void Search()
	{   int i, c=0, pos=0;
		int arr[] = new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number of numbers");
		int num = in.nextInt();
		
		System.out.println("enter  elements"  );
		for( i=0 ; i<num;i++)
		{
			
			arr[i]= in.nextInt();
		}
		System.out.println("enter the number to be searched");
		int n = in.nextInt();
		for( i=1 ; i<=num;i++)
		{
			if (n==arr[i])		
			{ 
				c=1;
				pos = i+1;
				 
			}
		}
			
			 if(c == 0)
		       {
		           System.out.print("Number Not Found in the list ");
		       }
		       else
		       {
		           System.out.print(n+ " found at position " + pos);
		       }
		
	}

}	
