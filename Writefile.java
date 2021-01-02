import java.io.*;
class WriteFile
{
public static void main(String args[])
{
 byte i;
 try{
FileWriter fr=null;
File f=new File("a.txt");
fr=new FileWriter(f);
for(i=00000000;i<=99999999;i++)
	{
		fr.write(i);
	}

fr.close();
}	
catch(Exception  e)
	{
		
	}

}
}