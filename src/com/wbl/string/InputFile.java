package com.wbl.string;
import java.io.*;
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
	
	}
	

	public static void main(String[] args) throws Exception {
		InputFile I = new InputFile();
		I.ScannerInput();
		I.BufferedReader();

	}

}
