
//Pattern Programs
public class pattern1
{
	public static void main(String arg[])
		{
			int i,j;
			for(i=1;i<=5;i++)
				{
					for(j=4;j>=i;j--)
						{
						System.out.print(" ");
						}
						System.out.println();
				for(int k=1;k<=i;k++)
				{
				System.out.print("*");
				}
			}
		}
}