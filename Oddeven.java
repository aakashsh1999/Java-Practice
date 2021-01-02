//Program to check if the number is Odd or even

import java.util.Scanner;

class OddEven
{
	public static void main(String args[])
			{
				int j;
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the Integer");
				j=s.nextInt();
				if(j%2==0)
					{
						System.out.println("The number is Even");
					}
				else
					{
					System.out.println("The number is Odd");
					}	

			}
}