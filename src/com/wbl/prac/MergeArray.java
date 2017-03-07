package com.wbl.prac;

import java.util.Scanner;

public class MergeArray 
{ 		int num1,num2,k;
		int[] arr1 = new int[30];
		int[] arr2 = new int[30];
		int merge[] = new int[100];
		public void merge()
		{
			Scanner in = new Scanner(System.in);
			System.out.println("enter the number of number");
			num1 = in.nextInt();
			System.out.println(" enter the elements for first Array");
			for(int i=0;i<num1;i++)
			{
				arr1[i] = in.nextInt();
				
			}	
			
			System.out.println("enter the number of elements");
			System.out.println("enter the elements for second  Array");
			num2 = in.nextInt();
			for( int i=0;i<num2;i++)
			{
				arr2[i]	= in.nextInt();
			}	
			System.out.print("Merging the Arrays...\n");
		       for(int i=0; i<num1; i++)
		       {
		           merge[i] = arr1[i];
		       }
			   
		       int num = num1 + num2;
			   
		       for(int i=0, k=num1; k<num && i<num2; i++, k++)
		       {
		           merge[k] = arr2[i];
		       }
			   
		       System.out.print("Now the New Array after Merging is :\n");
		       for(int i=0; i<num; i++)
		       {
		           System.out.print(merge[i] + "  ");
		       }
		   }
		
}
