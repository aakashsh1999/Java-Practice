//Program to illustrate the Read from one file and write to another file

import java.io.*;
class filereadwrite
{
		public static void main(String aakash[]) throws FileNotFoundException, IOException
			{
				File infile=new File("z.txt");
				File outfile=new File("c.txt");
				FileReader fr=null;
				FileWriter fw=null;
				fr=new FileReader(infile);
				fw=new FileWriter(outfile);
				int b;
				while((b=fr.read())!=-1)
					{
						fw.write(b);
					}
				System.out.println("File Read-Write Opeartion is Successful");
				fw.close();
				fr.close();
		}
}