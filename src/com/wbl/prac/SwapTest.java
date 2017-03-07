package com.wbl.prac;

import java.util.Scanner;

public class SwapTest {

	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		System.out.println("enter the two numbers");
		int a = in.nextInt();
		int b = in .nextInt();*/
		System.out.println("Value of a and b before swap :");
		System.out.println(" a= 3");
		System.out.println(" b= 5");
		Swap SW = new Swap();
		SW.WithoutTemp();
		SW.WithTemp();

	}

}
