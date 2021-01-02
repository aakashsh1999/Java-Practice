//Program to Create Directory in the Parent Folder

import java.io.*;
class CreateDir
{
		public static void main(String args[])
			{	try{
			//Creating a file object
				File fr=new File("C:/Users/Aakash Sharma/Java");
				boolean result=fr.mkdir();
				if(result)
				{
					System.out.println("The File Created Successfully");

				}
				else
				{
					System.out.println("Error");
				}
			}
			catch(Exception e)
				{
					
				}


			}

}	