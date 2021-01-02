//Program to creata Directory
import java.io.*;
import java.util.*;
class EmptyDir
{
	public static void main(String args[])
			{
			Scanner sc=new Scanner(System.in);
			String path;
			System.out.println("Enter the Path");
			path=sc.next();
			System.out.println("Enter the directory name");
			path=path+sc.next();
			try
			{
			File f=new File(path);
			boolean result=f.mkdir();
			if(result)
					{
						System.out.println("File Created SuccessFully");
					}
					else{
					System.out.println("Invalid Path");
					}
			}
			catch(Exception e)
				{
				System.out.println("Error Occur");
				}
		}
}