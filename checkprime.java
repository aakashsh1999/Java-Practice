//program to check number is prime or not
import java.util.*;
class Prime
{
	public static void main(String args[])
		{
			int n, j=2, ch=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number to check");
			n=sc.nextInt();
			if(n<=1)
				{
				ch=1;	//check for 1
				}
			while(j<=n/2)
				{
				if(n%j==0)
						{
						ch=1;
						}
				else{
				j++;
				}
			}
				if(ch==0){
					System.out.println("Prime number");}
					else
						{System.out.println("Not Prime");}

		}

}