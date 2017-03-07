package com.wbl.prac;

public class LargestArray {
	public void Largest()
	{
		//int[] Arr = new int[10];
		//int[] Arr = new int[10];
		 int numbers[] = new int[]{34,354,347,554,332,625,653,98,433,223};
        
        //assign first element of an array to largest and smallest
        
        int largest = numbers[0];
       
        for(int i=1; i< numbers.length; i++)
        {
                if(numbers[i] > largest)
                        largest = numbers[i];
               
        }
       
        System.out.println("Largest Number is : " + largest);
        
	}

}

