//Program to reverse a string

import java.util.*;

class RevString
{
	public static void main(String aakas[])
		{		char[] c=new char[50];
			char[] name=new char[50];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String");
	for(int i=0;i<=name.length;i++)
	{
			name[i]=sc.next().charAt(0);		
		}
			for(int i=name.length-1;i>=0;i--)
					{
						c[i]=name[i];
					}
				System.out.println("The String after reversing it"+name);




		}
}