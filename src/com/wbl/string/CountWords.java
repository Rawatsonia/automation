package com.wbl.string;
import java.io.*;
import java.util.StringTokenizer;

public class CountWords {
	int count = 0;
public void CountOfWord()
{
	
		StringTokenizer st = new StringTokenizer("This program will return the word count");
		while (st.hasMoreTokens()) {
		String s = st.nextToken();
		count++;
		}
		System.out.println("file has  " + count + " words ");
		}
		 
	
	
	public static void main(String[] args) throws Exception {
		CountWords C = new CountWords();
	
		C.CountOfWord();

	}

}
