//Program to create a Temp File
import java.io.*;
import java.util.*;
class EmptyFile
{
	public static void main(String arg[])
		{
			try
			{
				File ofile=null;
				ofile=File.createTempFile("hello", ".java");
				
					System.out.println("File Created Successfully" +ofile.getPath());
				}
				catch(Exception e)
					{
						System.out.println("Invalid File Path or Details");
					}

		}
}