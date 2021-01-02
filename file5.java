//Program to illustrate the ByteArrayInputStream 
import java.io.*;

class file5
{
		public static void main(String args[])	throws IOException
		{
			FileOutputStream fout=new FileOutputStream("z.txt");

			FileOutputStream fouta=new FileOutputStream("b.txt");
			ByteArrayOutputStream b1=new ByteArrayOutputStream();
			int a=55;
			b1.write(a);
			b1.writeTo(fout);
			b1.writeTo(fouta);
			b1.flush();
			b1.close();



		}
}