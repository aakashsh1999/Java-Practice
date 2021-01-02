//Program to swap two numbers using class
import java.util.*;
class Swap{
	int n1, n2;
	void input(int n1, int n2)
		{	
		this.n1=n1;
		this.n2=n2;
		}
		void swap()
		{
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		}
		void print()
			{
			System.out.println("The Number  is" +n1+" "+n2);
			}
			public static void main(String args[])
				{
					Scanner sc=new Scanner(System.in);
					System.out.println("enter the Two Numbers");
					int n,m;
					n=sc.nextInt();
					m=sc.nextInt();
					Swap s=new Swap();
					s.input(n,m);
					s.print();
					s.swap();
					s.print();
				}
		
}