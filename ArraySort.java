//Program to sort the array
import java.util.*;
import java.io.*;
class SortAsc
{
	public static void main(String args[])
		{
			try{
			Scanner sc=new Scanner(System.in);
			int[] arr=new int[50];
			int temp, n, t;
			char c;
			System.out.println("Do You want to create a File ('Y' Or 'N')");
			c=sc.next().charAt(0);
					System.out.println("Enter the file name");
					String st=sc.nextLine();
			if(c=='Y'||c=='y')
				{	
			
					File fr=new File("C:/Users/Aakash Sharma/Desktop");
					File result=null;
					result=File.createTempFile(st ,".txt",fr);
					System.out.println("File Create Successfully" +fr.getPath());
				}
			else
			{
				System.out.println("Exiting the Program");
			}	
			}
			catch(IOException e)
				{
					System.out.println("Error occured");
				}


		}
}