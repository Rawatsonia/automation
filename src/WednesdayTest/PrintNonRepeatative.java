package WednesdayTest;

import java.util.Scanner;

public class PrintNonRepeatative 
{
	public void NonRepeatative()
	{
		int flag = 0;
		int count = 0;
		int []arr = new int[30];
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number of elements ");
		int num = in.nextInt();
		System.out.println("print the elements");
		for(int i= 0 ; i<num; i++)
		{
			arr[i] = in.nextInt();
			
		}
        for(int i = 0; i < num; i++)

        {

            for(int j = 0; j < num; j++)

            {

                if(i != j)

                {

                    if(arr[i] != arr[j])

                    {

                        flag = 1;

                    }

                    else

                    {

                        flag = 0;

                        break;

                    }

                }

            }

            if(flag == 1)

            {

                count++;

                System.out.print(arr[i]+" ");

            }

        }

       //System.out.println("");

        //System.out.println("Number of non repeated elements are:"+count);

    }


	
	public static void main(String[] args) {
		PrintNonRepeatative R = new PrintNonRepeatative ();
		R.NonRepeatative();

	}

}
