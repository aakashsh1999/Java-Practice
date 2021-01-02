//Program to read the file Using file reader

import java.io.*;

class file4read{
	public static void main(String args[]) throws IOException, FileNotFoundException
	{
			File fin=new File("c.txt");
			FileReader fr=null;
			fr=new FileReader(fin);
			int b;
			while((b=fr.read())!=-1)
				{
					System.out.print((char)b);
				}
			fr.close();

		}

}

