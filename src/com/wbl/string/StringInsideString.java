package com.wbl.string;

public class StringInsideString {
	int numRead = 0;

    String testString = "string";
	public void FindString()
	{
		
		String str = ("find a string inside the string  ");
		 System.out.print(str.contains("string"));
		System.out.println();
		 System.out.println(str.length());
		 String [] strArry = str.split(testString);
		if (strArry.length > 1) {
             numRead = numRead + strArry.length-1 ;
        }
        else {
             if (str == testString)
             {
                 numRead++;
             }
        }
		 System.out.println(numRead);
	}

	

	public static void main(String[] args) {
		StringInsideString S = new StringInsideString();
		S.FindString();

	}

}
