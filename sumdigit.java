//Program to sum of the digit

class sumdigit
{
	public static void main(String args[])
		{
			int x=5203;
				int digit, sum=0;
			while(x>0)
				{
					digit=x%10;
					sum=sum+digit;
					x=x/10;
				}	
			System.out.println("The Sum of digit 5203 is" +sum);

		}
}