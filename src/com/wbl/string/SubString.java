package com.wbl.string;

public class SubString 
{
	
	String M_String = "Hello World ";
	String SubString = "World";
	public boolean FindSubstring()
	{
		
		if (M_String.contains("World"))
		{
			System.out.println("yes main string contains the substring :"  +SubString );
			return true;
		}
		else 
		{
			System.out.println("main string doesnt contain the substring");
		}
		return false;
	}
		public String Replace()
		{
			 System.out.println(SubString.replace('o', 'p'));
			 System.out.println(SubString.replaceAll("World", "Java"));
			 
			 return M_String;

		}
		
	
	
	public static void main(String[] args) 
	{
		SubString S = new SubString();
		S.FindSubstring();
		S.Replace();
		

	}

}
