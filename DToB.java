//Program to convert the decimal digit to binary
import java.util.Scanner;
class Dectobin
{
	public static void main(String args[])
			{
			int decimal;
			int[] binary=new int[20];
			Scanner sc=new Scanner(System.in);
			decimal=sc.nextInt();
			for(int i=0;i<binary.length;i++)
				{
					binary[i]=decimal%2;
				}
				System.out.println("The binary digit is:");
				for(int i=0;i<binary.length;i++)
					{
					System.out.print(binary[i]);
					}


			}
}