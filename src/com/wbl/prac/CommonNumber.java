//Write a program to find the common number in any given two arrays.

package com.wbl.prac;

public class CommonNumber 
{
	public void CommonElement()
	{
		  int[]numbers = {12,43,53,54,32,65,23};
		  int[]number2 ={32,13,33,34,413,23};

		  for (int i=0;i<=numbers.length; i++)
		  {
			  for(int j=0;j<=number2.length;i++)
			  {
				  if (numbers[i]== number2[i] )
				  {
					  System.out.println(+numbers[i]);
				  }
			  }
		  }
	}
}

