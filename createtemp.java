//Program to create a temp file in java
import java.io.*;
class Tempfile
{
	public static void main(String args[])
		{
		try{
						File one=null;
				File two=null;
				one=File.createTempFile("Sample1",".java");
				two=File.createTempFile("Sample1","null");
			System.out.println("File created Successuflyy" +one.getPath());
			System.out.println("File created Successuflyy" +two.getPath());
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}


		}
}