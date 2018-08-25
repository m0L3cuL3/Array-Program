
//Array shit...

import java.util.Scanner;

class ArrayProgram
{
	public static void main(String args[])
	{
		Scanner userinput = new Scanner(System.in);
		int[] x = new int[10];
		int ctr;
		int oddctr = 0;
		int evenctr = 0;
		int[] odd = new int[10];
		int[] even = new int[10];
		
		for(ctr = 0; ctr < 10; ctr++)
		{
			x[ctr] = userinput.nextInt();
		}
		
		for(ctr = 0; ctr < 10; ctr++)
		{
			//System.out.println("x[" + ctr + "] =>" + x[ctr]);
			
			//identfy shit...
			if(x[ctr] % 2 == 0)
			{
				even[evenctr] = x[ctr];
				evenctr++;
				//even[ctr] = x[ctr];
				//System.out.println(even[ctr]);
			}
			else
			{				
				odd[oddctr] = x[ctr];
				oddctr++;
				//odd[ctr] = x[ctr];
				//System.out.println(odd[ctr]);
			}
			
		}
		
		System.out.println("There are " + evenctr + " even numbers.");
		for(ctr = 0; ctr < evenctr; ctr++)
		{
			System.out.print(even[ctr] + " ");
		}
		System.out.println("");
		System.out.println("\nThere are " + oddctr + " odd numbers.");
		
		for(ctr = 0; ctr < oddctr; ctr++)
		{
			System.out.print(odd[ctr] + " ");
		}
		System.out.println("");
	}
}