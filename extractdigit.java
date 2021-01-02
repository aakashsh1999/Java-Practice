//Program to extract the digit from a integer
import java.util.*;
class extract
	{
	public static void main(String args[])	
			{
				int n=2345, a, i=1, counter=0;
					while(n>0)
						{
						a=n%10;
						System.out.println("The postion is"+counter+":"+a);
						n=n/10;
						counter++;
						}

			}
	}