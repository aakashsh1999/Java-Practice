//Program to illustrate the write of file In 
import java.util.*;
import java.io.*;

class file4{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			try{
			String s;
			System.out.println("Enter the String You want to Enter");
			s=sc.nextLine();
			File outfile=new File("c.txt");		//Creating the file Object
			FileWriter fw=null;	//Creating the FileWriter Object
			fw=new FileWriter(outfile);
			fw.write(s);
			fw.close();
			}
			catch(IOException e)
				{
				System.out.print("Unable to write Into the file");
			}
		}
}
