//Program to read the file Using Byte Input Stream

import java.io.*;

class file3read{
		public static void main(String args[])	throws FileNotFoundException
			{
				FileInputStream fin=new FileInputStream("b.txt");
				BufferedInputStream bis=new BufferedInputStream(fin);
				try
				{
				int b;
				while((b=bis.read())!=-1)
					{
					System.out.print((char)b);
					}
					bis.close();
					fin.close();
				}
				catch(IOException e)
					{
					System.out.println("Unable to Read File");
					}



			}
	
}


