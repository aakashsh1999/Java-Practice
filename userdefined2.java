//Program to create a User DEfined exception
import java.util.*;

class SampleException
{
		static void validateInput(int number) throws InvalidInputException
			{
			if(number>100)
				{
						throw new InvalidInputException("Exception");
				}
				System.out.println("Valid Input");
			}
	public static void main(String args[])
		{
				Scanner sc=new Scanner(System.in);
				int number;
				System.out.println("Enter the number");
				number=sc.nextInt();
				try
				{
				validateInput(number);
				}
				catch(InvalidInputException e)
						{
						System.out.println("Exception is Caugth");
						}

		}
	}
class InvalidInputException extends Exception
{
		InvalidInputException(String exceptionText)
		{
			super(exceptionText);
		}

}