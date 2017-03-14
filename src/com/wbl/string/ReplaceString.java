package com.wbl.string;

public class ReplaceString {

	public void Replace()
	{

		 
		      String Str = new String("Practice java programs,String programs");

		      System.out.print("Return Value :" );
		      System.out.println(Str.replaceAll("programs", "programming "));
		   }
		
	
	public static void main(String[] args) {
		
		ReplaceString R = new ReplaceString();
		R.Replace();
	}

}
