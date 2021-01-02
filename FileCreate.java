//Program to create Temporary file in a specified folder
import java.io.*;
class TempFile
{
	public static void main(String args[])
		{
				//Create File Object;
				File result=null;
				//Creating the temp file object;
				File temp=new File("C:/Users/Aakash Sharma");
				try
				{
					result=File.createTempFile("JavaTemp", ".javatemp", temp);//Name, extesion, objecet
				}
				catch(Exception e)
					{
						System.out.println("Exception found" +e);
					}
			System.out.println("File Created Successfully" +temp.getPath());//file path


		}
}