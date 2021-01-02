//Program to create a temp file in the specified

import java.io.*;
class CreateTemp
{
	public static void main(String a[])
		{
			try{
			File infile=null;
			infile=new File("C:/Users/Aakash Sharma/Desktop/");
				infile.createTempFile();
			System.out.println("The File is created Successfully");
				infile.close();
			}
			catch(Exception e)
			{
			}
		}
}