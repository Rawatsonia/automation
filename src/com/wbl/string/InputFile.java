package com.wbl.string;
import java.io.*;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class InputFile {
	//Scanner
	public void ScannerInput()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the two numbers for addittion");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = (a+b);
		System.out.println("sum of two numbers is " +c);
		
	}
	
	public void BufferedReader() throws Exception
	{
		FileReader fr=new FileReader("C:/Users/sonia/Desktop/Training/Java/Training/buffered.txt");    
        BufferedReader br=new BufferedReader(fr);    
        
        int i;    
        while((i=br.read())!=-1){  
        System.out.print((char)i);  
        }  
        br.close();     
        fr.close();    
        System.out.println();
	}

	public void DataInputStream()
	{ 
		System.out.println("example for DataInputStream");
		DataInputStream in = new DataInputStream(System.in);
		int a=0;
		int b=0;
		try

		{
		System.out.print("enter the value of integer  number a=");

		a=Integer.parseInt(in.readLine());
		System.out.print("enter the value of integer  number b=");
		b=Integer.parseInt(in.readLine());


		}
		catch (Exception e) { }
		int MUL;
		MUL=a*b;
		System.out.println("multiplication  of a and b variable is="+MUL);
		}
		
	
	

	public static void main(String[] args) throws Exception {
		InputFile I = new InputFile();
		I.ScannerInput();
		I.BufferedReader();
		I.DataInputStream();

	}
}


