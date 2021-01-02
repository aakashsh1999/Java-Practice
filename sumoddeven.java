//Program to calculate the sum of odd and even numbers
import java.util.*;
class SumOddEven
{	
	int[] a=new int[10];
	int sumodd=0;
	int sumeven=0;
	void input()
		{
		System.out.println("Enter the Numbers till 10");
				Scanner s=new Scanner(System.in);
			for(int i=0;i<a.length;i++)	
				{
				  a[i]=s.nextInt();
				}
		}


	void sumEven()
			{
					for(int i=0;i<a.length;i++)
					{
						if(a[i]%2==0)
						{
						sumeven=sumeven+a[i];
					}
				}
				System.out.println("The sum of Even numbers is "+sumeven);
			}
	void sumOdd()
		{
				for(int i=0;i<a.length;i++)
					{
						if(a[i]%2!=0)
						{
						sumodd=sumodd+a[i];
					}
				}
				System.out.println("The sum of odd numbers is"+sumodd);
		}

	public static void main(String args[])
		{
		
			SumOddEven n=new SumOddEven();
			n.input();
			n.sumEven();
			n.sumOdd();
		}	
}

