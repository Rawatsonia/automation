//find pair of elements whose sum is 20 
package WednesdayTest;
import java.util.Scanner;



public class SumofTwoNumbersTwenty {
	
	public void SumTwenty()
	{
		int []arr = new int[30];
		int sum= 20;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number of elements ");
		int num = in.nextInt();
		System.out.println("print the elements");
		for(int i= 0 ; i<num; i++)
		{
			arr[i] = in.nextInt();
			
		}
		for (int i = 0; i < arr.length; i++) 
		{
			int A = arr[i]; 
		for (int j = i + 1; j < arr.length; j++) 
		{ int B = arr[j]; 
		if ((A + B) == sum)
		{ System.out.println("Numbers having sum 20 are " +A +"and" +B); } }
		}

		
		
	}
	public static void main(String[] args) {
		
		SumofTwoNumbersTwenty S = new SumofTwoNumbersTwenty();
		S.SumTwenty();

	}

}
