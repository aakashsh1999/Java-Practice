//Program to illustrate the write in a file Using BufferedOUtputStream
import java.io.*;
import java.util.*;
class file3
{
	public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence you want to enter");
		try{
		FileOutputStream fout=new FileOutputStream("b.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fout);
		String s;
		s=sc.nextLine();
					//We Cannot write the String directly in the file 
					//We have to convert it to the Byte 
		byte b[]=s.getBytes();
		bos.write(b);
		System.out.println("File Written Successful!");
		bos.close();
		fout.close();
		}
		catch(IOException e)
		{
		System.out.println("Unable to Create File");
		}




		}
}

