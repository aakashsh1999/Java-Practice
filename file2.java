//Program to illustrate the write operation in the file Using FileInputStream
import java.io.*;
import java.util.*;
class file2{
	public static void main(String args[])
		{
				Scanner sc=new Scanner(System.in);

				FileOutputStream ofile=null;1
					try{
					ofile=new FileOutputStream("z.txt");
					ofile.write(b1);
					System.out.println("File Written Successful!");
					ofile.close();
								}
					catch(IOException e)
						{
							System.out.println("File Creation Error");
						}


		}

}