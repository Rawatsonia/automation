package com.wbl.string;

import java.util.Scanner;
import java.util.Stack;

public class CheckParanthesis 
{
	public String BalancedParenthesis()
	{
		Scanner in = new Scanner(System.in);
		Stack<Character> stk = new Stack<Character>();
		System.out.println("enter the expression");
		String Str = in.next();
		int length = Str.length();
		  if (Str.isEmpty())  
		         return "Balanced"; 
		for (int i = 0; i < length; i++)  
	     {  
			
	         char current = Str.charAt(i);  
	         if (current == '(' )
	         {  
	             stk.push(current);  
	         }  
	         if (current == ')' )
	         {  
	             
				if (stk.isEmpty())  
					return "Not Balanced";           	
	             char last = stk.peek();  
	             if (current == ')' && last == '(' )
	            	 stk.pop();
	             	 //System.out.println("this is a balanced expression");
	             
	            	 
	                 return "Not Balanced";  
	         }  
	     }  
	     return stk.isEmpty()?"Balanced":"Not Balanced";  

	//Read more at http://www.java2blog.com/2016/09/check-for-balanced-parentheses-in-expression-java.html#MbYzzF8IiVzxJHhd.99
	}
	public static void main(String[] args) {
		CheckParanthesis C =  new CheckParanthesis();
		C.BalancedParenthesis();

	}

}
