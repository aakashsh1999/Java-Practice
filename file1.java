//Program to illustrate the file handling and FileInputStream 

import java.io.*;
class file1
{
	public static void main(String args[]) throws FileNotFoundException, IOException
		{
		FileInputStream infile=null;
		infile=new FileInputStream("z.txt");
		int b;
			while((b=infile.read())!=-1)
					{
					System.out.print((char)b);
						}

			infile.close();
	}	
}