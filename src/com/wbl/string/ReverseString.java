package com.wbl.string;

import java.util.Scanner;

public class ReverseString 
{
	public void Reverse()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the string");
		 String str = in.nextLine();
		 int Length= str.length();
		 System.out.println("length of string "+Length);
		 for(int i=Length-1; i>=0;i--)
		 {
			System.out.print(str.charAt(i)); 
		 }
	}
}
