//Program to find the sum of Array Elements
import java.util.*;
class SumArray{
	public static void main(String args[])
		{

			int n;
			int sum=0;
			int[] x=new int[20];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of element you want to Enter");
			n=sc.nextInt();
			System.out.println("Enter the elements");
			for(int i=0;i<n;i++)
				{
						x[i]=sc.nextInt();					
				}
					for(int i=0;i<n;i++)
				{
					sum=sum+x[i];

				}
				System.out.println("The sum of the Array List is" +sum);

		}
}