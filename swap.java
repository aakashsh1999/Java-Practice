//Program to swap two numbers 

import java.util.*;

class swap
{		
	
	public static void main(String args[])
		{
			int m, n, c;
			Scanner s=new Scanner(System.in);		
			System.out.println("Enter the two numbers");
			m=s.nextInt();
			n=s.nextInt();
			System.out.println("The number before swapping is "+m+","+n);
			
			c=m;
			m=n;
			n=c

			System.out.println("The number after swapping is "+m+","+n);

		}
}
