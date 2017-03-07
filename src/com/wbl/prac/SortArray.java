//sort the array
package com.wbl.prac;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	int i,n,j;
	int[] arr= new int[10];
	public void Sort()
	{  
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number of elements");
		int num = in.nextInt();
		System.out.println("enter the elements");
		for(i= 1;i<= num;i++)
		{
			
			arr[i] = in.nextInt();
			
		}
		/*Arrays.sort(arr);
		
		System.out.println("sorted list is"+arr[i]);*/
		
		for(i=0;i<num;i++)
		{
			for(j=i+1;j<num;j++)
			{ 
				if (arr[i]>arr[j])
				{
                    int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
				
			}
		}
	
	        System.out.print("Ascending Order:");

	        for (int i =1	; i < num; i++) 

	        {

	            System.out.print(arr[i] + ",");

	        }

	       
		}
	

}
