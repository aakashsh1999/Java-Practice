//Program to check if the given character is vowel or consonant
import java.util.*;
class checkchar
{
	public static void main(String args[])
		{
		Scanner s=new Scanner(System.in);
		char c;
		System.out.println("Enter the character");
		c=s.next().charAt(0);

			if(c=='a' || c=='i' || c=='e'|| c=='o' ||c=='u')
				{
				System.out.println("The character is vowel");
				}
			else
				{
				System.out.println("The character is Consonant");
				}

		}
}