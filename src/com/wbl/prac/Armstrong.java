package com.wbl.prac;

import java.util.Scanner;

public class Armstrong {
	public void ArmstrongNum()
	{
		//int n = 0;
		double sum =0;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the enter");
		int num= in.nextInt();
		 int noOfDigits = String.valueOf(num).length();	
		 System.out.println(+noOfDigits);
		 int Temp = num;
		  while (Temp> 0) {
		        int remainder = Temp%10;
		        
		         sum = sum+Math.pow(remainder, noOfDigits);
		        //System.out.println("sum"+sum);
	            Temp = Temp/10; 
	            //System.out.println("number is "+num);
		  }
		  	if(num == sum)
		  	{
		  		System.out.println("this is an Armstrong number ");
		  	}
		  		else 
		  			System.out.println("This is not an Armstrong number");
		}
}
