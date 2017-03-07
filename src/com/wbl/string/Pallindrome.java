package com.wbl.string;

import java.util.Scanner;



public class Pallindrome 
{
	String Str , reverse ="";
	public void PallindromeString()
	{
		Scanner in = new Scanner(System.in );
	System.out.println("enter the string ");
	Str = in.nextLine();

		
		int length = Str.length();
		for (int i = length- 1 ; i>=0; i--)
		{
			
			reverse = reverse + Str.charAt(i);
			System.out.print(Str.charAt(i));
			 
		}
		

		if ( Str.equals(reverse))
		{
			System.out.println("this is pallindrome");
		}
		else
	
			System.out.println("this is not a pallindrome");
		
		//return Str.equals(reverse);

	}
	
	
	public static void main(String[] args) 
	{
		Pallindrome P = new Pallindrome();
		P.PallindromeString();

	}

}
