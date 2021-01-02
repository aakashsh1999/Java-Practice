//Program to check the biggest number between the three numbers
import java.util.*;

class Max
{
	public static void main(String aaksh[])
		{
			int max=0	;
		Scanner s=new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter the Three numbers ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();

		if(a>b && a>c)
			{
					max=a;
			}
		else if(b>c && b>a)
			{
			max=b;
			}
		else
		{
		max=c;
		}
		System.out.println("The maximum between the three digit is: "+max);
		}
}