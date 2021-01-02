//Program to reverse a number
import java.util.*;
class reverse
{
	public static void main(String args[])
		{
			int num, digit, rev=0;
			Scanner n=new Scanner(System.in);
			System.out.println("Enter the digit you want to reverse");
			num=n.nextInt();
			while(n>0)
				{
					digit=num%10;
					rev=(rev*10)+digit;
					num=num/10;
				}
			System.out.println("The number after reverse is" +rev);
		}
}