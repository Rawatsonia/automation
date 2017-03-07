//Write a program print "ping" if a number is divisible by 3,
//"pong" if a number is divisible by 5, 
//and "ping pong" if number is divisible by both, 
//else print the number.
package com.wbl.prac;

import java.util.Scanner;

public class PingPong 
{
	public int num;
	
	public void Ping()
	
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		 num = in.nextInt();
		if ( num%3== 0)
		{
			System.out.println("Ping");
		}
			else if (num%5==0)
			{
				System.out.println("Pong");
			}
			 else
			 {
				 System.out.println("PingPong");
			 }
		}
			
		
	}


